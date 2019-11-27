package cs6400.struct;

public class CrewCompanyRelated {
    String name;
    int id;
    int gender;
    String department;
    String jobs;
    int movie_count;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getGender() { return gender; }
    public void setGender(int gender) { this.gender = gender; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getJobs() { return jobs; }
    public void setJobs(String jobs) { this.jobs = jobs; }
    public int getMovie_count() { return movie_count; }
    public void setMovie_count(int movie_count) { this.movie_count = movie_count; }

    public CrewCompanyRelated(String name, int id, int gender, String department, String jobs, int movie_count) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.department = department;
        this.jobs = jobs;
        this.movie_count = movie_count;
    }
}
