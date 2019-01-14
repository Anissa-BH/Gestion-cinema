
public class Cd extends Produit {
	private String titre;
	private String interprete;
	private String listeChansonContenu;

	public Cd() {
		
	}
	public Cd(String titre,String interprete,String listeChansonContenu,double prix){
		super(prix);
		this.titre=titre;
		this.interprete=interprete;
		this.listeChansonContenu=listeChansonContenu;
		
	}
	// la surcharge de la methode toString prend automatiquement le prix de la classe courrante ? 
	// ici la methode toString mere contient service commen faire ?
public String toString() {
	return super.toString()+ "le titre: "+titre+ "Interprete: " +interprete+ 
			"Titres des chanson: "+listeChansonContenu;
}
}
