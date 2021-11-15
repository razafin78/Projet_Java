package fr.raphael.librairie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InventaireDeLivrestest {
	
	@Test
	void find_by_numero_test() {
		InventaireDeLivres<BD> invBD = new InventaireDeLivres<BD>();
		BD bd1 = new BD("Astérix&Obélix", "Albert Uderzo",4988,15,"Humoristique");
        BD bd2 = new BD("Les Légendaires", "Patrick Sobral",4987,20,"Aventure");
		invBD.add(bd1);
		invBD.add(bd2);
		Livre l = invBD.find_by_number(4988);
		assertTrue(bd1.equals(l));
	}

}
