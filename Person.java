import java.io.*;				// die Datei  Person.java

import java.io.BufferedReader;

// wenn ich Person nicht als eigene Klasse, sondern nur als Unterklasse von Angestellter
// verwenden will, mache ich keine public class, sondern eine public abstract class

public class Person{ 
   protected String name;
   protected int plz;

   public void eingeben(){
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try{ 
         System.out.print("Name=");
         name = in.readLine();
         System.out.print("Postleitzahl=");
         plz=Integer.parseInt(in.readLine());
      }
      catch(IOException e){
         //nichts
      }
   } 

   public void ausgeben(){ 
      System.out.println("Name:"+name);
      System.out.println("Postleitzahl:"+plz);
   }
   
   public Person(){
	   	System.out.println("Konstruktor ohne Parameter");
	      // Konstruktor
   }

   /*
   public Person(String n,int p){
	   	System.out.println("Konstruktor mit Parameter");
	   	name=n;
	   	plz=p;
	      // Konstruktor
 }
   
   */
   /* oder so mit this: */
   
   public Person(String name,int plz){
	   	System.out.println("Konstruktor mit Parameter");
	   	this.name = name;
	   	this.plz  = plz;
	      // Konstruktor
  }
   
   public void finalize(){
	   	System.out.println("Destruktor");
	      // Destruktor
	}
	   
}  // end of class
