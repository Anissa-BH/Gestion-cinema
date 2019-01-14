
public class CarnetCoordonnees {
	
	private Coordonnees carnet[];
	private int nbCoordonnees=0;
	

	public CarnetCoordonnees(int nbcord) {
		if(nbcord>100)
			nbcord=100;
		carnet=new Coordonnees[nbcord];
		
	}
	public void ajouter(Coordonnees coordonnees) {
		
		if(nbCoordonnees<carnet.length)
			carnet[nbCoordonnees++]=coordonnees;
	}
	public void recherche(String nom,String prenom) {
		boolean test=false;
		for(int i=0; i<carnet.length;i++) {
			if (carnet[i].getNom().equals(nom) && carnet[i].getPrenom().equals(prenom))
			
		System.out.println("l'adresse :" +carnet[i].getAdresse()+ "Le telephone " +carnet[i].getTelephone());
			test=true;
			break;
			
	}
		if(!test)
			System.out.println("Contact non existant");
			
		}
	public String toString() {
		String cord="";
		for(int i=0;i<carnet.length;i++) {
			cord+="\n"+carnet[i];
		}
		return cord;
	}
	

}
