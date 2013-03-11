package org.mjavacam.tmdb;

import java.util.List;

public class Configuration implements java.io.Serializable {
	/**
	 * Class <code>Configuration</code>
	 */
	private static final long serialVersionUID = 5149536108522157843L;
	private List<String> change_keys;
	private Image image;

	public Configuration() {
	}

	public List<String> getChange_keys() {
		return this.change_keys;
	}

	public void setChange_keys(List<String> change_keys) {
		this.change_keys = change_keys;
	}

	public Image getImages() {
		return this.image;
	}

	public void setImages(Image image) {
		this.image = image;
	}
}
