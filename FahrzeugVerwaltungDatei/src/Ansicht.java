import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class Ansicht extends JFrame implements ActionListener{
	JTextField FINTextfeld;
	JTextField HerstellerTextfeld;
	JTextField NameTextfeld;
	JTextField StrasseTextfeld;
	JTextField WohnortTextfeld;
	
	Steuerung steuerung = new Steuerung(this);
	
	public Ansicht(){
		
		setJMenuBar(new MeineMenuBar(this));
		
		JLabel FINLabel = new JLabel("FIN");
		JLabel HerstellerLabel = new JLabel("Hersteller");
		JLabel NameLabel = new JLabel("Name");
		JLabel StrasseLabel = new JLabel("Strasse");
		JLabel WohnortLabel = new JLabel("Wohnort");
		
		FINTextfeld = new JTextField();
		HerstellerTextfeld = new JTextField();
		NameTextfeld = new JTextField();
		StrasseTextfeld = new JTextField();
		WohnortTextfeld = new JTextField();
		
		JButton ButtonAnlegen = new JButton("Anlegen");
		JButton ButtonLesen = new JButton("Lesen");
		JButton ButtonAktualisieren = new JButton("Aktualisieren");
		JButton ButtonLoeschen = new JButton("Löschen");
		JButton ButtonReset = new JButton("Rücksetzen");
		
		JPanel PanelLabel = new JPanel();
		JPanel PanelTextField = new JPanel();
		JPanel PanelButton = new JPanel();
		
		PanelLabel.setLayout(new GridLayout(5,1));
		PanelLabel.add(FINLabel);
		PanelLabel.add(HerstellerLabel);
		PanelLabel.add(NameLabel);
		PanelLabel.add(StrasseLabel);
		PanelLabel.add(WohnortLabel);
		
		PanelTextField.setLayout(new GridLayout(5,1));
		PanelTextField.add(FINTextfeld);
		PanelTextField.add(HerstellerTextfeld);
		PanelTextField.add(NameTextfeld);
		PanelTextField.add(StrasseTextfeld);
		PanelTextField.add(WohnortTextfeld);
		
		PanelButton.setLayout(new GridLayout(1,5));
		PanelButton.add(ButtonAnlegen);
		PanelButton.add(ButtonLesen);
		PanelButton.add(ButtonAktualisieren);
		PanelButton.add(ButtonLoeschen);
		PanelButton.add(ButtonReset);				
		PanelButton.setSize(600, 50);				
		
		
		setLayout(new BorderLayout());
		add(PanelLabel, BorderLayout.WEST);
		add(PanelTextField, BorderLayout.CENTER);
		add(PanelButton, BorderLayout.SOUTH);
		
		
		ButtonAnlegen.addActionListener(this);
		ButtonLesen.addActionListener(this);
		ButtonAktualisieren.addActionListener(this);
		ButtonLoeschen.addActionListener(this);
		ButtonReset.addActionListener(this);	
		
		setLocation(200,200);
		setSize(600,220);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void actionPerformed(ActionEvent e){
		String name = e.getActionCommand();
		//System.out.println(name);
		switch(name){
			case "Anlegen":
				steuerung.anlegen();
				break;
			case "Lesen":
				steuerung.lesen();
				break;
			case "Aktualisieren":
				steuerung.aktualisieren();
				break;
			case "Löschen":
				steuerung.loeschen();
				break;
			case "Rücksetzen":
				reset();	
				break;
			default:
				System.exit(0);	
		}	
	}
	
	public void reset() {
		System.out.println("Reset");
		FINTextfeld.setText("");
		HerstellerTextfeld.setText("");
		NameTextfeld.setText("");
		StrasseTextfeld.setText("");
		WohnortTextfeld.setText("");	
	}
	
}
