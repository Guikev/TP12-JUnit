import java.util.ArrayList;


public class Circuit {

	private String nom;
	private double longueur, prixHa, tauxMarge;
	private ArrayList<Voiture> lesVoitures;
	
	
	public Circuit(String nom, double longueur, double prixHa, double tauxMarge, ArrayList<Voiture> lesVoitures) {
		
		this.nom = nom;
		this.longueur = longueur;
		this.prixHa = prixHa;
		this.tauxMarge = tauxMarge;
		this.lesVoitures = lesVoitures;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getLongueur() {
		return longueur;
	}


	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}


	public double getPrixHa() {
		return prixHa;
	}


	public void setPrixHa(double prixHa) {
		this.prixHa = prixHa;
	}


	public double getTauxMarge() {
		return tauxMarge;
	}


	public void setTauxMarge(double tauxMarge) {
		this.tauxMarge = tauxMarge;
	}


	public ArrayList<Voiture> getLesVoitures() {
		return lesVoitures;
	}


	public void setLesVoitures(ArrayList<Voiture> lesVoitures) {
		this.lesVoitures = lesVoitures;
	}
	
	
	// calcule le prix de vente du circuit selon le prix d'achat et le taux de marge
	public double prixVente() {
		
		double pv;
		pv = prixHa + (prixHa*tauxMarge);
		return pv;
	}
	
	
	// retourne la voiture la plus puissante du circuit :
	// celle dont le rapport Poids-Puissance est le plus faible
	public Voiture voitureLaPlusPuissanteDuCircuit() {
		
		Voiture voitureLaPlusPuissante = lesVoitures.get(0);
		for (Voiture v: lesVoitures) {
			if(v.rapportPoidsPuissance() < voitureLaPlusPuissante.rapportPoidsPuissance()) {
				voitureLaPlusPuissante = v;
			}
		}
		return voitureLaPlusPuissante;
	}
	
}
