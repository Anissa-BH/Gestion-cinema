
public class SalleCinemaa {
	
	private Film film; 
	private int nbrPlace;
	private double pUnitaire;
	private int nbrVenduesN;
	private int nbrVenduesR;

	public SalleCinemaa(Film film,int nbrPlace, double pUnitaire) {
		this.film=film;
		this.nbrPlace=nbrPlace;
		this.pUnitaire=pUnitaire;
		
	}
	
	public int nbPlacesDisponibles() {
		return nbrPlace-(nbrVenduesN+nbrVenduesR);
	}

	public void vendrePlaces(int nbr, boolean tarifReduit) {
		if (nbr>nbPlacesDisponibles())
			System.out.println("Erreur");
		else 
		{
			if (tarifReduit)
			{
				System.out.println("Prix à payer est " +(pUnitaire*0.2f));
				nbrVenduesR+=nbr;
			}
			else {
				System.out.println("Prix à payer est " +pUnitaire);
				nbrVenduesN+=nbr;
				
			}
		}
	}
	public void remiseAzero() {
		nbrVenduesN=0;
		nbrVenduesR=0;
	}
	public double chiffreAfaires() {
		return pUnitaire*(nbrVenduesN +nbrVenduesR*0.2);
	}
	public double tauxRemplissage() {
		return (nbrVenduesN+nbrVenduesR)*100/nbrPlace;
	}
	
	public String toString() {
	return "Film joué " +film+",\n Nombre de places : " +nbrPlace+ ",\n Prix d'une place: "+pUnitaire+ ",\n" +nbrVenduesN+ " places vendues "
			+ "au tarif normal, \n " +nbrVenduesR+ " places vendues au tarif réduit";
				
	}
	
}
