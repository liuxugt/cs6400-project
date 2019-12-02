package cs6400.struct.movie;

public class GenreMovieRelated {
    private int id;
    private String name;
    private double average_rating;
    private int movie_count;

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getAverage_rating() {
        return average_rating;
    }
    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }
    public int getMovie_count() {
        return movie_count;
    }
    public void setMovie_count(int movie_count) {
        this.movie_count = movie_count;
    }

    public GenreMovieRelated(int id, String name, double average_rating, int movie_count) {
        this.id = id;
        this.name = name;
        this.average_rating = average_rating;
        this.movie_count = movie_count;
    }


    public GenreMovieRelated(int id, String name, double average_rating) {
        this.id = id;
        this.name = name;
        this.average_rating = average_rating;
        this.movie_count = 0;
    }

    public GenreMovieRelated() {
    }
}
