
import java.sql.*;


//Programm zum anlegen der notwendigen Tabellen

public class InitDB {
   public static void main(String[] args) {
      Connection connection;
      Statement statement;

      boolean ResultSetBool = false ;
      try{			
    	 System.out.println("Connecting DB");
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         connection=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\W8Admin\\eclipse-workspace\\EmployeeDB\\Datenbanken\\EmployeeDB.mdb","","");

         statement=connection.createStatement();
         
         DatabaseMetaData md = connection.getMetaData();
                 
         System.out.println("Drop existing tables");
         
         ResultSet rs1 = md.getTables(null, null, "%", null);
         while (rs1.next()) {
           System.out.println(rs1.getString(3));
           statement.execute("drop table "+rs1.getString(3));           
         }
         
         System.out.println();
         
         System.out.println("Create table Employee");
         statement.execute("create table Employee (EmployeeID char(30), EmployeeLastname char(30) , EmployeeFirstname char(30) )");
         statement.execute("create unique index EmpKey on  Employee (EmployeeID)");          

         System.out.println("Create table Adress");
         statement.execute("create table Adress (EmployeeID char(30), Street char(30) , City char(30) )");
         statement.execute("create unique index AdrKey on  Adress (EmployeeID)");          

         System.out.println();
         
         ResultSet rs2 = md.getTables(null, null, "%", null);
         while (rs2.next()) {
           System.out.println(rs2.getString(3)+" created");         
         }

         System.out.println();        
         System.out.println("Insert initial Employee");  
         
         statement.executeUpdate( "INSERT INTO Employee VALUES ( 'U089429','Simon','Anja')" ); 
         statement.executeUpdate( "INSERT INTO Employee VALUES ( 'U012345','Mouse','Mickey')" ); 
         statement.executeUpdate( "INSERT INTO Employee VALUES ( 'U012346','Mouse','Minni')" ); 
         
         System.out.println();        
         System.out.println("Insert initial Adresses");  
         
         statement.executeUpdate( "INSERT INTO Adress VALUES ( 'U089429','Holunderweg 37','63486 Bruchköbel')" ); 
         statement.executeUpdate( "INSERT INTO Adress VALUES ( 'U012345','Entenweg 3','12345 Entenhausen')" ); 
         statement.executeUpdate( "INSERT INTO Adress VALUES ( 'U012346','Mauspfad 7b','12345 Entenhausen')" ); 


         System.out.println();        
         System.out.println("Initial Employees");  
         
         ResultSet rs3;
         rs3=statement.executeQuery("SELECT a.*, b.Street, b.City From Employee a left outer join Adress b on a.EmployeeID = b.EmployeeID");
         while(rs3.next())
             System.out.println(rs3.getString(1) +" \t\t"+rs3.getString(3)+" "+rs3.getString(2)+" \t\t"+rs3.getString(4)+" \t\t"+rs3.getString(5));

         
         connection.close();


      }
      catch (ClassNotFoundException e){
         System.out.println("Fehler bei JDBC-ODBC Verbindung:  "+e);
      }
      catch (SQLException e){
         System.out.println("Fehler bei der Tabellenabfrage  "+e);
      }

   }
}


