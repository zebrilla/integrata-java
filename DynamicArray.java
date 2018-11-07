import java.io.*;

class DynamicArray{
	
   public static void main(String args[]) throws IOException{
	   
      int anzahl;
      int x[];
      BufferedReader din =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Anzahl=");
      anzahl=Integer.parseInt(din.readLine());
      x = new int[anzahl];
      for(int i=0; i<anzahl; i++){
         System.out.print("x["+i+"]= ");
         x[i]=Integer.parseInt(din.readLine());
      }
      System.out.println("Ausgabe:");			//   mit for-each-Schleife:
      for(int i=0; i<anzahl; i++)			//   for(int i : x)
         System.out.println("x["+i+"]= "+x[i]);			//      System.out.println("x="+i);
      
   }
}
