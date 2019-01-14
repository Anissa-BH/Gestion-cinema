
public class TestCarnet {

	public static void main(String[] args) {
		
		Coordonnees c1=new Coordonnees("Bac", "Youssef", 501222222, "Rue gustave, Paris");
		Coordonnees c2=new Coordonnees("katchou", "doremi", 501222222, "Rue gustave, Paris");
		Coordonnees c3=new Coordonnees("koukou", "Imed", 501222222, "Rue gustave, Paris");
		CarnetCoordonnees carnet1=new CarnetCoordonnees(5); 
		carnet1.ajouter(c1);
		carnet1.ajouter(c2);
		carnet1.ajouter(c3);
		
		System.out.println(carnet1.toString());



}
}