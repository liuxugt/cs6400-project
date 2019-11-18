package cs6400.struct;

public class GenreMovieRelated {
    private String name;
    private double voting_average;
    private int movie_count;
    private int voting_count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVoting_average() {
        return voting_average;
    }

    public void setVoting_average(double voting_average) {
        this.voting_average = voting_average;
    }

    public int getMovie_count() {
        return movie_count;
    }

    public void setMovie_count(int movie_count) {
        this.movie_count = movie_count;
    }

    public int getVoting_count() {
        return voting_count;
    }

    public void setVoting_count(int voting_count) {
        this.voting_count = voting_count;
    }

    public GenreMovieRelated(String name, double voting_average, int movie_count, int voting_count) {
        this.name = name;
        this.voting_average = voting_average;
        this.movie_count = movie_count;
        this.voting_count = voting_count;
    }

    public GenreMovieRelated() {
    }
}
