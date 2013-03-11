package org.mjavacam.tmdb.collections;

public class Crew implements java.io.Serializable {
	/**
	 * Class <code></code>
	 */
	private static final long serialVersionUID = 1125620457116646672L;
	private String department;
	private Number id;
	private String job;
	private String name;
	private String profile_path;

	public Crew() {
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Number getId() {
		return this.id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfile_path() {
		return this.profile_path;
	}

	public void setProfile_path(String profile_path) {
		this.profile_path = profile_path;
	}
}
