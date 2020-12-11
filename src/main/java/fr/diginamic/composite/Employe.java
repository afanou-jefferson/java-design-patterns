package fr.diginamic.composite;

public class Employe implements IElement {

	private double salaire;
	private String nom;
	private String prenom;

	public Employe(double salaire, String nom, String prenom) {
		super();
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}

}
