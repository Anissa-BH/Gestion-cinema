
public class Patron extends Employe {
	private double salaireHebdo;
	
	public void setSalaireHebdo(double salaireHebdo) {
		this.salaireHebdo=salaireHebdo;
	}

	public Patron(String nom,String prenom,double salaireHebdo) {
		super(nom,prenom);
		this.setSalaireHebdo(salaireHebdo);
	}
	
	public double getSalaireHebdo() {
		return salaireHebdo;
	}
	
	 public double gains() {
		return salaireHebdo*4;
		
	}
	 
	 public String toString() {
		 return super.toString()+" Patron";
	 }


}
