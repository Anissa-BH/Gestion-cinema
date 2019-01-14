
public class Coordonnees {
	private String nom;
	private String prenom;
	private int telephone;
	private String adresse;
	
	public Coordonnees() {
		
		this.nom=nom;
		this.prenom=prenom;
		this.telephone=telephone;
		this.adresse=adresse;
}
	
public Coordonnees(String nom,String prenom,int telephone,String adresse) {
		
		this.nom=nom;
		this.prenom=prenom;
		this.telephone=telephone;
		this.adresse=adresse;
	}	

public String getNom() {
	return nom;
}
public String getPrenom() {
	return prenom;
}
public long getTelephone() {
	return telephone;
}
public String getAdresse() {
	return adresse;
}

public void setNom(String nom) {
	this.nom=nom;
}

public void setPrenom(String prenom) {
	this.prenom=prenom;
}
public void setTelephone(int telephone) {
	this.telephone=telephone;
}
public void setAdresse(String adresse) {
	this.adresse=adresse;
}

public String toString() {
	return "Le nom est "+nom+ " le prénom est "+prenom+" le numéro de téléphone est "+telephone+" et l'adresse est " +adresse;
}









}
