
import java.awt.*;
import javax.swing.*;
public class EinFrame extends JFrame{
   public EinFrame(){
      super("Da guckst Du");
      setSize(600,400);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
	
   public void paint(Graphics g){
	   Color anja = new Color(0,100, 100);
	   g.setColor(Color.pink);
	   g.drawLine(100, 100, 300, 300);
	   g.setColor(Color.red);
	   g.drawRect(50,50,100,100);
	   g.setColor(Color.blue);
	   g.fillRect(200,50,100,100);
	   g.setColor(Color.magenta);
	   g.drawOval(50,200,100,100);
	   g.setColor(anja);
	   g.fillOval(200,200,100,100);   
	}
}
