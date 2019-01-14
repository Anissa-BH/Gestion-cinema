
public class Cercle extends Figure {
	public final static double PI=3.14;
	private double rayon;
	private double surface;
	

	public Cercle() {
		rayon=0;
		}
	
	public Cercle(double x,double y,double rayon) {
		super(x,y);
		setRayon(rayon);
		
		
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public void setRayon(double rayon) {
		this.rayon=rayon;
		this.surface=PI*(Math.pow(this.rayon, 2));
	}
	
	public double getSurface() {
		return surface;
	}
	
	public boolean estPlusGrand(Cercle cercle) {
		return(this.rayon>cercle.rayon);
			
	}
	public boolean estPlusGrand(Cercle cercle1,Cercle cercle2) {
		return(cercle1.rayon>cercle2.rayon);
	}
	
	public String toString() {
		return super.toString()+  " Rayon "+this.rayon+ " Surface "+surface;
	}
	

}
