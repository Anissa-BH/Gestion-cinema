
public class TravailleurPiece extends Employe{
	private double retributionParPiece;
	private int quantite;

	public void setRetributionParPiece(double retributionParPiece) {
		this.retributionParPiece=retributionParPiece;
	}
	
	public void setQuantite(int quantite) {
		this.quantite=quantite;
	}

	public TravailleurPiece(String nom, String prenom, double retributionParPiece,int quantite) {
		super(nom,prenom);
		this.setRetributionParPiece(retributionParPiece);
		this.setQuantite(quantite);
		
	}
	public double gains() {
		return this.retributionParPiece*this.quantite;
	}

	public String toString() {
		return super.toString()+" Travailleur à la prièce";
	}
}
