
public class TestPersonne {

	public static void main(String[] args) {
		Personne p=new Personne("Steave",30);
		 p.mesNombres[0]=45;
		 p.mesNombres[1]=20;
		 p.mesNombres[5]=6;
		 p.afficher();
		 
		 Personne p1=new Personne();
		 
		 p1.mesNombres[0]=12;
		 p1.mesNombres[1]=3;
		 p1.mesNombres[3]=1;
		 
		 p1.afficher();
		 
		 Personne p2=new Personne(p);
		 
		 p2.mesNombres[0]=12;
		 p2.mesNombres[1]=0;
		 p2.mesNombres[3]=0;
		 
		 p2.afficher();
		 
		 
	}

}
