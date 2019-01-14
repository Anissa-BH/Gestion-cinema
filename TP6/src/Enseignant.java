
public class Enseignant extends Personne {
  
	       private int nbHeureCours;
	       private boolean souriant;
	
	
	
	
	
	public Enseignant(String nom,int age, int nbHeureCours, boolean souriant) {
		super(nom,age);
		this.nbHeureCours=nbHeureCours; 
		this.souriant=souriant; 
		
	}
	public void afficher(boolean compact){
		System.out.println("Enseignant");
		super.afficher(compact);
		
	}
	

}
