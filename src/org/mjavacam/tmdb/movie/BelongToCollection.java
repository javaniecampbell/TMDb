package org.mjavacam.tmdb.movie;

public class BelongToCollection implements java.io.Serializable {
	/**
	 * Class <code>BelongToCollection</code>
	 */
	private static final long serialVersionUID = 6371216264561693439L;
	private String backdrop_path;
	private Number id;
	private String name;
	private String poster_path;

	public BelongToCollection() {
	}

	public String getBackdrop_path() {
		return this.backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public Number getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoster_path() {
		return this.poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
}
