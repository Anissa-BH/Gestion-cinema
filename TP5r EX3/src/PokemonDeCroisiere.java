
public class PokemonDeCroisiere extends PokemonDeMer{
	

	public PokemonDeCroisiere(String nom,double poids,int nbrNageaoires) {
		super(nom,poids,nbrNageaoires);
	}
 
	public double vitesse() {
	 return (getPoids()/25*getNbrNageaoires())/2; 
 }
	public String toString() {
		return super.toString()+" ma vitesse est de "+vitesse();
	}
}
