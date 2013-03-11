package org.mjavacam.tmdb.movie;

import java.util.List;

public class Release implements java.io.Serializable {
	/**
	 * Class <code>Release</code>
	 */
	private static final long serialVersionUID = 6414125547036397742L;
	private List<Country> countries;
	private Number id;

	public Release() {
	}

	public List<Country> getCountries() {
		return this.countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public Number getId() {
		return this.id;
	}

	public void setId(Number id) {
		this.id = id;
	}
}
