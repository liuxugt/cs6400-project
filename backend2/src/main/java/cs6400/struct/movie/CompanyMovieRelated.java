package cs6400.struct.movie;

public class CompanyMovieRelated {
    private String name;
    private long revenue;

    public CompanyMovieRelated(String name, long revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public CompanyMovieRelated() {
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

}
