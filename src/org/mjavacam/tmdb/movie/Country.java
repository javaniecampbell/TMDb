package org.mjavacam.tmdb.movie;

public class Country implements java.io.Serializable {
	/**
	 * Class <code>Country</code>
	 */
	private static final long serialVersionUID = 7737081988261913499L;
	private String certification;
	private String iso_3166_1;
	private String release_date;

	public Country() {
	}

	public String getCertification() {
		return this.certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getIso_3166_1() {
		return this.iso_3166_1;
	}

	public void setIso_3166_1(String iso_3166_1) {
		this.iso_3166_1 = iso_3166_1;
	}

	public String getRelease_date() {
		return this.release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
}
