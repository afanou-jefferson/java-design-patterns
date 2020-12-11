package fr.diginamic.builder.entite;

public class ZooBuilder {

	private Zoo zoo;

	public ZooBuilder(String nomZoo) {
		this.zoo = new Zoo(nomZoo);
	}

	public ZooBuilder appendZone(String nomZone, int capaciteZone) {

		this.zoo.getZonesZoo().add(new Zone(nomZone, capaciteZone));

		return this;

	}

	/*
	 * public ZooBuilder appendAnimal(String nomAnimal, String nomZone) {
	 * 
	 * Zone zone = null; for (Zone courrante : this.zoo.getZonesZoo()) { if
	 * (zone.getNomZone() == nomZone) {
	 * 
	 * } } }
	 */

	public Zoo get() {
		return this.zoo;
	}

}
