
public class Produit {
	private double prix;
	private final static double TVA=19.6;
	private String service;

	public Produit() { // je définie un constructeur avec un seul parametre dans le cas ou dans la classe fille le besoin se limite à un seul 
		               // parametre de la classe mere ? 
	prix=0;	
	service="";
	}
	public Produit(double prix) {
		this.prix=3500;
		
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix=prix;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service=service;
	}
public String toString() {
	return "Prix: " +prix+ "Service: " +service;
}

}
