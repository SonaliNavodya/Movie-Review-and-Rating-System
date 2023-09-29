public class BollywoodMovieReview extends Review {
    private static String songName;

    public BollywoodMovieReview(String movieName, String actorName, String category, String comments) {
        super(movieName, actorName, category, comments);
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public static void displayReview() {
        System.out.println("Bollywood Movie Review:");
        System.out.println("Movie Name: " + getMovieName());
        System.out.println("Actor Name: " + getActorName());
        System.out.println("Category: " + getCategory());
        System.out.println("Comments: " + getComments());

    }


}

