
public class TestFigure {

	
	public static void main(String[] args) {
		Cercle cercle1;
		Cercle cercle2;
		Cercle cercle3;
		cercle1=new Cercle(1,1,6);
		cercle2=new Cercle();
		
		System.out.println(cercle1.toString()+"\n" + cercle2);
		
		if(cercle1.estPlusGrand(cercle2))
			System.out.println("le cercle 1 est plus grand");
		else
			System.out.println("le cercle 1 n'est pas le plus grand ");
	}

}
