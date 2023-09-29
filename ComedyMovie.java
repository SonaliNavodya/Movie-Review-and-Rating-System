import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComedyMovie extends Movie {
    private int laughCount;
    private static Map<String, Movie> movieMap = new HashMap<>();
    public ComedyMovie(String movieName, String directorName, int releaseYear, String genre, int laughCount) {
        super(movieName, directorName, releaseYear, genre);
        this.laughCount = laughCount;
    }

    public int getLaughCount() {
        return laughCount;
    }

    public static List<Movie> getMovieList() {
        return new ArrayList<>(movieMap.values());
    }
    public void setLaughCount(int laughCount) {
        this.laughCount = laughCount;
    }
}
