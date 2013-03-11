
package org.mjavacam.tmdb.collections;


public class Results implements java.io.Serializable{
   	/**
   	 * A movie from a genre
	 * Class <code>Results</code>
	 */
	private static final long serialVersionUID = 3450658815787709169L;
	private String backdrop_path;
   	private Number id;
   	private String original_title;
   	private String poster_path;
   	private String release_date;
   	private String title;
   	private Number vote_average;
   	private Number vote_count;

   	public Results() {
	
	}
 	public String getBackdrop_path(){
		return this.backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path){
		this.backdrop_path = backdrop_path;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public String getOriginal_title(){
		return this.original_title;
	}
	public void setOriginal_title(String original_title){
		this.original_title = original_title;
	}
 	public String getPoster_path(){
		return this.poster_path;
	}
	public void setPoster_path(String poster_path){
		this.poster_path = poster_path;
	}
 	public String getRelease_date(){
		return this.release_date;
	}
	public void setRelease_date(String release_date){
		this.release_date = release_date;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
 	public Number getVote_average(){
		return this.vote_average;
	}
	public void setVote_average(Number vote_average){
		this.vote_average = vote_average;
	}
 	public Number getVote_count(){
		return this.vote_count;
	}
	public void setVote_count(Number vote_count){
		this.vote_count = vote_count;
	}
}
