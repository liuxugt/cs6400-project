package cs6400.struct.company;

public class CastCompanyRelated {
    private String name;
    private int id;
    private double order_rating;
    private int movie_count;
    private double average_rating;

    public CastCompanyRelated(String name, int id, double order_rating, int movie_count, double average_rating) {
        this.name = name;
        this.id = id;
        this.order_rating = order_rating;
        this.movie_count = movie_count;
        this.average_rating = average_rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOrder_rating() {
        return order_rating;
    }

    public void setOrder_rating(double order_rating) {
        this.order_rating = order_rating;
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
}
