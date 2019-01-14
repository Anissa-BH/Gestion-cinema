
public class TestFiguree {

	public static void main(String[] args) {
		Cercle cercle1;
		Cercle cercle2;
		
		cercle1=new Cercle(1,1,3);
		cercle2=new Cercle();
		System.out.println(cercle1+"\n"+ cercle2);
		
		CercleDeCouleur cdc=new CercleDeCouleur(3,5,2,50);
		CercleDeCouleur cdc1=new CercleDeCouleur();
		System.out.println(cdc +"\n" + cdc1);

	}

}
