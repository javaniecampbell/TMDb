package org.mjavacam.tmdb.movie;

public class ProductionCompany implements java.io.Serializable {
	/**
	 * Class <code>ProductCompany</code>
	 */
	private static final long serialVersionUID = 5862632994025164662L;
	private Number id;
	private String name;

	public ProductionCompany() {
	}

	public Number getId() {
		return this.id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
