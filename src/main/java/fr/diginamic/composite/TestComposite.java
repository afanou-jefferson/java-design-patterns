package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {

		Service dsin = new Service();
		Employe cecile = new Employe(10000, "Raspey", "Cécile");
		Employe bilel = new Employe(8000, "Bechkar", "Bilel");
		dsin.getListeElementsDuService().add(cecile);
		dsin.getListeElementsDuService().add(bilel);

		Service bigData = new Service();
		Employe kevin = new Employe(7500, "Guineau", "Cécile");
		Employe martin = new Employe(3500, "Martin", "Paul");
		bigData.getListeElementsDuService().add(kevin);
		bigData.getListeElementsDuService().add(martin);
		dsin.getListeElementsDuService().add(bigData);

		Service javaDev = new Service();
		Employe jb = new Employe(7500, "Ranmey", "JB");
		Employe jane = new Employe(3500, "Doe", "Jane");
		javaDev.getListeElementsDuService().add(jb);
		javaDev.getListeElementsDuService().add(jane);
		dsin.getListeElementsDuService().add(javaDev);

		System.out.println("Salaire DSIN : " + dsin.calculerSalaire());
		System.out.println("Salaire bigData : " + bigData.calculerSalaire());
		System.out.println("Salaire javaDev : " + javaDev.calculerSalaire());

	}

}
