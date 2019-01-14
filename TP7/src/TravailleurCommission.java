
public class TravailleurCommission extends Employe{
	private double salaire;
	private double commission;
	private int quantite;
	
	public void setSalaire(double salaire) {
		this.salaire=salaire;
	}
 
	public void setCommission(double commission) {
		this.commission=commission;
	}
	
	public void setQuantite(int quantite) {
		this.commission=commission;
	}
	public TravailleurCommission(String nom,String prenom,double salaire, double commission, int quantite) {
		super(nom,prenom);
		this.setSalaire(salaire);
		this.setCommission(commission);
		this.setQuantite(quantite);
		}
	public double gains() {
		return this.salaire+this.commission*this.quantite;
	}
	public String toString() {
		return super.toString()+" Travailleur à la commission";
		}

}
