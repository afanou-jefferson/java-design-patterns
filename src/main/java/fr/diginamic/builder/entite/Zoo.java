package fr.diginamic.builder.entite;

import java.util.List;

public class Zoo {

	private String nomZoo;

	private List<Zone> ZonesZoo;

	Zoo(String nomZoo) {
		super();
		this.nomZoo = nomZoo;
	}

	public String getNomZoo() {
		return nomZoo;
	}

	public void setNomZoo(String nomZoo) {
		this.nomZoo = nomZoo;
	}

	public List<Zone> getZonesZoo() {
		return ZonesZoo;
	}

	public void setZonesZoo(List zones) {
		ZonesZoo = zones;
	}

}
