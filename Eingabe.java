import java.io.*;
public class Eingabe{
	   public static void main(String args[]) throws IOException{
	      int a,b,c;
	      BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Bitte a eingeben:");
	      a=Integer.parseInt(din.readLine());
	      System.out.println("Bitte b eingeben:");
	      b=Integer.parseInt(din.readLine());	
	      c=a+b;
	      System.out.println("a+b="+c);
	   }
	}