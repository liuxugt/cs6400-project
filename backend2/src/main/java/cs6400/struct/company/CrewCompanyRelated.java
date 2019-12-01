package cs6400.struct.company;

public class CrewCompanyRelated {
    String name;
    int id;
    int gender;
    String job;
    double order_rating;
    int movie_count;
    double average_rating;

    public CrewCompanyRelated(String name, int id, int gender, String job, double order_rating, int movie_count, double average_rating) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.job = job;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
