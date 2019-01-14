
public class Banque {
	private Compte tableau[];
	int taille=0;

	public Banque(int tailleMax) {
		tableau=new Compte[tailleMax];
		
	}
	public void ouvrir(Compte unCompte) {
		for (int i=0;i<taille;i++) { 
		if(unCompte.getNumeroCompte().equals(tableau[i].getNumeroCompte()))
			System.out.println("Compte existe déjà");
		else
		tableau[taille++]=unCompte;
		}
	}
	public void cloturer(Compte unCompte) {
		for(int i=0;i<taille;i++) {
			if(tableau[i].getNumeroCompte().equals(unCompte.getNumeroCompte())) {
				tableau[i]=tableau[i+1];
				taille--;
				break;
			}
		}
				System.out.println("Compte n'existe pas");
     }
	public String toString() {
		String info="";
		for(int i=0;i<taille;i++)
			info+= "=======INFO=======>>"+tableau[i]+"\n\n";
		return info;
		
	}

}
