
public class Steuerung {
	
	Ansicht ansicht ;
	
	public Steuerung(Ansicht ansicht){
		this.ansicht = ansicht;
	}
	
	private DateiZugriff dz= new DateiZugriff();
	Fahrzeug f = new Fahrzeug();
	
	public void anlegen(){
		//String FIN = ansicht.FINTextfeld.getText();
		//String hersteller = ansicht.HerstellerTextfeld.getText();
		//String name = ansicht.NameTextfeld.getText();
		//String strasse = ansicht.StrasseTextfeld.getText();
		//String wohnort = ansicht.WohnortTextfeld.getText();
		
		f.setFIN(ansicht.FINTextfeld.getText());
		f.setHersteller(ansicht.HerstellerTextfeld.getText());
		f.e.setName(ansicht.NameTextfeld.getText());
		f.e.a.setStrasse(ansicht.StrasseTextfeld.getText());
		f.e.a.setWohnort(ansicht.WohnortTextfeld.getText());

		boolean wert = dz.anlegen(f);
		
		if(wert){
			System.out.println("Datensatz wurde angelegt.");
			ansicht.FINTextfeld.setText("");
			ansicht.HerstellerTextfeld.setText("");
			ansicht.NameTextfeld.setText("");
			ansicht.StrasseTextfeld.setText("");
			ansicht.WohnortTextfeld.setText("");
		}else {
			System.out.println("Anlegen nicht möglich, Datei existiert schon");
		}
	}
	
	public void lesen(){
		//String FIN = ansicht.FINTextfeld.getText();
		f.setFIN(ansicht.FINTextfeld.getText());
		f.setHersteller("");
		f.e.setName("");
		f.e.a.setStrasse("");
		f.e.a.setWohnort("");
		
		f = dz.lesen(f);
		
//		String hersteller = f.getHersteller();
//		String name = f.e.getName();
//		String strasse = f.e.a.getStrasse();
//		String wohnort = f.e.a.getWohnort();
		
		ansicht.HerstellerTextfeld.setText(f.getHersteller());
		ansicht.NameTextfeld.setText(f.e.getName());
		ansicht.StrasseTextfeld.setText(f.e.a.getStrasse());
		ansicht.WohnortTextfeld.setText(f.e.a.getWohnort());
	}
	
	public void aktualisieren(){
		String FIN = ansicht.FINTextfeld.getText();
		String hersteller = ansicht.HerstellerTextfeld.getText();
		String name = ansicht.NameTextfeld.getText();
		String strasse = ansicht.StrasseTextfeld.getText();
		String wohnort = ansicht.WohnortTextfeld.getText();
		
		f.setFIN(FIN);
		f.setHersteller(hersteller);
		f.e.setName(name);
		f.e.a.setStrasse(strasse);
		f.e.a.setWohnort(wohnort);
		
		boolean wert = dz.aktualisieren(f);
		
		if(wert){
			System.out.println("Datensatz wurde aktualisiert.");
			ansicht.FINTextfeld.setText("");
			ansicht.HerstellerTextfeld.setText("");
			ansicht.NameTextfeld.setText("");
			ansicht.StrasseTextfeld.setText("");
			ansicht.WohnortTextfeld.setText("");
		} else{
			System.out.println("Aktualisieren nicht möglich, Datei existiert nicht");
		}
	}

	public void loeschen(){
		String FIN = ansicht.FINTextfeld.getText();
		f.setFIN(FIN);
		boolean wert = dz.loeschen(f);	
		if(wert) {
			System.out.println("Datensatz erfolgreich gelöscht");
			ansicht.FINTextfeld.setText("");
			ansicht.HerstellerTextfeld.setText("");
			ansicht.NameTextfeld.setText("");
			ansicht.StrasseTextfeld.setText("");
			ansicht.WohnortTextfeld.setText("");
		}else{
			System.out.println("Datensatz konnte nicht gelöscht werden");
		}
	}
	
}
