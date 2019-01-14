
public class Adresse {
	private int numero;
	private String rue;
	private String ville;
	private String pays; 

	public Adresse(int numero,String rue,String ville,String pays) {
		this.numero=numero;
		this.rue=rue;
		this.ville=ville;
		this.pays=pays;
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue=rue;
	}
	
	
	public String toString() {
		return "Numéro "+numero+ "\n Rue "+rue+ "\n Ville "+ville+ "\n Pays "+pays;
	}

}
