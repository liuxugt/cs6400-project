package cs6400.struct;

public class GenreCompanyRelated {
    private int movie_count;
    private int id;
    private String name;

    public GenreCompanyRelated(int movie_count, int id, String name) {
        this.movie_count = movie_count;
        this.id = id;
        this.name = name;
    }

    public int getMovie_count() { return movie_count; }
    public void setMovie_count(int movie_count) { this.movie_count = movie_count; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
