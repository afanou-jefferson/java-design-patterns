package fr.diginamic.builder.entite;

import java.util.ArrayList;
import java.util.List;

public class Zone {

	private String nomZone;

	private int capaciteZone;

	private List<Animal> animauxZone;

	public Zone(String nomZone, int capaciteZone) {
		super();
		this.nomZone = nomZone;
		this.capaciteZone = capaciteZone;
		this.animauxZone = new ArrayList<Animal>();
	}

	public String getNomZone() {
		return nomZone;
	}

	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	public int getCapaciteZone() {
		return capaciteZone;
	}

	public void setCapaciteZone(int capaciteZone) {
		this.capaciteZone = capaciteZone;
	}

	public List<Animal> getAnimauxZone() {
		return animauxZone;
	}

	public void setAnimauxZone(List<Animal> animauxZone) {
		this.animauxZone = animauxZone;
	}

}
