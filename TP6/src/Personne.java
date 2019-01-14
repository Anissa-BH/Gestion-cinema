
public class Personne {
	private String nom;
	private int age;
	public float[] mesNombres; /* comment l'utiliser s'il est declaré privé ? */

	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
		mesNombres=new float[10];
		
	}
	
	public Personne() {
	this("null",20);
	}
	
	public Personne(Personne p) {
		this(p.nom,p.age);
	}

	public void afficher() {
		
		System.out.println("Nom: " + this.nom + " Age: " + this.age);
		for(float x:mesNombres) {
			if (x!=0)
				System.out.println(x);
		}
	}
	
	public void afficher(boolean compact) {
		if(!compact)
			afficher();
		else
			System.out.println("["+this.nom +", "+this.age+"]");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
