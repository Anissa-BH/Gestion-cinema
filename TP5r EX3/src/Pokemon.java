
public class Pokemon {
	private String nom;
	private double poids;

	public Pokemon() {
		nom="";
		poids=0;
	}
	
	public Pokemon(String nom,double poids) {
		this.nom=nom;
		this.poids=poids;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids=poids;
	}
	
	public String toString() {
		return "Je suis le pokemon "+nom+ " mon poids est "+poids+ "Kg ";
	}
}
