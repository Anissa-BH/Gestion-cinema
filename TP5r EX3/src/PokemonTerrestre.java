
public class PokemonTerrestre extends Pokemon {
	private double taille; 
	private int nbrPattes;

	public PokemonTerrestre(String nom, double poids, double taille, int nbrPattes) {
		super(nom,poids);
		this.taille=taille;
		this.nbrPattes=nbrPattes;
		}
	public double getTaille() {
		return taille;
	}
	
	public void setTaille(double taille) {
		this.taille=taille;
	}
	public int getNbrPattes() {
		return nbrPattes;
	}
	
	public double vitesse() {
		return getNbrPattes()*getTaille()*3;
	}
	public String toString() {
		return super.toString()+" ma vitesse est "+vitesse()+" km/h j'ai "+nbrPattes+ " pattes, ma taille est de "+taille+" m" ; 
	}
	

}
