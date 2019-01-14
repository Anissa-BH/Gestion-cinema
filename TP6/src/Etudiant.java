
public class Etudiant extends Personne {
	private String classe; 
	private float noteMoyenne;
	private boolean faineant;

	public Etudiant(String nom,int age,String classe, float noteMoyenne, boolean faineant ) {
		super(nom,age);
		this.classe=classe;
		this.noteMoyenne=noteMoyenne;
		this.faineant=faineant;
		
	}
	
	public void afficher(boolean compact){
		System.out.println("Etudiant");
		super.afficher(compact);
		
	}

}
