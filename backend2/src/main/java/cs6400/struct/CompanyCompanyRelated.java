package cs6400.struct;

public class CompanyCompanyRelated {
    String reason = null;
    int id;
    String name;
    long revenue;

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public long getRevenue() { return revenue; }
    public void setRevenue(long revenue) { this.revenue = revenue; }

    public CompanyCompanyRelated(int id, String name, long revenue) {
        this.id = id;
        this.name = name;
        this.revenue = revenue;
    }
}
