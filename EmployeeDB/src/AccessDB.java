import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessDB {
	
	private Connection connection;
	private Statement statement;
	
	public void openDB(){
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");			
			connection=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\W8Admin\\eclipse-workspace\\EmployeeDB\\Datenbanken\\EmployeeDB.mdb","","");
	        statement = connection.createStatement();
		}catch (SQLException exc) {System.out.println("Open:SQLException");}
		catch (ClassNotFoundException exc) {System.out.println("Open:ClassNotFoundException");}
	}

	public void closeDB() {
		try {
			statement.close();
			connection.close();
		}catch (Exception exc) {}
	 }
	
	public void read(Employee employee) {
		try {
	        
			String sql = "SELECT a.EmployeeID, a.EmployeeLastname, a.EmployeeFirstname, b.Street, b.City "
						+ "from Employee a left outer join Adress b on a.EmployeeID = b.EmployeeID "
						+ "WHERE a.EmployeeID = \'" + employee.getEmployeeID() + "\'";
			ResultSet rs =  statement.executeQuery(sql);
			rs.next();		
			employee.setEmployeeLastname(rs.getString(2)); 
			employee.setEmployeeFirstname(rs.getString(3)); 
			employee.adress.setEmployeeStreet(rs.getString(4));
			employee.adress.setEmployeeCity(rs.getString(5));
			System.out.println("\nEmployee record found and displayed in form.");
		}catch (SQLException exc) {System.out.println("\nEmployee record not found.");}
			
	}
	
	public boolean newrec(Employee employee) {

		boolean ret = false;	
		
		try {
	         String sql = "INSERT INTO Employee VALUES(";
	               sql += "\'" + employee.getEmployeeID()	+ "\',";
	               sql += "\'" + employee.getEmployeeLastname()	+ "\',";
	               sql += "\'" + employee.getEmployeeFirstname()	+ "\');";
	          	   sql += "INSERT INTO Adress VALUES(";
	               sql += "\'" + employee.getEmployeeID()	+ "\',";
	               sql += "\'" + employee.adress.getEmployeeStreet()	+ "\',";
	               sql += "\'" + employee.adress.getEmployeeCity()	+ "\');";
	               	               
	               System.out.println(sql);      
	               				
		   	ret = statement.execute(sql); 		
			return true;
			
		}catch (SQLException e) {System.out.println("Anlegen: SQLException");}
		
		return ret;
	}


	
	/*
	
	public void lesen(Fahrzeug g) {
		try {
			String sql = "SELECT fin, hersteller, name, strasse, wohnort FROM Fahrzeug WHERE fin = \'" + g.getFIN() + "\'";
			ResultSet rs =  statement.executeQuery(sql);
			rs.next();		
			g.setHersteller(rs.getString(2)); 
			g.e.setName(rs.getString(3)); 
			g.e.a.setStrasse(rs.getString(4));
			g.e.a.setWohnort(rs.getString(5));
			System.out.println("Datensatz wurde gelesen.");
		}catch (SQLException e) {System.out.println("Lesen ist nicht möglich.");}
			
	}
	
	public boolean aktualisieren(Fahrzeug f) {
		boolean ret = false;
		try {
			String sql = "UPDATE Fahrzeug SET ";
				   sql += "hersteller = \'" + f.getHersteller() 	+ "\',";
				   sql += "name = \'" 	+ f.e.getName() 		+ "\',";
				   sql += "strasse = \'" 	+ f.e.a.getStrasse()	+ "\',";
				   sql += "wohnort = \'" 	+ f.e.a.getWohnort()	+ "\' ";
				   sql += " WHERE fin = \'" + f.getFIN() + "\'";	   
			int x = statement.executeUpdate(sql);
			if(x==1)
				ret=true;
			else
				ret=false;
		}catch (SQLException e) {System.out.println("Aktualisieren: SQLException");}
		
		return ret;
	}
	
	public boolean loeschen(Fahrzeug f) {
		boolean ret = true;
		String sql = "DELETE FROM Fahrzeug WHERE fin = \'" + f.getFIN() + "\'";
		try {
			int x = statement.executeUpdate(sql);
			if(x==1)
				ret=true;
			else
				ret=false;
		}catch (SQLException e) {System.out.println("Loeschen: SQLException"); }
		return ret;
	}
	
	
	
	*/
}
