public class Aufgabe4_boolean {
	

  private static boolean containsString( String s, String subString ) {
	return s.indexOf( subString ) > -1 ? true : false;
  					
  }	
  public static void main( String[] args ) {
      		  int i=0;
		      boolean i_bo;
		      String i_st;
		      
		  	
		      do{ i_st = String.valueOf(i);
		          i_bo = containsString( i_st, "7" );
		          System.out.print(i_st + " " + i_bo + " " + i);
		    	  if (i_bo) System.out.print("  eigentlich keine Ausgabe");
		          System.out.println();
		         i++;
		      }while(i<=100);
  }

}
