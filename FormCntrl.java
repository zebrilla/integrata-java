
public class FormCntrl {

	EmployeeForm employeeForm ;
	private AccessDB accessDB = new AccessDB();
	
    Employee employee = new Employee();
	
	public FormCntrl(EmployeeForm employeeForm){
		this.employeeForm = employeeForm;
	}
	
	public void newR(){	


		String ID 					= employeeForm.IDTextfield.getText();
		
        System.out.println("Insert new Employee: "+ ID);
        
		String employeeLastname 	= employeeForm.LastnameTextfield.getText();
		String employeeFirstname 	= employeeForm.FirstnameTextfield.getText();
		String employeeStreet 		= employeeForm.StreetTextfield.getText();
		String employeeCity 		= employeeForm.CityTextfield.getText();
		
		employee.setEmployeeID(ID);
		employee.setEmployeeLastname(employeeLastname);
		employee.setEmployeeFirstname(employeeFirstname);
		employee.adress.setEmployeeStreet(employeeStreet);
		employee.adress.setEmployeeCity(employeeCity);
		
		accessDB.openDB();
		
		boolean nonexists = accessDB.newrec(employee);
		
		if(nonexists){
			System.out.println("New Employee: "+ ID+" inserted");
			employeeForm.IDTextfield.setText("");
			employeeForm.LastnameTextfield.setText("");
			employeeForm.FirstnameTextfield.setText("");
			employeeForm.StreetTextfield.setText("");
			employeeForm.CityTextfield.setText("");
		}else {
			System.out.println("Employee: "+ ID+" already exists");
		}
		accessDB.closeDB();
        
	};
	
	public void readR() {
        
		String ID = employeeForm.IDTextfield.getText();
		
        System.out.println("/nRead Employee: "+ ID);
        
		employee.setEmployeeID(ID);
		employee.setEmployeeLastname("");
		employee.setEmployeeFirstname("");
		employee.adress.setEmployeeStreet("");
		employee.adress.setEmployeeCity("");
		
		accessDB.openDB();
		
		accessDB.read(employee);
		
		String employeeLastname = employee.getEmployeeLastname();
		String employeeFirstname = employee.getEmployeeFirstname();
		String employeeStreet = employee.adress.getEmployeeStreet();
		String employeeCity = employee.adress.getEmployeeCity();
		
		employeeForm.LastnameTextfield.setText(employeeLastname);		
		employeeForm.FirstnameTextfield.setText(employeeFirstname);
		employeeForm.StreetTextfield.setText(employeeStreet);
		employeeForm.CityTextfield.setText(employeeCity);
		accessDB.closeDB();
        
	};
	
	public void updateR(){
		
        System.out.println("Update Employee");
        
        };
        
    public void displayR(){
    		
        System.out.println("Display all Employees");

		new EmployeeDisplayForm();
            
        };    
        
	public void deleteR(){
		
        System.out.println("Delete Employee");
        
        };
	
}
