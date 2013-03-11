package org.mjavacam.tmdb.collections;

public class Cast implements java.io.Serializable {
	/**
	 * Class <code>Cast</code>
	 */
	private static final long serialVersionUID = 4956815796727819568L;
	private Number cast_id;
	private String character;
	private Number id;
	private String name;
	private Number order;
	private String profile_path;

	public Cast() {
	}

	public Number getCast_id() {
		return this.cast_id;
	}

	public void setCast_id(Number cast_id) {
		this.cast_id = cast_id;
	}

	public String getCharacter() {
		return this.character;
	}

	public void setCharacter(String character) {
		this.character = character;
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

	public Number getOrder() {
		return this.order;
	}

	public void setOrder(Number order) {
		this.order = order;
	}

	public String getProfile_path() {
		return this.profile_path;
	}

	public void setProfile_path(String profile_path) {
		this.profile_path = profile_path;
	}
}
