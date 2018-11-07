import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class LeapYear {
	public static void main( String[] args ) {

		
	SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	String inputString1 = "05 11 2018";
	String inputString2 = "24 12 2018";

	try {
	    Date date1 = myFormat.parse(inputString1);
	    Date date2 = myFormat.parse(inputString2);
	    long diff = date2.getTime() - date1.getTime();
	    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	}
}
