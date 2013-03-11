package org.mjavacam.tmdb.collections;

import java.util.List;

public class MovieImages implements java.io.Serializable {
	/**
	 * Class <code>MovieImages</code>
	 */
	private static final long serialVersionUID = -2807139396589487805L;
	private List<Backdrop> backdrops;
	private Number id;
	private List<Poster> posters;

	public MovieImages() {
	}

	public List<Backdrop> getBackdrops() {
		return this.backdrops;
	}

	public void setBackdrops(List<Backdrop> backdrops) {
		this.backdrops = backdrops;
	}

	public Number getId() {
		return this.id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public List<Poster> getPosters() {
		return this.posters;
	}

	public void setPosters(List<Poster> posters) {
		this.posters = posters;
	}
}
