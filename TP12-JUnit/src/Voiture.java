
public class Voiture {

	private String type;
	private double poids, puissance;
	
	
	public Voiture(String type, double poids, double puissance) {

		this.type = type;
		this.poids = poids;
		this.puissance = puissance;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPoids() {
		return poids;
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	public double getPuissance() {
		return puissance;
	}


	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}
	
	
	// calcule le rapport Poids-Puissance de la voiture
	public double rapportPoidsPuissance() {
		
		double rapport;
		rapport = poids/puissance;
		return rapport;
	}
	
}
