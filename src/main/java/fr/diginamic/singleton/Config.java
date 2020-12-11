package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Config {

	ResourceBundle configBundle;

	public static Config CONFIG = new Config();

	/** Constructeur privé */
	private Config() {
		this.configBundle = ResourceBundle.getBundle("configuration");
	}

	/** Récuperer parametres configs */
	public static String getParameterConfig(String keyParam) {
		return CONFIG.configBundle.getString(keyParam);
	}
}
