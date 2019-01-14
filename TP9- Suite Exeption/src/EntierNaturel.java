
public class EntierNaturel {
	
	private int entier;

	public EntierNaturel() {
		
	}
	
	public EntierNaturel(int entier) throws ErrorConstructor 
	{
		if (entier<0)
			throw new ErrorConstructor();
		else
			this.entier=entier;
	}
	public int getEntier() {
		return entier;
	}
	
	public void setEntier(int entier) throws ErrorUpdate
	{
		if (entier<0)
			throw new ErrorUpdate();
		else
			this.entier=entier;
	}
	
	public int incrementer(EntierNaturel x) {
		
		return this.entier+=x.entier;
	}
	public int decrementer(EntierNaturel x) throws ErrorUpdate {
		
		if(x.entier>this.entier) 
			throw new ErrorUpdate();
		else 
			retuen this.entier-=x.entier;
		}
	public String toString() {
		return "l'entier est "+this.entier ;
 	}

}
