package org.mjavacam.tmdb.movie;

public class SpokenLanguage implements java.io.Serializable {
	/**
	 * Class <code>SpokenLanguage</code>
	 */
	private static final long serialVersionUID = 5085384033256621199L;
	private String iso_639_1;
	private String name;

	public SpokenLanguage() {
	}

	public String getIso_639_1() {
		return this.iso_639_1;
	}

	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
