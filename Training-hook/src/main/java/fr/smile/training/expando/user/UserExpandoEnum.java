package fr.smile.training.expando.user;

import com.liferay.portlet.expando.model.ExpandoColumnConstants;

/**
 * List of availables custom fields for Liferay User
 *  @author guillaumelenoir
 *
 */
public enum UserExpandoEnum {
	FONCTION("fonction", ExpandoColumnConstants.STRING_ARRAY,new String[] { "display-type=selection-list" }),
	INSCRIT("inscrit",ExpandoColumnConstants.BOOLEAN),
	CGV("cgv", ExpandoColumnConstants.BOOLEAN),
	CGU("cgu", ExpandoColumnConstants.BOOLEAN),
	DATE_VALIDATION_CGV("date_validation_cgv", ExpandoColumnConstants.DATE),
	DATE_VALIDATION_CGU("date_validation_cgU", ExpandoColumnConstants.DATE),
	VOITURE("voiture", ExpandoColumnConstants.STRING);
	;

	private String name;
	private int type;
	private boolean secret = false;
	private String[] settings;

	UserExpandoEnum(String name, int type) {
		this.name = name;
		this.type = type;
	}

	UserExpandoEnum(String name, int type, boolean secret) {
		this.name = name;
		this.type = type;
		this.secret = secret;
	}

	UserExpandoEnum(String name, int type, String[] settings) {
		this.name = name;
		this.type = type;
		this.settings = settings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String[] getSettings() {
		return settings;
	}

	public void setSettings(String[] settings) {
		this.settings = settings;
	}
}
