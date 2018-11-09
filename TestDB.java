
import java.sql.*;


//Programm zum anlegen der notwendigen Tabellen

public class TestDB {
   public static void main(String[] args) {
      Connection connection;
      Statement statement;

      boolean ResultSetBool = false ;
      System.out.println("0");
      try{			
    	  System.out.println("1");
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         
         System.out.println("2");
         connection=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\W8Admin\\eclipse-workspace\\AngestelltenVerwaltungDB\\Datenbanken\\AngestelltenDB.mdb","","");
 	    
         System.out.println("3");
         statement=connection.createStatement();
         System.out.println("4");
         statement.execute("drop table Angestellter");  //vorher: statement.execute("drop table Fahrzeug");
         
         System.out.println("5");
         
         statement.execute("create table Angestellter (id char(30) , abteilung char(30) , name char(30) , strasse char(30) , wohnort char(30) )");

         System.out.println("6");
         
         statement.execute("create unique index pk on  Angestellter (id)");  // ucanaccess4.0.4
        
         System.out.println("7");
         statement.executeUpdate( "INSERT INTO Angestellter VALUES ( '1','Marketing','Clausen','Waldstrasse 21', '20097 Hamburg')" ); 
         //statement.executeUpdate( "INSERT INTO Angestellter VALUES ( '2','Vertrieb','Jansen','Holtenauer Str. 128', '24116 Kiel')" ); 
         System.out.println("8");
      
         ResultSet resultSet;
         resultSet=statement.executeQuery("SELECT * From Angestellter");
         while(resultSet.next())
            System.out.println(resultSet.getString(1) +" \t\t"+resultSet.getString(2)+" \t\t"+resultSet.getString(3)+" \t\t"+resultSet.getString(4)+" \t\t"+resultSet.getString(5));
           
         statement.close();
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


