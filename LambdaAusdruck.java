import javax.swing.JButton; 
import static javax.swing.JOptionPane.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
public class LambdaAusdruck { 
	public static void main(String... args) { 
		JButton button = new JButton("Klick!"); 
		// Event Handler durch anonyme Klasse definiert
		button.addActionListener(new ActionListener(){			// anonyme Klasse,  hier: runde Klammer auf
			public void actionPerformed(ActionEvent event){
				showMessageDialog(null, "Geklickt!");
			}
		});														//hier: runde Klammer zu
		
		showMessageDialog(null, button);
	} 
} 


/*import javax.swing.JButton; 
import static javax.swing.JOptionPane.*; 
public class LambdaAusdruck { 
	public static void main(String... args) { 
		JButton button = new JButton("Klick mal hier!"); 
		// Event Handler durch Lambda-Ausdruck definiert: 		// Java 8.0
		button.addActionListener(e -> showMessageDialog(null, "Geklickt!"));
		showMessageDialog(null, button); 
	} 
} */

