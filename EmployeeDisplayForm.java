
	import java.awt.BorderLayout;
	import java.awt.GridLayout;
	import java.awt.event.*;

	import javax.swing.*;

	public class EmployeeDisplayForm  extends JFrame {
		
		JTextField IDTextfield;
		JTextField LastnameTextfield;
		JTextField FirstnameTextfield;
		JTextField StreetTextfield;
		JTextField CityTextfield;
				
	//	FormCntrl formDispCntrl = new FormDispCntrl(this);
		
		
		public EmployeeDisplayForm(){
			
	        
		//	setJMenuBar(new EmployeeMenuBar(this));	
			
		    AccessDB accessDB = new AccessDB();
		    
		    String [][] disp = new String[20][5];
		    
		    disp =		accessDB.display();
			
		//	String[] emplist = new 
			
			JLabel AllLabel = new JLabel("All Employees");
			JLabel IDLabel = new JLabel("Employee ID");
			JLabel LNameLabel = new JLabel("Lastname");
			JLabel FNameLabel = new JLabel("Firstname");
			JLabel StreetLabel = new JLabel("Street");
			JLabel CityLabel = new JLabel("City");
			
			JPanel PanelLabel = new JPanel();
			PanelLabel.setLayout(new GridLayout(22,5));
			
			PanelLabel.add(IDLabel);
			PanelLabel.add(LNameLabel);
			PanelLabel.add(FNameLabel);
			PanelLabel.add(StreetLabel);
			PanelLabel.add(CityLabel);
			
			
			for(int i=0;i<20;i++)
			 for(int j=0;j<5;j++)
			   {
				JLabel EmpLabel = new JLabel(disp[i][j]);
			    PanelLabel.add(EmpLabel);
			   }
		

						
			
			

		//	PanelLabel.add(AllLabel);
												
			setLayout(new BorderLayout());
			add(PanelLabel, BorderLayout.CENTER);
			
	
			
			setLocation(200,200);
			setSize(600,220);
			setVisible(true);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	        
		}

				
			
		
	}
