package cs6400.struct;

public class Movie {
    int id;
    private String title;
    private String language;
    private double voting_average;
    private String country;
    private String collection_name;
    private String release_date;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getVoting_average() {
        return voting_average;
    }

    public void setVoting_average(double voting_average) {
        this.voting_average = voting_average;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCollection_name() {
        return collection_name;
    }

    public void setCollection_name(String collection_name) {
        this.collection_name = collection_name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Movie() {
    }

    public Movie(int id,String title, String language, double voting_average, String country, String collection_name, String release_date, String status) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.voting_average = voting_average;
        this.country = country;
        this.collection_name = collection_name;
        this.release_date = release_date;
        this.status = status;
    }
}
