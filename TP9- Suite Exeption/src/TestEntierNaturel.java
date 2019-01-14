
public class TestEntierNaturel {

	public static void main(String[] args) {
		
		EntierNaturel x=new EntierNaturel(6);
		
		EntierNaturel en=null;
		try {
			en=new EntierNaturel(-5);
			en.setEntier(3);
			en.decrementer(x);
		}
		catch(ErrorConstructor e1) {
			e1.printStackTrace();
		}
		catch(ErrorUpdate e2) {             // je redéfinit ErrorUpdate ?? 
			e2.printStackTrace();
		}
		
		

	}

}
