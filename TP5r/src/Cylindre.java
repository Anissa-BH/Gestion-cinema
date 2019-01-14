
public class Cylindre extends  Cercle {
	private double hauteur;
	
	public Cylindre(double x,double y,double rayon,double hauteur) {
		super(x,y,rayon);
		this.hauteur=hauteur;
		
	}
	
	public double volume() {
		return PI*(Math.pow(getRayon(), 2))*this.hauteur;
	}
	public String toString() {
		return super.toString()+ "Hauteur: "+this.hauteur;
	}

}
