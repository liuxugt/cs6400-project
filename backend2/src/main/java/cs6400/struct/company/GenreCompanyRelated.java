package cs6400.struct.company;

public class GenreCompanyRelated {
    private int id;
    private String name;
    private int movie_count;
    private double average_rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMovie_count() {
        return movie_count;
    }

    public void setMovie_count(int movie_count) {
        this.movie_count = movie_count;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public GenreCompanyRelated(int id, String name, int movie_count, double average_rating) {
        this.id = id;
        this.name = name;
        this.movie_count = movie_count;
        this.average_rating = average_rating;
    }
}
