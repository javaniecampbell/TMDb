import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.mjavacam.tmdb.TMDb;
import org.mjavacam.tmdb.collections.GenreList;
import org.mjavacam.tmdb.collections.MovieList;
import org.mjavacam.tmdb.collections.Results;
import org.mjavacam.tmdb.movie.Genre;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	public static void main(String[] args) throws JsonParseException,
			JsonMappingException, IOException {
		TMDb tmdb = new TMDb();

//		ObjectMapper mapper = new ObjectMapper();
//		Results movie;// = mapper.readValue(tmdb.SearchMovieById(1858),
//						// Movie.class);
//		GenreList result = mapper.readValue(tmdb.GetAllGenres(),
//				GenreList.class);
//
//		Genre genre = new Genre();
//
//		for (int i = 0; i < 2; i++) {
//			genre = result.getGenres().get(i);
//
//			System.out.println(genre.getId() + " " + genre.getName());
//		}
//		MovieList results = mapper.readValue(
//				tmdb.GetAllMoviesByGenreId(genre.getId().intValue()),
//				MovieList.class);
//		for (int i = 0; i < 5; i++) {
//			movie = results.getResults().get(i);
//			System.out.println(movie.getTitle());
//		}
		String data = tmdb.GetAllGenres();
		System.out.println(data);
	}

	public static  String getJSON(String url) throws IOException {
		URL u = new URL(url);
		HttpURLConnection c = (HttpURLConnection) u.openConnection();
		try {
			c.setRequestMethod("GET");
			c.setRequestProperty("Content-length", "0");
			c.setUseCaches(false);
			c.setAllowUserInteraction(false);
			
			c.connect();
			//int status = c.getResponseCode();

			
				BufferedReader br = new BufferedReader(new InputStreamReader(
						c.getInputStream()));
				StringBuilder sb = new StringBuilder();
				String line ="";
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				br.close();
				return sb.toString();


		}finally{
		c.disconnect();
		}
	}
}
