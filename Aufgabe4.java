
	import java.io.*;
	import java.io.BufferedReader;

public class Aufgabe4 {
	
	   public static void main(String args[]){
		   
		  /* Aufgabe 4.1
	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      double x;
	      double y;
	      try{
	         System.out.print("x=");
	         x=Double.parseDouble(in.readLine());
	         System.out.print("y=");
	         y=Double.parseDouble(in.readLine());
	         if (x>y) {
	       	  System.out.print("x ist größer");
	             }
	         else if (x<y) {
	       	  System.out.print("y ist größer");
	             }
	         else {
		       	  System.out.print("beide Zahlen sind gleich");
             }
	      }
	      catch(IOException e){}
	      */
		  
		  /* Aufgabe 4.2 
		  int x = 1890;
          System.out.println("Schaltjahre");
          if (x%4 != 0) {
        	  x = x + 4 - x&4;
          }
	      while(x<2110){
	          if (x%100 != 0 || x%1000 == 0) System.out.println(x);
	          x+=4;
	       } 
	      */
		   
		  /* Aufgabe 4.3 
		      int i=0;
		      do{
		    	  if (i%7 != 0 && i%10 != 7 && (i / 10) != 7) System.out.println(i);
		         i++;
		      }while(i<=100);
		      
		  */
		    
		      
		   /* Aufgabe 4.4  (Ulam-Folge) */


		      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		      int x;

		      try{
		         System.out.print("x=");
		         x=Integer.parseInt(in.readLine());
			     while(x!=1){
			    	 if (x%2==0) {
			       	  System.out.print(x+" wird halbiert : ");
			    	  x = x/2;
			       	  System.out.print(x+"\n");
			             }
			    	 else {
			       	  System.out.print(x+" wird verdreifacht und um eins vermehrt : ");
			    	  x = x*3+1;
			       	  System.out.print(x+"\n");
		             }
			     }
		      }    
		      catch(IOException e){}	

	   }
	}
