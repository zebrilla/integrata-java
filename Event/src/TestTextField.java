
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestTextField extends Frame implements TextListener{
   
   public TestTextField (){
      super("Ein Frame mit JTextfield und JTable");
      setSize(300,200);
      setVisible(true);
	         
      TextField textField  = new TextField ("");
      //TextArea textArea = new TextArea("",3,1);
	  
      setLayout(new GridLayout(1,2));
      add((new JScrollPane(textField )));
      
      //getContentPane().setLayout(new GridLayout(1,2));      //JFrame
      //getContentPane().add((new JScrollPane(textArea)));	  //JFrame
      
      pack();
      
      textField .addTextListener(this);
     
   }
   
   public void textValueChanged(TextEvent event){
      TextField textField = (TextField)event.getSource();
      System.out.println("textValue Changed:"+textField.getText());
      if(textField.getText().compareTo("out")==0)
         System.exit(0);	   
   }
}

