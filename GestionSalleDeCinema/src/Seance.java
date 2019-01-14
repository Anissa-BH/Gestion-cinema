
public class Seance {
	private Film film;
	private Salle salle;
	private String date;
	private String heure;
	private int nombrePalceNormale;
	private int nombrePlaceReduite;
	private int nombrePlaceGratuite;
	
public Seance() {}

public Seance(Film film, Salle salle, String date, String heure, int nombrePalceNormale, int nombrePlaceReduite) {
		
		
		this.film = film;
		this.salle = salle;
		this.date = date;
		this.heure = heure;
		this.nombrePalceNormale = nombrePalceNormale;
		this.nombrePlaceReduite = nombrePlaceReduite;
		this.nombrePlaceGratuite = nombrePlaceGratuite;
	}

public Seance( int nombrePalceNormale, int nombrePlaceReduite, int nombreDePlaceReduite) {
	
	this.nombrePalceNormale = nombrePalceNormale;
	this.nombrePlaceReduite = nombrePlaceReduite;
	this.nombrePlaceGratuite = nombrePlaceGratuite;
}


	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public int getNombrePalceNormale() {
		return nombrePalceNormale;
	}

	public void setNombrePalceNormale(int nombrePalceNormale) {
		this.nombrePalceNormale = nombrePalceNormale;
	}

	public int getNombrePlaceReduite() {
		return nombrePlaceReduite;
	}

	public void setNombrePlaceReduite(int nombrePlaceReduite) {
		this.nombrePlaceReduite = nombrePlaceReduite;
	}
	public int getNombrePlaceGratuite() {
		return nombrePlaceGratuite;
	}

	public void setNombrePlaceGratuite(int nombrePlaceGratuite) {
		this.nombrePlaceGratuite = nombrePlaceGratuite;
	}
	
	public float chiffreDaffaire(){
		return (10000*nombrePalceNormale + 6000*nombrePlaceReduite);
		
	}
	
	
	public String toString() {
		return "Séance: "+film.getTitre()+ " Date: "+date+ " Nombre de place normale : "+nombrePalceNormale+ " Nombre de place Réduite: "+nombrePlaceGratuite+
				" Nombre de place gratuite: "+nombrePlaceGratuite; 
	}

}
