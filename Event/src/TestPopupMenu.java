
import java.awt.*;
import java.awt.event.*;

public class TestPopupMenu extends PopupMenu{
   TestPopupMenu(ActionListener listener){
      MenuItem menuItem;
      menuItem = new MenuItem("R�ckg�ngig");
      menuItem.addActionListener(listener);
      add(menuItem);	
      menuItem = new MenuItem("Ausschneiden");
      menuItem.addActionListener(listener);
      add(menuItem);
      menuItem = new MenuItem("Kopieren");
      menuItem.addActionListener(listener);
      add(menuItem);
      menuItem = new MenuItem("Einf�gen");
      menuItem.addActionListener(listener);
      add(menuItem);
      menuItem = new MenuItem("Ende");
      menuItem.addActionListener(listener);
      add(menuItem);
   }
}
