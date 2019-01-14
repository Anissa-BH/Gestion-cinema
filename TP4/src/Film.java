
public class Film {
	private String titre;
	private float duree;
	private String genre;
	private String paysOrigine;
	private int date;
	private String realisateur;
	private String producteur;
	private Acteur listeActeur[];
	int nbA=0;
	
	

	public Film(String titre,float duree,String genre,String paysOrigine,int date,String realisateur,String producteur) {
	     this.titre=titre;
		listeActeur=new Acteur[10];
	}
	public void ajouterActeur(Acteur acteur) {
		if(nbA<listeActeur.length)
			listeActeur[nbA++]=acteur;
	}

}
