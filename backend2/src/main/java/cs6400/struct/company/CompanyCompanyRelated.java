package cs6400.struct.company;

public class CompanyCompanyRelated {
    int id;
    String name;
    long revenue;
    int movie_count;
    int order_rating;

    public int getOrder_rating() {
        return order_rating;
    }

    public void setOrder_rating(int order_rating) {
        this.order_rating = order_rating;
    }

    String reason = null;

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public long getRevenue() { return revenue; }
    public void setRevenue(long revenue) { this.revenue = revenue; }
    public int getMovie_count() { return movie_count; }
    public void setMovie_count(int movie_count) { this.movie_count = movie_count; }

    public CompanyCompanyRelated(int id, String name, int order_rating, long revenue, int movie_count) {
        this.id = id;
        this.name = name;
        this.order_rating = order_rating;
        this.revenue = revenue;
        this.movie_count = movie_count;
    }

    public CompanyCompanyRelated(int id, String name) {
        this.id = id;
        this.name = name;
        this.revenue = 0;
        this.movie_count = 0;
    }
}

