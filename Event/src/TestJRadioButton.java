
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestJRadioButton extends JFrame implements ItemListener{

   public TestJRadioButton() {
      super("Titel  TestCheckboxGroup");		
		
      JRadioButton rot = new JRadioButton("rot");
      JRadioButton blau = new JRadioButton("blau");
      JRadioButton gelb = new JRadioButton("gelb");
      rot.setSelected(true);
      
      JRadioButton Kreis = new JRadioButton("Kreis");
      JRadioButton Dreieck = new JRadioButton("Dreieck");
      JRadioButton Quadrat = new JRadioButton("Quadrat");
      Kreis.setSelected(true);
      
      ButtonGroup farben = new ButtonGroup();
      farben.add(rot);
      farben.add(blau);
      farben.add(gelb);
      
      ButtonGroup formen = new ButtonGroup();
      formen.add(Kreis);
      formen.add(Dreieck);
      formen.add(Quadrat);
      
      
      setLayout(new GridLayout(3,2));
      add(rot);			add(Kreis);
      add(blau); 		add(Dreieck);
      add(gelb);		add(Quadrat);
      pack();
      
      rot.addItemListener(this);
      blau.addItemListener(this);
      gelb.addItemListener(this);
      Kreis.addItemListener(this);
      Dreieck.addItemListener(this);
      Quadrat.addItemListener(this);
		
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   public void itemStateChanged(ItemEvent e){
	  JRadioButton wechsel = (JRadioButton) e.getItemSelectable();
      System.out.println(wechsel.getActionCommand());
   }		
}

