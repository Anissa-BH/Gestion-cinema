
public class CD extends Produit{
	private String titre;
	private String interprete;
	private String listeChansonContenu[];
	

	public CD(String titre, String interprete, String listeChansonContenu[],double prix) {
		super(prix);
		this.titre=titre;
		this.interprete=interprete;
		this.listeChansonContenu=listeChansonContenu;
		}
	
	public String toString() {
		String list="";
		for(int i=0;i<listeChansonContenu.length;i++)
			list+="\n"+listeChansonContenu[i];
		
		return super.toString()+" Titre: "+titre+ " Interprete: "+interprete+ " Liste chanson: "+list;
	}

}
