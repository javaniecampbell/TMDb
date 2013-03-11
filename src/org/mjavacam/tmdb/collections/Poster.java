package org.mjavacam.tmdb.collections;

public class Poster implements java.io.Serializable {
	/**
	 * Class <code>Poster</code>
	 */
	private static final long serialVersionUID = 3093690031015732993L;
	private Number aspect_ratio;
	private String file_path;
	private Number height;
	private String iso_639_1;
	private Number vote_average;
	private Number vote_count;
	private Number width;

	public Poster() {
	}

	public Number getAspect_ratio() {
		return this.aspect_ratio;
	}

	public void setAspect_ratio(Number aspect_ratio) {
		this.aspect_ratio = aspect_ratio;
	}

	public String getFile_path() {
		return this.file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

	public Number getHeight() {
		return this.height;
	}

	public void setHeight(Number height) {
		this.height = height;
	}

	public String getIso_639_1() {
		return this.iso_639_1;
	}

	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}

	public Number getVote_average() {
		return this.vote_average;
	}

	public void setVote_average(Number vote_average) {
		this.vote_average = vote_average;
	}

	public Number getVote_count() {
		return this.vote_count;
	}

	public void setVote_count(Number vote_count) {
		this.vote_count = vote_count;
	}

	public Number getWidth() {
		return this.width;
	}

	public void setWidth(Number width) {
		this.width = width;
	}
}
