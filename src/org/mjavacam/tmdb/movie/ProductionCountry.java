package org.mjavacam.tmdb.movie;

public class ProductionCountry implements java.io.Serializable {
	/**
	 * Class <code>ProductionCountry</code>
	 */
	private static final long serialVersionUID = 4815133386779044839L;
	private String iso_3166_1;
	private String name;

	public ProductionCountry() {
	}

	public String getIso_3166_1() {
		return this.iso_3166_1;
	}

	public void setIso_3166_1(String iso_3166_1) {
		this.iso_3166_1 = iso_3166_1;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
