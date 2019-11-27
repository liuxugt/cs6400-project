package cs6400.struct;

public class MovieCompanyRelated {
    private int id;
    private String title;
    private double voting_average;
    private String release_date;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }public void setTitle(String title) { this.title = title; }
    public double getVoting_average() { return voting_average; }
    public void setVoting_average(double voting_average) { this.voting_average = voting_average; }
    public String getRelease_date() { return release_date; }
    public void setRelease_date(String release_date) { this.release_date = release_date; }


    public MovieCompanyRelated(int id, String title, double voting_average, String release_date) {
        this.id = id;
        this.title = title;
        this.voting_average = voting_average;
        this.release_date = release_date;
    }
}
