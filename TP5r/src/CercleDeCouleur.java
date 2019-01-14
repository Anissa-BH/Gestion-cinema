
public class CercleDeCouleur extends Cercle {
	private int coloration;
	
	public CercleDeCouleur() {
		coloration=0;
	}

	public CercleDeCouleur(double x,double y,double rayon,int coloration) {
		super(x,y,rayon);
		this.coloration=coloration;
		}
	
	public int getColoration() {
		return coloration;
	}
	
	public void cloloration(int coloration) {
		this.coloration=coloration;
	}
	
	public String toString() {
		return super.toString()+" Coloration: "+this.coloration;
	}

}
