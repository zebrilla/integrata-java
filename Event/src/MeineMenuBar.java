
import java.awt.*;
import java.awt.event.*;

public class MeineMenuBar extends MenuBar implements ActionListener{

      MeineMenuBar(){
      Menu m = new Menu("Datei");
            
      MenuItem menuItem1 = new MenuItem("Neu");
      MenuItem menuItem2 = new MenuItem("Speichern");
      MenuItem menuItem3 = new MenuItem("Beenden");	

      m.add(menuItem1);
      m.add(menuItem2);
      m.add(menuItem3);

      add(m);

      menuItem1.addActionListener(this);
      menuItem2.addActionListener(this);
      menuItem3.addActionListener(this);
   }
		
   public void actionPerformed(ActionEvent event){
      String name = event.getActionCommand();
      if(name.equals("Neu"))
         System.out.println("Neu");
      if(name.equals("Speichern"))
         System.out.println("Speichern");
      if(name.equals("Beenden"))
         System.exit(0);
   }
}
