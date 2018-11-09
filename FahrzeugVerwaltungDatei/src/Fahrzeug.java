public class Fahrzeug {
	public Eigentuemer e = new Eigentuemer();   // has a   Aggregation
	private String FIN;
	private String hersteller;
	
	public String getFIN() {
		return FIN;
	}
	
	public void setFIN(String fIN) {
		FIN = fIN;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	
}
