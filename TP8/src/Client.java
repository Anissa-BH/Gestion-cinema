
public class Client {
	private String code;
	private String nom;
	private String prenom;
	
	 public Client(String code,String nom,String prenom) {
		 this.code=code;
		 this.nom=nom;
		 this.prenom=prenom;
		}
	 public void  clientEgaux(Client client) {
		 if ((this.code.equals(client.code))
				 System.out.println("client egaux");
		 else 
			 System.out.println("client non egaux");
	 }
	


}
