
public class CercleDeCouleur extends Cercle {
	private int coloration;

	public CercleDeCouleur() {
		coloration=0;
	}
	
	public CercleDeCouleur(double x, double y, double rayon, int coloration) {
	super(x,y,rayon);
	this.coloration=coloration;
	}
}
 // la classe cynlindre n'hérite pas l'atribut coloration