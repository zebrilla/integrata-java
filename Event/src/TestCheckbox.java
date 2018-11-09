
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestCheckbox extends JFrame implements ItemListener{

   TestCheckbox() {
      super("Titel  TestCheckbox");
      Panel panel =new Panel();			

      Checkbox checkbox1 = new Checkbox("Checkbox 1" ,true);
      Checkbox checkbox2 = new Checkbox("Checkbox 2");
      Checkbox ende = new Checkbox("Ende");
		
      panel.setLayout(new GridLayout(3,1));
      panel.add(checkbox1);
      panel.add(checkbox2);
      panel.add(ende);
      add(panel);
      pack();
      
      checkbox1.addItemListener(this);
      checkbox2.addItemListener(this);
      ende.addItemListener(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setVisible(true);
   }

   public void itemStateChanged(ItemEvent e){
      Checkbox checkbox = (Checkbox) e.getItemSelectable();
      System.out.println(checkbox.getLabel());
      if(checkbox.getLabel().compareTo("Ende")==0)
         System.exit(0);		
   }	
}

