import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BollywoodMovie extends Movie {
    private String language;
    private String actor;
    private static Map<String, Movie> movieMap = new HashMap<>();
    public BollywoodMovie(String movieName, String directorName, int releaseYear, String genre, String language, String actor) {
        super(movieName, directorName, releaseYear, genre);
        this.language = language;
        this.actor = actor;
    }

    public static List<Movie> getMovieList() {
        return new ArrayList<>(movieMap.values());
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return super.toString() + " (Language: " + language + ", Actor: " + actor + ")";
    }
}
