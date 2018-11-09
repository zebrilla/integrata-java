
import java.sql.*;
public class DBread {
    public static void main(String[] args) {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	try{					
	    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
   	    connection=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\W8Admin\\Datenbanken\\Test.mdb","","");
	    statement=connection.createStatement();	
	    resultSet=statement.executeQuery("SELECT * From Kunden");
	    ResultSetMetaData rsmd = resultSet.getMetaData();
	    for (int i = 1; i <= rsmd.getColumnCount();i++) {
	    	System.out.print(rsmd.getColumnName(i)+"\t");
	    }
	    System.out.println();
	    while(resultSet.next())
		System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4));
	    statement.close();
	    connection.close();
	}
	catch (ClassNotFoundException e){
	    System.out.println("Fehler bei der Verbindung:  "+e);
	}
	catch (SQLException e){
	    System.out.println("Fehler bei der Tabellenabfrage  "+e);
	}
    }
}
