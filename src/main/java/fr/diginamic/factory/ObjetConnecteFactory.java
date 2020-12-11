package fr.diginamic.factory;

import fr.diginamic.factory.entite.EnceinteConnectee;
import fr.diginamic.factory.entite.ObjetConnecte;
import fr.diginamic.factory.entite.Tablette;
import fr.diginamic.factory.entite.TelPortable;

public class ObjetConnecteFactory {

	public static ObjetConnecte getInstance(ETypeObjetConnecte typeObj, int limiteVolt) {

		ObjetConnecte objetToReturn = null;

		switch (typeObj) {
		case TELEPHONEPORTABLE:
			objetToReturn = new TelPortable(limiteVolt);
			break;

		case TABLETTE:
			objetToReturn = new Tablette(limiteVolt);
			break;

		case ENCEINTECO:
			objetToReturn = new EnceinteConnectee(limiteVolt);
			break;

		default:
			break;
		}
		return objetToReturn;
	}

}
