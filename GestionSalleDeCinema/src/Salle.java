
public class Salle {
	
	private int numero;
	private int nombreDePlace;
	
  public Salle() {}

	
  public Salle(int numero, int nombreDePlace) {
	
	  	this.nombreDePlace=nombreDePlace;
		this.numero=numero;
   }
  
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNombreDePlace() {
		return nombreDePlace;
	}

	public void setNombreDePlace(int nombreDePlace) {
		this.nombreDePlace = nombreDePlace;
	}

	

	public String toString() {
		return "Numéro "+this.numero+ "NOMBRE DE PLACE "+this.nombreDePlace;
	}

	
	
}
