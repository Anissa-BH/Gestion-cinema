
public class Cylindre extends Cercle {
	private double hauteur;
	

	public Cylindre() {
		
		hauteur=0;
	}
	
	public Cylindre(double x,double y,double rayon, double hauteur) {
		super(x,y,rayon);
		this.hauteur=hauteur;
	}
	public double volume() {
		return PI*(Math.pow(this.rayon, 2))*hauteur;
	}
	public String toString() {
		return super.toString() +" Hauteur: " +hauteur+ " Volume: " +volume();
	}
	
}

