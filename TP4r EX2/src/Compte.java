
public class Compte {
	private Personne personne;
	private float solde;
	private String numeroCompte;
	

	public Compte(Personne personne,float solde,String numeroCompte) {
		this.personne=personne;
		this.solde=solde;
		this.numeroCompte=numeroCompte;
		
	}
	public float crediter(float somme) {
		return solde+=somme;
		
	}
	public float debiter(float somme) {
		return solde-=somme;
	}
	public String getNumeroCompte() {
		return numeroCompte;
	}
	
	public String toString() {
		return  personne+" \nSolde:\t " +solde+ "\tNumero de compte:\t "+numeroCompte;
	}

}
