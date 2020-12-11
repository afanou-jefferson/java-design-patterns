package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.factory.entite.ObjetConnecte;

public class ObjetConnecteFactoryTest {

	@Test
	public void testGetInstance() {
		ObjetConnecte obj = ObjetConnecteFactory.getInstance(ETypeObjetConnecte.TELEPHONEPORTABLE, 25);
		assertEquals(25, obj.getLimiteVolts());
	}

	@Test
	public void testGetInstance2() {
		ObjetConnecte obj = ObjetConnecteFactory.getInstance(ETypeObjetConnecte.TABLETTE, 35);
		assertEquals(35, obj.getLimiteVolts());
	}

	@Test
	public void testGetInstance3() {
		ObjetConnecte obj = ObjetConnecteFactory.getInstance(ETypeObjetConnecte.ENCEINTECO, 45);
		assertEquals(45, obj.getLimiteVolts());
	}

}
