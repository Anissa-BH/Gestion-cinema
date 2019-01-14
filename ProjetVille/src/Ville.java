
public class Ville {
	
	protected String nomVille;
	protected int nbrHabitants;
	protected String nomPays;
	protected char categorie;
	public static int nbreInstances=0;
	protected static int nbreInstancesBis=0;

	public Ville() {
		System.out.println("Création d'une ville sans paramètres!");
		nomVille="Inconnu";
		nomPays="Inconnu";
		this.setCategorie();
		nbrHabitants=0;
		nbreInstances++;
		nbreInstancesBis++;
		
	}
   public Ville(String pNom,String pNomP,int pNbrH) {
	   System.out.println("Création d'une vielle avec paramètres!");
		nomVille=pNom;
		nbrHabitants=pNbrH;
		nomPays=pNomP;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;
		
}
   public static int getNombreInstancesBis() {   
	   /*On constate que le l'accesseur de la variable de classe est déclaré 
  static c'est une règle !  */ 
	   return nbreInstancesBis;
   }
   
   //*********Accesseurs*********   
   /*le principe d'encapsulation est que les variables sont protégés en dehors de la classe
    *  et ne sont accessible que via des accesseur et des mutateurs qu'on vient de créer */
       
   public String getNomVille() {
	   return nomVille;
   }
   public int getNbrHabitants() {
	   return nbrHabitants;
   }
   public String getNomPays() {
	   return nomPays;
   }
   public char getcategorie() {
	   return categorie;
   }
   
   //*********Mutateurs**********
  
   public void setNomVille(String nomVille) {
	   this.nomVille=nomVille;
   }
   public void setNomPays(String nomPays) {
	   this.nomPays=nomPays;
   }
   public void setNbrHabitants(int nbrHabitants) {
	   this.nbrHabitants=nbrHabitants;
	   this.setCategorie();
   }
   
   private void setCategorie() {
	   int tableauNbrHabitant []= {0,100,1000,10000,50000,1000000};
       char categories []= {'r','A','B','C','D','E'};
       int i=0;
       while(i<tableauNbrHabitant.length && this.nbrHabitants>=tableauNbrHabitant[i])
    	   i++;
       this.categorie=categories[i];
   }
   
   public String comparerDeuxVilles(Ville v1) {
	   String str=new String();
	   if (v1.nbrHabitants<this.nbrHabitants)
	   {
	   str="Le nombre d'habitant pour la ville " +v1.getNomVille()+ "  est inférieur au nombres d'habitants pour la ville " +  this.nomVille;
	   }
	   return str;
	   
	  }
   public String toString() {
	return "Le nom de cette ville est  "+this.nomVille+ " le nom du pays est "+this.nomPays+ " le nombre d'habitants est "+this.nbrHabitants+ "  D'ou la catégorie "+this.getcategorie(); 
 }





}
