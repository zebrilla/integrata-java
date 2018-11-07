import java.io.*;				// die Datei  Haupt.java
public class Haupt{
   public static void main(String args[]) throws IOException{ 
      Person p=new Person();		// Erzeugung des Objektes person
      Person p2=new Person();
      Person p3=new Person("Anja",12345);
      
      p.ausgeben();
      p2.ausgeben();
      p3.ausgeben();
      
      p.eingeben();
      p2.eingeben();
      
      p.ausgeben();
      p2.ausgeben();
      p3.ausgeben();
 
      Angestellter a = new Angestellter();
      a.eingeben();
      a.ausgeben();
      
      p=null;
      System.gc();   //garbage collector (erst muss die Referenz auf p und p2 weggenommen werden)
   }
}