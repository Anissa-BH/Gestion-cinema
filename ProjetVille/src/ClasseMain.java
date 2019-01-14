
public class ClasseMain {

	

	public static void main(String[] args) {
		
		/*Ville v1=new Ville("Marseille","France",546854);
		System.out.println("Le nombre d'instances de la classe ville est: " +Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe ville est: " +Ville.getNombreInstancesBis());
        
        
        Ville v2=new Ville("Paris","France",1254);
        System.out.println("Le nombre d'instances de la classe ville est: " +Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe ville est: " +Ville.getNombreInstancesBis());
        
        
        Ville v3=new Ville();
        System.out.println("Le nombre d'instances de la classe ville est: " +Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe ville est: " +Ville.getNombreInstancesBis());
        */
        Ville v4=new Ville();
        System.out.println(v4);
        
        Capitale c1=new Capitale();
        System.out.println(c1.toString());
        
        Capitale c2=new Capitale("Sousse","Tunisie",10000,"Cartage");
        System.out.println(c2.toString());
       
        Capitale c3=new Capitale("Paris","France",10000,"La tour Eiffel");
        System.out.println(c3.toString());
        
        //***************************************
        
        Ville [] tableau=new Ville[6];
        
        String [] tab ={"Marseille","lille","caen","lyon","paris","nantes" };
        
        int [] tab2= {123456,78456,654987,75832165,1594,213};
        
        for(int i=0; i<6; i++)
        {
        	if (i<3) {
        		Ville V= new Ville(tab[i],"France",tab2[i]);
        		tableau[i]=V;
        }
        	else {
        		Capitale C =new Capitale(tab[i],"France",tab2[i],"La tour Eiffel");
        	   tableau[i]=C;
        	}
        	}
        
        for(Object v : tableau)
        {
        	System.out.println(((Ville)v).toString()+ "\n");
        }
        
        
        
	}

}
