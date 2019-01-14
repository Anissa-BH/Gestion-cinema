
public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;
	

	public Personne(String nom,String prenom,Adresse adresse) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		
	}
	
	public String toString() {
		return nom+" "+prenom+"\n\t|___Adresse:\t\t"+adresse;
		}

}
