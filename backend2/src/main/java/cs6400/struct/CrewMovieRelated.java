package cs6400.struct;

public class CrewMovieRelated {
    private String name;
    private int gender;
    private String department;
    private String job;

    public CrewMovieRelated() {
    }

    public CrewMovieRelated(String name, int gender, String department, String job) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
