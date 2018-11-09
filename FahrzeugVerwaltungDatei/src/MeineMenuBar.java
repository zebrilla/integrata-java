
import java.awt.event.*;

import javax.swing.*;

public class MeineMenuBar extends JMenuBar{

	public MeineMenuBar(ActionListener l){
		JMenu datei = new JMenu("Datei");
		JMenu fahrzeug = new JMenu("Fahrzeug");
		
		JMenuItem anlegen = new JMenuItem("Anlegen");
		JMenuItem lesen = new JMenuItem("Lesen");
		JMenuItem aktualisieren = new JMenuItem("Aktualisieren");
		JMenuItem loeschen = new JMenuItem("Löschen");
		JMenuItem zuruecksetzen = new JMenuItem("Zurücksetzen");
		JMenuItem beenden = new JMenuItem("Beenden");
		
		anlegen.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK));
		lesen.setAccelerator(KeyStroke.getKeyStroke('R', InputEvent.CTRL_DOWN_MASK));
		aktualisieren.setAccelerator(KeyStroke.getKeyStroke('U', InputEvent.CTRL_DOWN_MASK));
		loeschen.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
		zuruecksetzen.setAccelerator(KeyStroke.getKeyStroke('Z', InputEvent.CTRL_DOWN_MASK));
		beenden.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.CTRL_DOWN_MASK));
		
		//beenden.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.ALT_DOWN_MASK));
		//beenden.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.SHIFT_DOWN_MASK));
		
		datei.add(beenden);
		
		fahrzeug.add(anlegen);
		fahrzeug.add(lesen);
		fahrzeug.add(aktualisieren);
		fahrzeug.add(loeschen);
		fahrzeug.addSeparator();
		fahrzeug.add(zuruecksetzen);
		
		add(datei);
		add(fahrzeug);
		
		anlegen.addActionListener(l);
		lesen.addActionListener(l);
		aktualisieren.addActionListener(l);
		loeschen.addActionListener(l);
		zuruecksetzen.addActionListener(l);
		beenden.addActionListener(l);
	}
}
