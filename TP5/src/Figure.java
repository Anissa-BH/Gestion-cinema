
public class Figure {
public double x;
public double y;

	public Figure() {
		x=0;
		y=0;
	}
	public Figure(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Position:(" +x+ "," +y+")";
	}
}
 //les attributs hérités sont x et y 
// on peut ajouter une méthode setSurface sans problème !