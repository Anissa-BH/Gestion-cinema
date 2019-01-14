
public class PokemonSportifs extends PokemonTerrestre {
	private float frequenceCardiaque;
	

	public PokemonSportifs(String nom, double poids, double taille, int nbrPattes, float frequenceCardiaque) {
		super(nom,poids,taille,nbrPattes);
		this.frequenceCardiaque=frequenceCardiaque;
		}
	
	public float getFrequenceCardiaque() {
		return frequenceCardiaque;
	}

	public void setFrequenceCardiaque(float frequenceCardiaque) {
		this.frequenceCardiaque=frequenceCardiaque;
	}
	
	
	public String toString() {
		return super.toString()+" ma fréquence cardiaque est de "+frequenceCardiaque+ "pulsations à la minute";
	}
}
