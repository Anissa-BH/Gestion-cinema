import java.awt.geom.AffineTransform;

public class TestEnseignantEleve {

	public static void main(String[] args) {
		
		Personne tab[]=new Personne[5];
		
				tab[0]=new Enseignant ("Anne",40,20,true);
				tab[1]=new Enseignant ("Josef",30,2,false);
				tab[2]=new Etudiant ("Josef",30,"Math",12,false);
				tab[3]=new Etudiant ("Doremi",24,"INFO",15,true);
				tab[4]=new Etudiant ("Jiji",23,"Info",16,true);
		 
				for(int i=0;i<5;i++) {
					tab[i].afficher(true);
					if (tab[i] instanceof Etudiant)
						System.out.println("Etudiant");
					else
						System.out.println("Enseignant");
				}
		
        Personne per=new Personne("salah", 35);
		per.afficher();
		
		Enseignant ensaignant1=new Enseignant("salah",35,50,true);
		
		ensaignant1.afficher(true);
		
		Etudiant etudiant1=new Etudiant("Ali",20,"INFO",12,true);
		etudiant1.afficher(true);
	}

}
