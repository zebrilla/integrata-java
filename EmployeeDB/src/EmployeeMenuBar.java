import java.awt.event.*;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class EmployeeMenuBar  extends JMenuBar{

	public EmployeeMenuBar(ActionListener lis){
		JMenu file = new JMenu("File");
		JMenu employee = new JMenu("Employee");
		
		JMenuItem newR = new JMenuItem("Insert");
		JMenuItem readR = new JMenuItem("Read");
		JMenuItem updateR = new JMenuItem("Update");
		JMenuItem deleteR = new JMenuItem("Delete");
		JMenuItem resetR = new JMenuItem("Reset");
		JMenuItem displayR = new JMenuItem("Display");
		JMenuItem end = new JMenuItem("End");
		
		newR.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
		readR.setAccelerator(KeyStroke.getKeyStroke('R', InputEvent.CTRL_DOWN_MASK));
		updateR.setAccelerator(KeyStroke.getKeyStroke('U', InputEvent.CTRL_DOWN_MASK));
		deleteR.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
		resetR.setAccelerator(KeyStroke.getKeyStroke('Z', InputEvent.CTRL_DOWN_MASK));
		displayR.setAccelerator(KeyStroke.getKeyStroke('I', InputEvent.CTRL_DOWN_MASK));
		end.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.CTRL_DOWN_MASK));
		
		//beenden.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.ALT_DOWN_MASK));
		//beenden.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.SHIFT_DOWN_MASK));
		
		file.add(end);
		
		employee.add(newR);
		employee.add(readR);
		employee.add(updateR);
		employee.add(deleteR);
		employee.add(displayR);
		employee.addSeparator();
		employee.add(resetR);
		
		add(file);
		add(employee);
		
		newR.addActionListener(lis);
		readR.addActionListener(lis);
		updateR.addActionListener(lis);
		deleteR.addActionListener(lis);
		resetR.addActionListener(lis);
		displayR.addActionListener(lis);
		end.addActionListener(lis);
	}

}
