
public class CarnetCoordonnees {
	
	Coordonnees carnet[];
    int nbCoordonees=0;

	public CarnetCoordonnees() {
		
		carnet= new Coordonnees[100];

	}

void ajouter(Coordonnees coordonnees) {
	
	if (nbCoordonees<carnet.length)
	carnet[nbCoordonees++]=coordonnees;
}

void rechercher(String nom, String prenom) {
	boolean exist=false;
	for(int i=0;i<carnet.length;i++)
	{
		if( (carnet[i].getNom().equals(nom)) && (carnet[i].getPrenom().equals(prenom))) {
			exist=true;
		System.out.println("Le numéro de téléphone de " +nom+ "est " +carnet[i].getTelephone()+ "l'adresse"
				+ " est " +carnet[i].getAdresse());
		     break;
		}
	}
	
	if (!exist)
		System.out.println("Ce Contact n'existe pas "); 
	
	
}

public String toString() {
	String info="";
	for(int i=0;i<nbCoordonees;i++)
	info=carnet[i]+"\n";
	return info;
	
}

}
