
public class PokemonDeMer extends Pokemon {
	
	private int nbrNageaoires;
	
	public PokemonDeMer(String nom,double poids,int nbrNageaoires) {
		super(nom,poids);
		this.nbrNageaoires=nbrNageaoires;
	}
	
	public int getNbrNageaoires() {
		return nbrNageaoires;
	}
	
	public void setNbrNageaoires(int nbrnageaoires) {
		this.nbrNageaoires=nbrnageaoires;
	}
	
	public String toString() {
		return super.toString()+" \n Nombre de nageoires: "+nbrNageaoires;
	}
	
	

}
