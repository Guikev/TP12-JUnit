import java.util.ArrayList;


public class Marque {

	private String nom;
	private ArrayList<Circuit> lesCircuits;
	
	
	// constructeur de la classe Marque
	public Marque(String leNom) {
		
		nom = leNom;
		lesCircuits = new ArrayList<Circuit>();	
	}
	

	// accesseur de la propriété nom
	public String getNom() {
		return nom;
	}
	
	
	// modificateur de la propriété nom
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
		//accesseur de la propriété lesCircuits
	public ArrayList<Circuit> getLesCircuits() {
		return lesCircuits;
	}

	
	// modificateur de la propriété lesCircuits
	public void setLesCircuits(ArrayList<Circuit> lesCircuits) {
		this.lesCircuits = lesCircuits;
	}
	
	
	// retourne une collection de circuits ayant une longueur supérieure à laLongueur
	public ArrayList<Circuit> circuitsAyantUneLongueurMinimale(double laLongueur) {
		
		ArrayList<Circuit> circuits = new ArrayList<Circuit>();
		for (Circuit c: lesCircuits) {
			if(c.getLongueur() >= laLongueur) {
				circuits.add(c);
			}
		}
		return circuits;
	}
	
	
	// retourne une collection de circuits ayant une voiture de même type leType
	public ArrayList<Circuit> circuitsAyantUnTypeDeVoiture(String leType) {
		
		ArrayList<Circuit> circuits = new ArrayList<Circuit>();
		for (Circuit c: lesCircuits) {
			for(Voiture v: c.getLesVoitures()) {
				if(v.getType() == leType) {
					circuits.add(c);
				}
			}
		}
		return circuits;
	}
	
	
	// retourne le circuit ayant la voiture dont le rapport Poids-Puissance est le plus faible
	public Circuit circuitAyantLaVoitureLaPlusPuissante() {
		
		double puissance = lesCircuits.get(0).getLesVoitures().get(0).rapportPoidsPuissance();
		Circuit circuitPuissant = lesCircuits.get(0);
		for(Circuit c : lesCircuits){
			for(Voiture v : c.getLesVoitures()){
				if(puissance <= v.rapportPoidsPuissance()){
					puissance = v.rapportPoidsPuissance();
					circuitPuissant = c;
				}
			}
			
		}
		return circuitPuissant;
	}
	
	
	// retourne le cumul des prix de vente de tous les circuits de la marque
	public double caMarque() {
		double ca = 0;
		for(Circuit c: lesCircuits) {
			ca += c.prixVente();
		}
		return ca;
	}

}