/**
 * 
 */
package org.mjavacam.tmdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author SapnaRaver
 * 
 */
public class TMDb {
	private static String _apiKey;
	private final String BASE_API_URL = "http://api.themoviedb.org/3/";

	// This is the private fields for the configuration

	public TMDb() {
		setApiKey("3828ed361d9bc89c8cf878df2275c368");
	}

	public TMDb(String apiKey) {
		setApiKey(apiKey);
	}

	public String getApiKey() {
		return _apiKey;
	}

	public void setApiKey(String apiKey) {
		_apiKey = apiKey;
	}

	public String SearchMovieById(int movieId)
			throws UnsupportedEncodingException {
		String url = BASE_API_URL +  "movie/" + movieId + "?api_key="
				+ getApiKey();

		return getJSON(url);

	}

	private String stringEscape(String queryString)
			throws UnsupportedEncodingException {
		return URLEncoder.encode(queryString, "UTF-8");
	}

	public String SearchMovieByTitle(String title) throws UnsupportedEncodingException {
		String url = BASE_API_URL + "search/movie?api_key="+getApiKey()+"&query="+ stringEscape(title);
		return getJSON(url);
	}

	public String SearchMovieByTitle(String title, int page) throws UnsupportedEncodingException {
		String url = BASE_API_URL + "search/movie?api_key="+getApiKey()+"&query="+ stringEscape(title) +"&page="+page;
		return getJSON(url);
	}

	public String SearchMovieByTitle(String title, int page, String language) throws UnsupportedEncodingException {
		String url = BASE_API_URL + "search/movie?api_key="+getApiKey()+"&query="+ stringEscape(title)+"&page="+page+"&language="+
				stringEscape(language);
		
		return getJSON(url);
	}

	public String SearchMovieByTitle(String title, int page, String language,
			Boolean includeAdult) throws UnsupportedEncodingException {
		String url = BASE_API_URL + "search/movie?api_key="+getApiKey()+"&query="+ stringEscape(title)+"&page="+page+"&language="+
				stringEscape(language)+"&include_adult="+includeAdult;
		return getJSON(url);
	}

	public String SearchMovieByTitle(String title, int page, String language,
			Boolean includeAdult, String year) throws UnsupportedEncodingException {
		String url = BASE_API_URL + "search/movie?api_key="+getApiKey()+"&query="+ stringEscape(title)+"&page="+page+"&language="+
			stringEscape(language)+"&include_adult="+includeAdult+stringEscape(year);
		
		

		return getJSON(url);
	}

	public String GetAllGenres()
	{
		String url = BASE_API_URL + "genre/list" +"?api_key="+getApiKey();
		//return getJSON(url);
		return url;
		
	}
	
	public String GetAllMoviesByGenreId(int genreId)
	{
		String url = BASE_API_URL + "genre/"+genreId+"/movies" +"?api_key="+getApiKey();
		return getJSON(url);
		//return url;
	}
	/**
	 * JSON Parser http://stackoverflow.com/questions/10500775/parse-json-from-
	 * httpurlconnection-object
	 * 
	 * @param url
	 *            The url of the json result.
	 * @param timeout
	 *            The time before the query times out
	 * @return String of JSON data
	 */
	public String getJSON(String url) {
		try {
			URL u = new URL(url);
			HttpURLConnection c = (HttpURLConnection) u.openConnection();
			c.setRequestMethod("GET");
			c.setRequestProperty("Content-length", "0");
			c.setUseCaches(false);
			c.setAllowUserInteraction(false);
			// , int timeout
			// c.setConnectTimeout(timeout);
			// c.setReadTimeout(timeout);
			c.connect();
			int status = c.getResponseCode();

			switch (status) {
			case 200:
			case 201:
				BufferedReader br = new BufferedReader(new InputStreamReader(
						c.getInputStream()));
				StringBuilder sb = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				br.close();
				return sb.toString();
			}

		} catch (MalformedURLException ex) {
			Logger.getLogger(TMDb.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(TMDb.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
}
