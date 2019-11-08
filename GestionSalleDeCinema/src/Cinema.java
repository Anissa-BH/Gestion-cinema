import java.util.Scanner;

public class Cinema {
	
  static Film[] listeFilm;
  static Seance[] listeSeance;
  static Salle[] listeSalle;

  static int nombreFilm=0; 
  static int nombreSeance=0;
  static int nombreSalle=0; 
	
    public Cinema() {}
  
    public static void afficherLesFilms() {
      System.out.println("----------------------");
      for(int i=0;i<nombreFilm;i++)
      System.out.println(listeFilm[i].getTitre()+"\n");
    }
	
    public void ajouterFilm(){
      Film film=new Film(); 
      Scanner scr=new Scanner(System.in);
      System.out.println("Enter le Titre du film");
      film.setTitre(scr.nextLine());
      System.out.println("Enter le nom du réalisateur");
      film.setNomRealisateur(scr.nextLine());
      System.out.println("Enter l'année de réalisation");
      film.setAnneeRealisation(scr.nextInt());
      System.out.print("Enter la déscription");
      film.setDescription(scr.nextLine());
      listeFilm[nombreFilm++]=film;
      System.out.println("le nombre des film est "+nombreFilm +"\n");
      System.out.println( "Le film <<"+ film.getTitre() +">> A été bien ajouter ! ");
    }
	
    public void modifierFilm() {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter le nom du film à modifier");
      String nomDuFilmArechercher=sc.nextLine();
      for(int i=0;i<listeFilm.length;i++)
      if(listeFilm[i].getTitre().equals(nomDuFilmArechercher))
      {  	
        System.out.println("Enter le Titre du film");
        listeFilm[i].setTitre(sc.nextLine());
        System.out.println("Enter le nom du réalisateur");
	listeFilm[i].setNomRealisateur(sc.nextLine());
	System.out.println("Enter l'année de réalisation");
	listeFilm[i].setAnneeRealisation(sc.nextInt());
	System.out.println("Enter la déscription");
	listeFilm[i].setDescription(sc.nextLine());
	break;
      }
      else
        System.out.println("Le que vous souhaitez modifier n'existe pas");
    }
	
    public static void supprimerFilm() {
      Scanner s=new Scanner(System.in);
      System.out.println("Entrer le Nom du film à supprimer ");
      String TitreFilmAsupprimer=s.nextLine();
      for(int i=0;i<listeFilm.length;i++)
      { 
        if(listeFilm[i].getTitre().equals(TitreFilmAsupprimer))
	  {
	    listeFilm[i]=listeFilm[i+1];
	    nombreFilm--;
	    System.out.println("Film supprimer");
	    break;
	  }
        else	
          System.out.println("Ce film n'esxiste pas");
	  }
    }
	
	public int rechercherFilm() {
	  System.out.println("Entrer le nom du film à rechercher ");
	  Scanner sc=new Scanner(System.in);
	  String titreArechercher=sc.nextLine();
	  for(int i=0;i<listeFilm.length;i++)
	  if(listeFilm[i].getTitre().equals(titreArechercher))
	   return i;
	  return -1;
	}
	
	public float tauxDeRemplissage() {
	  Salle salle=new Salle();
	  Seance seance=new Seance();
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Entrer le numéro de la salle");
	  salle.setNumero(scanner.nextInt());
	  System.out.println("Entrer le nombre total de place pour la salle numéro "+salle.getNumero());
	  salle.setNombreDePlace(scanner.nextInt());
	  System.out.println("Entrer le nombre de place normale ");
	  seance.setNombrePalceNormale(scanner.nextInt());
	  System.out.println("Entrer le nombre de place réduite ");
	  seance.setNombrePlaceReduite(scanner.nextInt());
	  System.out.println("Entrer le nombre de place gratuite ");
	  seance.setNombrePlaceGratuite(scanner.nextInt());
		
	  return (seance.getNombrePalceNormale()+seance.getNombrePlaceReduite()+seance.getNombrePlaceGratuite())*100/salle.getNombreDePlace();
	}
	
	public void menuDesSalle() {
          System.out.println("    -------------Gestion des Salles--------------    ");
	  System.out.println("choix numéro 1: Taux de remplissage de la salle");
	  System.out.println("choix numéro 2:Retour au Menu Principal");
	  System.out.print("Quelle est votre choix ? ");
          Scanner ch=new Scanner(System.in);
          int choix=ch.nextInt();
          switch(choix) { 
            case 1:
	      {
	         float taux= tauxDeRemplissage();
		 System.out.println("Le taux de remplisage de cette salle est de: "+taux);
		 break;
	      }
	    case 2:
	      {
		 //MenuPrincipal();
	         //break;
	      }
    	    default: System.out.println("Désolé ce choix n'est pas définit");   
	  }
	}
	
	public void menuDesFilm(){
	  System.out.println("    -------------Gestion des Film--------------    ");
	  System.out.println("choix numéro 1:Ajouter un Film");
	  System.out.println("choix numéro 2:Modifier Film");
	  System.out.println("choix numéro 3:Supprimer Film");
	  System.out.println("choix numéro 4:Recherche Film");
	  System.out.println("choix numéro 5:Afficher  Films");
	  System.out.println("choix numéro 6:Retour Menu Principal");
	  System.out.print("Quelle est votre choix ? ");
	  Scanner ch=new Scanner(System.in);
	  int choix=ch.nextInt();
	  switch(choix){
	    case 1:
	    {
	      ajouterFilm();
	      menuDesFilm();	            
	      break;
	    }       
	    case 2:
	    {
	      modifierFilm();
	      menuDesFilm();
	      break;
	    }  
	    case 3:
	    {
	      supprimerFilm(); 
	      menuDesFilm();
	      break;
	    }
	    case 4:
	    {
	      int trouve=rechercherFilm();
	      if(trouve!=-1)
	       {
	        System.out.println("Le film existe à la position "+trouve+ " Dans la liste ");
	        System.out.println(listeFilm[trouve]);
	       }
	      else
	       {
	        System.out.println("Le film n'existe pas");
	        menuDesFilm();
	        break;
	       }
	    case 5:
	    {
	      afficherLesFilms();
	      menuDesFilm();
	      break;
	    }
	  /*case 6:
	    {
	      MenuPrincipal();
	      break;
	    }*/
	   default: System.out.println("Désolé ce choix n'est pas définit");
	  }
	}
	
	public static void reserverSeance(Seance seance){
	  Scanner c=new Scanner(System.in);
	  Seance sea=new Seance();
	  System.out.println("Donner le nombre de places pour le tarifs normal");
	  int nombrePlaceNormale=sea.getNombrePalceNormale()+c.nextInt();
	  System.out.println("Donner le nombre de place pour le tarifs réduit");
	  int nombrePlaceReduite=sea.getNombrePlaceReduite()+c.nextInt();
	  System.out.println("donner les nombre des places des tarifs gratuits");
	  int nombrePlaceGratuite=sea.getNombrePlaceReduite()+c.nextInt();
	}
	
	public static void main(String args[]) {
          listeFilm=new Film[50];
	  listeSeance=new Seance[6];
	  listeSalle=new Salle[3];
	  Cinema cinema=new Cinema();
	  //Float t=cinema.tauxDeRemplissage();
	  //System.out.println("le taux de remplissage est "+t);
	  cinema.menuDesFilm();
          //MenuSeance();
          //MenuSalle();
          //MenuFilm();
    }
}
	
