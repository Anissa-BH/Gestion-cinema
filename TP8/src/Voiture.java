
public class Voiture {
	private String immatriculation;
	private String marque;
	private float prix;
	
	

	public Voiture(String immatriculation, String marque,float prix) {
		this.immatriculation=immatriculation;
		this.marque=marque;
		this.prix=prix;
		
		
	}
	
	public void voitureEgale(Voiture voiture) {
		if ((this.immatriculation.equals(voiture.immatriculation))&&(this.marque.equals(voiture.marque)))
			System.out.println("voitures egales");
		else
			System.out.println("Voitures non égales");
	}

}
