import java.io.*;
class Verzweigung{
   public static void main(String args[]) throws IOException{
      int x;
      BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Geben Sie eine Zahl ein:");
      x=Integer.parseInt(din.readLine());
      if (x%2==0 && x%7==0) {
    	  System.out.print("Die eingegebene Zahl ist gerade\n");
          System.out.print("und ist durch 7 teilbar");
          }
      else  {
    	  System.out.print("Die eingegebene Zahl ist ungerade\n");
          System.out.print("oder nicht durch 7 teilbar");
          }
   }
}
