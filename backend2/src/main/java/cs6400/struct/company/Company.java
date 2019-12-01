package cs6400.struct.company;

public class Company {
    int id;
    String name;
    long revenue;
    int movie_count;
    public Company(int id, String name, long revenue, int movie_count) {
        this.id = id;
        this.name = name;
        this.movie_count = movie_count;
        this.revenue = revenue;
    }

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

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public int getMovie_count() {
        return movie_count;
    }

    public void setMovie_count(int movie_count) {
        this.movie_count = movie_count;
    }
}
