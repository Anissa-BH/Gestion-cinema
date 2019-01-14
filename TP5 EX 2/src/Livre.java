
public class Livre extends Produit {
	private String titre;
	private String auteur;
	private String editeur;
	

	public Livre() {
		String titre="";
		String auteur="";
		String editeur="";
	}
	// 
	public Livre(String titre,String auteur,String editeur,double prix) {
		super(prix);
		this.titre=titre;
		this.auteur=auteur;
		this.editeur=editeur;
		
	}

}
