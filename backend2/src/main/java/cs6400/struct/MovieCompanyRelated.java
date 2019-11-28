package cs6400.struct;

public class MovieCompanyRelated {
    private int id;
    private String title;
    private double average_rating;
    private String release_date;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }public void setTitle(String title) { this.title = title; }
    public double getAverage_rating() { return average_rating; }
    public void setAverage_rating(double average_rating) { this.average_rating = average_rating; }
    public String getRelease_date() { return release_date; }
    public void setRelease_date(String release_date) { this.release_date = release_date; }


    public MovieCompanyRelated(int id, String title, double average_rating, String release_date) {
        this.id = id;
        this.title = title;
        this.average_rating = average_rating;
        this.release_date = release_date;
    }
}
