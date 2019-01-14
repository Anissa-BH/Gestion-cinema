
public class TestSalleCinema {

	public static void main(String[] args) {
		
		
		Acteur acteur1=new Acteur("James", "défenceur", "Acteur Principal");
		Film film1=new Film("Bonheur Perdu", 70, "Drame", "Amerique", 2017, "James bou", "koulala");
		SalleCinemaa sc=new SalleCinemaa(film1, 50, 4500);
		System.out.println(sc);
		sc.vendrePlaces(5, true);
		System.out.println("---------------------------\n");
		
		System.out.println(sc);
		System.out.println("---------------------------\n");
		sc.vendrePlaces(18, false);
		System.out.println(sc);
		System.out.println("*********************\n");

		System.out.println("Place encore disponible:"+sc.nbPlacesDisponibles());
		System.out.println("Taux de remplissage "+sc.tauxRemplissage()+" % \n Chiffre d'affaire "+sc.chiffreAfaires());
		sc.vendrePlaces(40, true);
		System.out.println("\n");
		System.out.println(sc);
        
	}

}
