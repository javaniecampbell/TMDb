
package org.mjavacam.tmdb.collections;

import java.util.List;

public class Search implements java.io.Serializable{
   	/**
	 * Class <code>Search</code>
	 */
	private static final long serialVersionUID = -1545730036233471590L;
	private Number page;
   	private List<Result> result;
   	private Number total_pages;
   	private Number total_results;

   	public Search(){
   	}
 	public Number getPage(){
		return this.page;
	}
	public void setPage(Number page){
		this.page = page;
	}
 	public List<Result> getResults(){
		return this.result;
	}
	public void setResults(List<Result> result){
		this.result = result;
	}
 	public Number getTotal_pages(){
		return this.total_pages;
	}
	public void setTotal_pages(Number total_pages){
		this.total_pages = total_pages;
	}
 	public Number getTotal_results(){
		return this.total_results;
	}
	public void setTotal_results(Number total_results){
		this.total_results = total_results;
	}
}
