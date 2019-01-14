
public class Capitale extends Ville{
	public String monument;

	public Capitale() {
		super();
		this.monument="Aucun";
		
	}
	
	public Capitale(String pNom,String pNomP,int pNbrH,String monument) {
		super(pNom,pNomP,pNbrH);
		this.monument=monument;
		
	}
	
	
	
		
	public String toString() { 
		return super.toString() + "\n \t  ==>> Monument: " + this.monument;
	}

}
