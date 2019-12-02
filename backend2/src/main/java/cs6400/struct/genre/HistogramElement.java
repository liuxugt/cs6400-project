package cs6400.struct.genre;

public class HistogramElement {
    double rating;
    String split_element;
    double average_rating;

    public HistogramElement(double rating, String split_element, double average_rating) {
        this.split_element = split_element;
        this.average_rating = average_rating;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public String getSplit_element() {
        return split_element;
    }

    public void setSplit_element(String split_element) {
        this.split_element = split_element;
    }
}
