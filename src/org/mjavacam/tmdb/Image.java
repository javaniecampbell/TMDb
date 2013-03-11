package org.mjavacam.tmdb;

import java.util.List;

public class Image implements java.io.Serializable {
	/**
	 * Class <code>Images</code>
	 */
	private static final long serialVersionUID = -2395334235927486628L;
	private List<String> backdrop_sizes;
	private String base_url;
	private List<String> logo_sizes;
	private List<String> poster_sizes;
	private List<String> profile_sizes;
	private String secure_base_url;

	public Image() {
	}

	public List<String> getBackdrop_sizes() {
		return this.backdrop_sizes;
	}

	public void setBackdrop_sizes(List<String> backdrop_sizes) {
		this.backdrop_sizes = backdrop_sizes;
	}

	public String getBase_url() {
		return this.base_url;
	}

	public void setBase_url(String base_url) {
		this.base_url = base_url;
	}

	public List<String> getLogo_sizes() {
		return this.logo_sizes;
	}

	public void setLogo_sizes(List<String> logo_sizes) {
		this.logo_sizes = logo_sizes;
	}

	public List<String> getPoster_sizes() {
		return this.poster_sizes;
	}

	public void setPoster_sizes(List<String> poster_sizes) {
		this.poster_sizes = poster_sizes;
	}

	public List<String> getProfile_sizes() {
		return this.profile_sizes;
	}

	public void setProfile_sizes(List<String> profile_sizes) {
		this.profile_sizes = profile_sizes;
	}

	public String getSecure_base_url() {
		return this.secure_base_url;
	}

	public void setSecure_base_url(String secure_base_url) {
		this.secure_base_url = secure_base_url;
	}
}
