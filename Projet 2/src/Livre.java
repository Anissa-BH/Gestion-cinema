
public class Livre {

	private String titre;
	private String auteur;
	private int nombrePage;
	private float prix;
	
	/*public Livre() {
		
	    System.out.println("Création d'un livre !");
        titre="What a westmoreland wants";
        auteur="Brenda Jackson";
        nombrePage=185;
        prix=20;}
    */
public Livre(String titre, String auteur, int nombrePage, float prix) {
	
	    System.out.println("Création d'un livre !");
        this.titre=titre;
        this.auteur=auteur;
        this.nombrePage=nombrePage;
        this.prix=prix;
        }

public String getTitre(){
	
	return titre;
	}

public void setTitre(String titre) {
         
	this.titre=titre;	
}

public String getAuteur() {
	return auteur;
}

public void setAuteur(String auteur) {
	this.auteur=auteur;
}

public int getnombrePage() {
	
	return nombrePage;
}

public void setAuteur(int nombrePage) {
	
	this.nombrePage=nombrePage;
}

public float getPrix() {
	
	return prix;
}

public void setPrix(float prix) {
	this.prix=prix;
}

public String toString() {
	return "Livre de titre "+titre+" écrit par "+auteur+" ayant "+nombrePage+" pages et de prix "+prix+" Dinars";
}









}
