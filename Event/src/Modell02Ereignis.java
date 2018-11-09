
import java.awt.event.*;
public class Modell02Ereignis implements MouseListener{ 
   Modell02 m02;
   Modell02Ereignis(Modell02 m02){  
      this.m02 = m02;  
   }
   public void mouseClicked(MouseEvent e){
      m02.x=e.getX();
      m02.y=e.getY();
      m02.repaint();
   }
   public void mouseEntered(MouseEvent e){
	   m02.x=100;  m02.y=100;
	   m02.repaint();
   }
   public void mouseExited(MouseEvent e){
     System.exit(0);
   }
   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
}
