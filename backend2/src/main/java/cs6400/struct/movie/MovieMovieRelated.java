package cs6400.struct.movie;

public class MovieMovieRelated {
    private String reason = null;
    private String id;
    private String title;
    private String release_date;
    private double order_rating;
    private double average_rating;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public double getOrder_rating() {
        return order_rating;
    }

    public void setOrder_rating(double order_rating) {
        this.order_rating = order_rating;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public MovieMovieRelated(String id, String title, String release_date, double order_rating, double average_rating) {
        this.id = id;
        this.title = title;
        this.release_date = release_date;
        this.order_rating = order_rating;
        this.average_rating = average_rating;
    }

    public MovieMovieRelated() {
    }
}
