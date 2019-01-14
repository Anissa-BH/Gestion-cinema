
public class Livre extends Produit {
	private String titre;
	private String auteur;
	private String editeur;
	
	

	public Livre(String titre ,String auteur, String editeur, double prix) {
		super(prix);
		this.titre=titre;
		this.auteur=auteur;
		this.editeur=editeur;
		}
	public String getTitre() {
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
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur=editeur;
	}
	public String toString() {
		return super.toString()+" Titre: "+titre+ "Auteur: "+auteur+ "Editeur: " +editeur;
	}
	

}
 