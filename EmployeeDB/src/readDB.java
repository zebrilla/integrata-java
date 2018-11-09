
import java.sql.*;

public class readDB {




   public static void main(String[] args) {
      Connection connection;
      Statement statement;

      try{			
    	 System.out.println("Connecting DB");
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         connection=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\W8Admin\\eclipse-workspace\\EmployeeDB\\Datenbanken\\EmployeeDB.mdb","","");

         statement=connection.createStatement();
                          
         System.out.println();        
         System.out.println("Employees in Database \n");  
         
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
