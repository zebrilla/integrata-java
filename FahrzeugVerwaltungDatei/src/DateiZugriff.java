import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class DateiZugriff {
	
	public boolean anlegen(Fahrzeug f){
		String pfad = "C:\\Users\\W8Admin\\eclipse-workspace\\FahrzeugVerwaltungDatei\\src\\Fahrzeuge\\" + f.getFIN() + ".txt";
		String outString = f.getHersteller() + "\n" + f.e.getName() + "\n" + f.e.a.getStrasse() + "\n" + f.e.a.getWohnort();
		File file = new File(pfad);
		if(!file.exists()){
			System.out.println("debug 1 anlegen");
			try{
				FileWriter out = new FileWriter(pfad);
				out.write(outString, 0, outString.length()); 
			    out.close();
				System.out.println("debug 2 anlegen");
			}
		    catch (IOException ex){}
			
			return true;
		}
		
		return false;
				
	}

	public Fahrzeug lesen(Fahrzeug f){
		String pfad = "C:\\Users\\W8Admin\\eclipse-workspace\\FahrzeugVerwaltungDatei\\src\\Fahrzeuge\\" + f.getFIN() + ".txt";
		File file = new File(pfad);
		
		try{
			FileReader in = new FileReader(file);
			
		    int size=(int)file.length();
		    char data[] = new char[size];
		    in.read(data,0,size);
		    in.close();
		    
		    System.out.println("Datensatz wurde gelesen.");
		    
		    String daten = String.copyValueOf(data);
		    
		    StringTokenizer st = new StringTokenizer(daten,"\n");
		    
		    f.setHersteller(st.nextToken());
		    f.e.setName(st.nextToken());
		    f.e.a.setStrasse(st.nextToken());
		    f.e.a.setWohnort(st.nextToken());
		        
		}
	    catch (IOException ex){
	    	System.out.println("Datensatz konnte nicht gelesen werden.");
	    }
		
		return f;
	}
	

	public boolean aktualisieren(Fahrzeug f){
		String pfad = "C:\\Users\\W8Admin\\eclipse-workspace\\FahrzeugVerwaltungDatei\\src\\Fahrzeuge\\" + f.getFIN() + ".txt";
		String outString = f.getHersteller() + "\n" + f.e.getName() + "\n" + f.e.a.getStrasse() + "\n" + f.e.a.getWohnort();
		File file = new File(pfad);
		
		if(file.exists()){
			try{
				FileWriter out = new FileWriter(pfad);
				out.write(outString, 0, outString.length()); 
			    out.close();
			}
		    catch (IOException ex){}
			return true;
		} 
		
		return false;
			
	}
	
	public boolean loeschen(Fahrzeug f){
		String pfad = "C:\\Users\\W8Admin\\eclipse-workspace\\FahrzeugVerwaltungDatei\\src\\Fahrzeuge\\" + f.getFIN() + ".txt";
		File file = new File(pfad);
		boolean ret = file.delete();
		return ret;
	}
}
