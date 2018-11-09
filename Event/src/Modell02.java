
import java.awt.*;

public class Modell02 extends Frame{
   Modell02Ereignis ereignis = new Modell02Ereignis(this);
   int x=50,y=50;
 
   public Modell02(){ 
      super("Test");
      setSize(400,300);
      setLocation(200,100);
      setVisible(true);  
      addMouseListener(ereignis);
   }
   public void paint(Graphics g){  
	      g.drawRect(x,y,30,30);  
   }
}
