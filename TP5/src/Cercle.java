
public class Cercle extends Figure {
	public final static double PI=3.141592564;
	protected double rayon;
	private double surface;
		
	public Cercle() {
			rayon=0;
		}
	public Cercle(double x,double y,double rayon) {
		super(x,y);
		this.rayon=rayon;
		this.setSurface();
		
	}
	
	public void setRayon(double rayon) {
		this.rayon=rayon;
		this.setSurface();
	}
	public double getRayon() {
		return rayon;
	}
	public void setSurface() {
		this.surface=PI*(Math.pow(this.rayon, 2));
	}
	
	public double getSurface() {
		return surface;
	}
	
	public boolean estPlusGrand(Cercle cercle) {
	 if (this.rayon>cercle.rayon)
		 return true;
	 else 
		
		return false;
	}
	
	public String toString() {
		return super.toString()+ " Rayon: "+ rayon + " Surface: " +surface;
	}
}
