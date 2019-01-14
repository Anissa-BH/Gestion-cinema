
public class PokemonDesMers extends PokemonDeMer{
	 

	public PokemonDesMers(String nom,double poids,int nbrNageaoires) {
		super(nom,poids,nbrNageaoires);
		}
	
	public double vitesse() {
		return getPoids()/25*getNbrNageaoires();
	}
	
	public String toString() {
		return super.toString()+" ma vitesse est de "+vitesse()+" km/h";
	}

}
