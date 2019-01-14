
public class TestBanque {

	public static void main(String[] args) {
		
		Personne client1=new Personne("Mounir","Ali",new Adresse(20,"Mohamed V","Tunis","Tunisie"));
    	Personne client2=new Personne("Hayet","Ben Ammar",new Adresse(48,"Khezama","Sousse","Tunisie"));
    	Personne client3=new Personne("Ahmed","Selmi",new Adresse(112,"Place de martyre","Monastir","Tunisie"));
		
		Compte compte1=new Compte(client1,23420, "1111");
		Compte compte2=new Compte(client2,10234, "2222");
		Compte compte3=new Compte(client3,12872, "3333");
		
		
		Banque banque=new Banque(5);
		
		System.out.println (banque);
		banque.ouvrir(compte1);
		System.out.println (banque);
		banque.cloturer(compte1);
		
		
	}
}
