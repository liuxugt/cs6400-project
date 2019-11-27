package cs6400.struct;

public class GenreMovieRelated {
    private int id;
    private String name;
    private double voting_average;
    private int movie_count;
    private int voting_count;

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
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

    public GenreMovieRelated(int id, String name, double voting_average, int movie_count, int voting_count) {
        this.id = id;
        this.name = name;
        this.voting_average = voting_average;
        this.movie_count = movie_count;
        this.voting_count = voting_count;
    }


    public GenreMovieRelated(int id, String name, double voting_average) {
        this.id = id;
        this.name = name;
        this.voting_average = voting_average;
        this.movie_count = 0;
        this.voting_count = 0;
    }

    public GenreMovieRelated() {
    }
}
