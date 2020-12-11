package fr.diginamic.builder.entite;

public abstract class Animal {

	private String nomAnimal;

	public Animal(String nomAnimal) {
		super();
		this.nomAnimal = nomAnimal;
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

}
