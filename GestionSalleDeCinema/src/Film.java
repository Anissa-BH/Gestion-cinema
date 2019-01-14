
public class Film {

	 private String titre;
	 private String nomRealisateur;
	 private int anneeRalisation;
	 private String description;
	
	
	 public Film() {
			
		}
	 
	 public Film(String titre,String nomRealisateur,int anneeRalisation,String description) {
		this.titre=titre;
		this.nomRealisateur=nomRealisateur;
		this.anneeRalisation=anneeRalisation;
		this.description=description;
		
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre=titre;
	}
	
	public String getNomrealisateur() {
		return nomRealisateur;
	}
	
	public void setNomRealisateur(String nomRealisateur) {
		this.nomRealisateur=nomRealisateur;
	}

	public int getAnneeRealisation() {
		return anneeRalisation;
	}
	
	public void setAnneeRealisation(int anneeRalisation) {
		this.anneeRalisation=anneeRalisation;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public String toString() {
		return "Titre:\t"+getTitre()+ "\nNom Du Réalisateur:\t"+this.nomRealisateur+"\nL'année De Réalisation:\t"+this.anneeRalisation+ "\nDescription:\t" +this.description; 
	}

	
}
