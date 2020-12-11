package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

	private List<IElement> listeElementsDuService;

	public Service() {
		super();
		this.listeElementsDuService = new ArrayList<IElement>();
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub

		double somme = 0;

		for (IElement elem : this.listeElementsDuService) {
			somme = somme + elem.calculerSalaire();
		}

		return somme;
	}

	public List<IElement> getListeElementsDuService() {
		return listeElementsDuService;
	}

	public void setListeElementsDuService(List<IElement> listeElementsDuService) {
		this.listeElementsDuService = listeElementsDuService;
	}

}
