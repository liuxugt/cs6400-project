package cs6400.struct;

public class CastCompanyRelated {
    private String name;
    private int id;
    private String character;
    private String movie_character_in;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCharacter() { return character; }
    public void setCharacter(String character) { this.character = character; }
    public String getMovie_character_in() { return movie_character_in; }
    public void setMovie_character_in(String movie_character_in) { this.movie_character_in = movie_character_in; }

    public CastCompanyRelated(String name, int id, String character, String movie_character_in) {
        this.name = name;
        this.id = id;
        this.character = character;
        this.movie_character_in = movie_character_in;
    }
}
