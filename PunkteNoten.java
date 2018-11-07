
import java.io.*;

public class PunkteNoten {
   public static void main(String[] args) {
      int punkte=0;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
      try{
         System.out.print("Punkte=");
         punkte = Integer.parseInt(in.readLine());
      }
      catch(IOException e){}

      if(punkte>=92) {
    	  		System.out.println("Note: 1");
      }
      else if(punkte>=80) {  
       	      	System.out.println("Note: 2"); 
      }
	  else if(punkte>=67) {
      	   	    System.out.println("Note: 3");
	  }
	  else if(punkte>=50) {
      			System.out.println("Note: 4");
	  }
      else if(punkte>=30) {
      			System.out.println("Note: 5");
      }
      else {  
      			System.out.println("Note: 6");
      			System.out.println("\nleider durchgefallen");
      }
   }
}