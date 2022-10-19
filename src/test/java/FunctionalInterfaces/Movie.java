package FunctionalInterfaces;

public class Movie {
    String movieName;
    long duration;

    public Movie(String movieName, long duration) {
        super();
        this.movieName = movieName;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
