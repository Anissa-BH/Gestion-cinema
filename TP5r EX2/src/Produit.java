
public class Produit {
	private double prix;
	public final static double TVA=0.19;
	private String service;

	public Produit() {
		prix=0;
		service="Inconnu";
	}
	
	public Produit(double prix) {
		this.prix=prix;
		
		
	}

}
