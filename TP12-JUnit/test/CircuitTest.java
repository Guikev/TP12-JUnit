import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class CircuitTest {

	
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testConstructeur() {
		Circuit unCircuit;
		Voiture uneVoiture;
		ArrayList<Voiture> lesVoitures = new ArrayList<Voiture>();
		
		uneVoiture = new Voiture("Ferrari", 50.0, 2.0);
		lesVoitures.add(uneVoiture);
		
		unCircuit = new Circuit("Bouray", 30, 12.99, 1.35, lesVoitures);
		
		assertNotNull("Constructeur incorrect", unCircuit);	
	}
	
	@Test
	public void testPrixVente(){
		Circuit unCircuit;
		Voiture uneVoiture;
		ArrayList<Voiture> lesVoitures = new ArrayList<Voiture>();
		
		uneVoiture = new Voiture("Ferrari", 50.0, 2.0);
		lesVoitures.add(uneVoiture);
		
		unCircuit = new Circuit("Bouray", 30, 10000, 0.5, lesVoitures);
		
		assertTrue("Prix de vente incorrect",unCircuit.prixVente() == 15000 );
	}
	
	@Test
	public void testVoitureLaPlusPuissanteDuCircuit(){
		Circuit unCircuit;
		Voiture v1, v2, v3;
		ArrayList<Voiture> lesVoitures = new ArrayList<Voiture>();
		
		v1 = new Voiture("Ferrari", 500, 200);
		v2 = new Voiture("Agila", 500, 300); //La plus puissante
		v3 = new Voiture("Porshe", 500, 100);
		
		lesVoitures.add(v1);
		lesVoitures.add(v2);
		lesVoitures.add(v3);
		
		unCircuit = new Circuit("Bouray", 30, 10000, 0.5, lesVoitures);
		
		assertSame("Voiture la plus puissante du circuit incorrect",v2, unCircuit.voitureLaPlusPuissanteDuCircuit());
	}

}
