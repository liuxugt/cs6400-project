package cs6400.struct;

public class MovieMovieRelated {
    String reason;
    String title;
    double voting_average;
    double voring_count;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVoting_average() {
        return voting_average;
    }

    public void setVoting_average(double voting_average) {
        this.voting_average = voting_average;
    }

    public double getVoring_count() {
        return voring_count;
    }

    public void setVoring_count(double voring_count) {
        this.voring_count = voring_count;
    }

    public MovieMovieRelated(String reason, String title, double voting_average, double voring_count) {
        this.reason = reason;
        this.title = title;
        this.voting_average = voting_average;
        this.voring_count = voring_count;
    }

    public MovieMovieRelated() {
    }
}
