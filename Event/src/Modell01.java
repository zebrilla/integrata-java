
import java.awt.*;
import java.awt.event.*;

public class Modell01 extends Frame implements MouseListener{
   int x=50,y=50;
   public static void main(String args[]){
      Modell01 wnd = new Modell01();
   }

   public Modell01(){
      super("Test");
      setSize(400,300);
      setLocation(200,100);
      setVisible(true);
      addMouseListener(this);
   }

   public void paint(Graphics g){  
      g.drawRect(x,y,30,30);  
   }

   public void mouseClicked(MouseEvent e){
      x=400 - e.getX();  y=e.getY();
      repaint();
   }

   public void mouseEntered(MouseEvent e){
      x=100;  y=100;
      repaint();
   }

   public void mouseExited(MouseEvent e){
      System.exit(0);
   }

   public void mousePressed(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}

}
