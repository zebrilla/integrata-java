import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Hinzufügen von JPanels und JLabels und 
 * verwenden eines GridBagLayouts
 */
class GridbagLayout1 extends JFrame{
public GridbagLayout1(){
	super("GridBagLayout");
	setDefaultCloseOperation(
		JFrame.EXIT_ON_CLOSE);
	
	//Einstellen eines GridBagLayouts
	GridBagLayout gbl = 
		new GridBagLayout();
	
	getContentPane().setLayout(gbl);
/*
	 * Hier wird ein GridBagConstraint-Objekt 
	 * erstellt
	 */
	GridBagConstraints gbc = 
		new GridBagConstraints();
	
	/*
	 * Einstellen der Constraints und 
	 * Hinzufügen der Objekte
	 */
	 	
	//Label
	gbc.gridwidth = 
		GridBagConstraints.REMAINDER;
	gbc.gridheight = 1;
	gbc.weightx = 1;
	gbc.weighty = 1;
	gbc.anchor = 
		GridBagConstraints.LINE_START;
	
	//Konstruktor Insets: oben, links, unten, rechts
	gbc.insets = new Insets(0,20,5,0);
	
	JLabel label = new JLabel(
		"Autobörse: Kfz-Verkauf");
	
	gbl.setConstraints(label, gbc);
	getContentPane().add(label);

	//Label
	gbc.gridwidth = 1;
	gbc.insets = new Insets(0,0,0,0);
	
	label = new JLabel("Fahrzeugtyp:");
	gbl.setConstraints(label, gbc);
	getContentPane().add(label);
	
	//ComboBox für Fahrzeugtyp
	gbc.gridwidth = GridBagConstraints.REMAINDER;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.weightx = 3;
	gbc.insets = new Insets( 0, 5, 0, 5);
	
	String[] strArray = {
		"Sportwagen",
		"Limosine",
		"Coupe",
		"Transporter",
		"Bus",
		"Lkw",
		"Motorrad"};
	
	JComboBox cmbType = new JComboBox(strArray);
	gbl.setConstraints(cmbType, gbc);
	getContentPane().add(cmbType);
	
	//Label
	gbc.gridwidth = 1;
	gbc.insets = new Insets(0,0,0,0);
	gbc.weightx = 1;
	
	label = new JLabel("Beschreibung:");
	gbl.setConstraints(label, gbc);
	getContentPane().add(label);
	
	//TextArea für die Beschreibung
	gbc.gridwidth = GridBagConstraints.REMAINDER;
	gbc.gridheight = 3;
	gbc.fill = GridBagConstraints.BOTH;
	gbc.weightx = 10;
	gbc.weighty = 10;
	gbc.insets = new Insets( 0, 5, 0, 5);

	JTextArea txtExpl = new JTextArea("Beschreibung");
	JScrollPane scrollPane = new JScrollPane(txtExpl);
	scrollPane.setVerticalScrollBarPolicy(
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	scrollPane.setHorizontalScrollBarPolicy(
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	gbl.setConstraints(scrollPane, gbc);
	getContentPane().add(scrollPane);
	
	//Label
	gbc.gridwidth = 1;
	gbc.insets = new Insets(0,0,0,0);
	gbc.weightx = 1;
	gbc.weighty = 1;
	gbc.fill = GridBagConstraints.NONE;
	
	label = new JLabel("Preis:");
	gbl.setConstraints(label, gbc);
	getContentPane().add(label);
	
	//Textfeld für den Preis
	gbc.gridwidth = GridBagConstraints.REMAINDER;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbc.weightx = 3;
	gbc.insets = new Insets( 0, 5, 0, 5);
	
	JTextField txtPrice = new JTextField("0,00");
	gbl.setConstraints(txtPrice, gbc);
	getContentPane().add(txtPrice);
	
	//Buttons
	gbc.gridwidth = 1;
	gbc.insets = new Insets(0,0,0,0);
	gbc.weightx = 1;
	gbc.weighty = 1;

	gbc.fill = GridBagConstraints.NONE;
	
	JButton btnSend = new JButton("Senden");
	gbl.setConstraints(btnSend, gbc);
	getContentPane().add(btnSend);
			
	JButton btnCancel = new JButton("Abbrechen");
	gbl.setConstraints(btnCancel, gbc);
	getContentPane().add(btnCancel);
	
	setSize(300,400);
	setLocation(50,50);
	setVisible(true);			
} }

