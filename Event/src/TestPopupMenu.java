
import java.awt.*;
import java.awt.event.*;

public class TestPopupMenu extends PopupMenu{
   TestPopupMenu(ActionListener listener){
      MenuItem menuItem;
      menuItem = new MenuItem("Rückgängig");
      menuItem.addActionListener(listener);
      add(menuItem);	
      menuItem = new MenuItem("Ausschneiden");
      menuItem.addActionListener(listener);
      add(menuItem);
      menuItem = new MenuItem("Kopieren");
      menuItem.addActionListener(listener);
      add(menuItem);
      menuItem = new MenuItem("Einfügen");
      menuItem.addActionListener(listener);
      add(menuItem);
      menuItem = new MenuItem("Ende");
      menuItem.addActionListener(listener);
      add(menuItem);
   }
}
