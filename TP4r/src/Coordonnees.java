
public class Coordonnees {
	private String nom;
	private String prenom;
	private int telephone;
	private String adresse;
	
	
	public Coordonnees(String nom,String prenom,int telephone,String adresse) {
		this.nom=nom;
		this.prenom=prenom;
		this.telephone=telephone;
		this.adresse=adresse;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone=telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse=adresse;
	}



public String toString() {
	return"Nom "+nom+ "Prenom "+prenom+ "Tel "+telephone+ "Adresse " +adresse;
}
}