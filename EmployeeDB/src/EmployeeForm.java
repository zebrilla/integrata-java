		
	import java.awt.BorderLayout;
	import java.awt.GridLayout;
	import java.awt.event.*;

	import javax.swing.*;

	
	public class EmployeeForm extends JFrame implements ActionListener{
		
		JTextField IDTextfield;
		JTextField LastnameTextfield;
		JTextField FirstnameTextfield;
		JTextField StreetTextfield;
		JTextField CityTextfield;
				
		FormCntrl formCntrl = new FormCntrl(this);
		
		
		public EmployeeForm(){
			
	        
			setJMenuBar(new EmployeeMenuBar(this));	
			
			JLabel IDLabel = new JLabel("ID");
			JLabel LastnameLabel = new JLabel("Lastname");
			JLabel FirstnameLabel = new JLabel("Firstname");
			
			JLabel StreetLabel = new JLabel("Street");
			JLabel CityLabel = new JLabel("City");
			
			IDTextfield = new JTextField();
			LastnameTextfield = new JTextField();
			FirstnameTextfield = new JTextField();
			StreetTextfield = new JTextField();
			CityTextfield = new JTextField();
			
			JButton ButtonNew = new JButton("New");
			JButton ButtonRead = new JButton("Read");
			JButton ButtonUpdate = new JButton("Update");
			JButton ButtonDelete = new JButton("Delete");
			JButton ButtonDisplay = new JButton("Display");
			JButton ButtonReset = new JButton("Reset");
			
			JPanel PanelLabel = new JPanel();
			JPanel PanelTextField = new JPanel();
			JPanel PanelButton = new JPanel();
			
			PanelLabel.setLayout(new GridLayout(5,1));
			PanelLabel.add(IDLabel);
			PanelLabel.add(LastnameLabel);
			PanelLabel.add(FirstnameLabel);
			PanelLabel.add(StreetLabel);
			PanelLabel.add(CityLabel);
			
			PanelTextField.setLayout(new GridLayout(5,1));
			PanelTextField.add(IDTextfield);
			PanelTextField.add(LastnameTextfield);
			PanelTextField.add(FirstnameTextfield);
			PanelTextField.add(StreetTextfield);
			PanelTextField.add(CityTextfield);
			
			PanelButton.setLayout(new GridLayout(1,5));
			PanelButton.add(ButtonNew);
			PanelButton.add(ButtonRead);
			PanelButton.add(ButtonUpdate);
			PanelButton.add(ButtonDelete);
			PanelButton.add(ButtonDisplay);
			PanelButton.add(ButtonReset);				
			PanelButton.setSize(600, 50);				
			
			
			setLayout(new BorderLayout());
			add(PanelLabel, BorderLayout.WEST);
			add(PanelTextField, BorderLayout.CENTER);
			add(PanelButton, BorderLayout.SOUTH);
			
			ButtonNew.addActionListener(this);
			ButtonRead.addActionListener(this);
			ButtonUpdate.addActionListener(this);
			ButtonDelete.addActionListener(this);
			ButtonDisplay.addActionListener(this);
			ButtonReset.addActionListener(this);	
			
			setLocation(200,200);
			setSize(600,220);
			setVisible(true);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	        
		}

				
	        
		public void actionPerformed(ActionEvent e){
			String eventName = e.getActionCommand();
			switch(eventName){
				case "New":
					formCntrl.newR();
					break;
				case "Read":
					formCntrl.readR();
					break;
				case "Update":
					formCntrl.updateR();
					break;
				case "Delete":
					formCntrl.deleteR();
					break;
				case "Display":
					formCntrl.displayR();
					break;
				case "Reset":
					reset();	
					break;
				default:
					System.exit(0);	
			}	
		}
		
		public void reset() {
			System.out.println("Reset");
			IDTextfield.setText("");
			LastnameTextfield.setText("");
			FirstnameTextfield.setText("");
			StreetTextfield.setText("");
			CityTextfield.setText("");	

		}
			
		
	}


