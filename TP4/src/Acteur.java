
public class Acteur {

	private String nom;
	private String role;
	private String apparence;
	
	public Acteur(String nom, String role,String apparence) {
		this.nom=nom;
		this.role=role;
		this.apparence=apparence;
		
	}
	public String getNom() {
		return nom;
		
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getApparence() {
		return apparence;
	}
	public void setApparence(String apparence) {
		this.apparence=apparence;
	}
	public String getRole() {
		return role;
		
	}
	public void setRole(String role) {
		this.role=role;
		
	}
	
}
