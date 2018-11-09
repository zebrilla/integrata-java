
import java.awt.*;
import java.awt.event.*;

public class Haupt extends Frame implements ActionListener{
   TestPopupMenu popupMenu;
   public static void main(String[] args) {
      new Haupt();
   }

   Haupt(){
      super("Kontextmenu");
      setSize(200,200);
      setVisible(true);
      popupMenu = new TestPopupMenu(this);
      add(popupMenu);
      enableEvents(AWTEvent.MOUSE_EVENT_MASK);
   }

   public void processMouseEvent(MouseEvent e){
      if(e.isPopupTrigger())
         popupMenu.show(e.getComponent(), e.getX(), e.getY());
      super.processMouseEvent(e);
   }

   public void actionPerformed(ActionEvent e){
      String s = e.getActionCommand();
      System.out.println(s);
      if(s.compareTo("Ende")==0)
         System.exit(0);
   }
}
