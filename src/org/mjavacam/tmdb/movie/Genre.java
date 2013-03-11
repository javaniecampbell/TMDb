package org.mjavacam.tmdb.movie;

public class Genre implements java.io.Serializable {
	/**
	 * Class <code>Genre</code>
	 */
	private static final long serialVersionUID = 7705297004877948307L;
	private Number id;
	private String name;

	public Genre() {
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
