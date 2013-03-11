package org.mjavacam.tmdb.collections;

import java.util.List;

public class MovieCast implements java.io.Serializable {
	/**
	 * Class <code>MovieCast</code>
	 */
	private static final long serialVersionUID = 1934688893846022770L;
	private List<Cast> cast;
	private List<Crew> crew;
	private Number id;

	public MovieCast() {
	}

	public List<Cast> getCast() {
		return this.cast;
	}

	public void setCast(List<Cast> cast) {
		this.cast = cast;
	}

	public List<Crew> getCrew() {
		return this.crew;
	}

	public void setCrew(List<Crew> crew) {
		this.crew = crew;
	}

	public Number getId() {
		return this.id;
	}

	public void setId(Number id) {
		this.id = id;
	}
}
