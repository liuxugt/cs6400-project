package cs6400.struct.movie;

public class CastMovieRelated {
    private int id;

    private String name;
    private int gender;
    private String characters;

    public CastMovieRelated(int id, String name, int gender, String characters) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.characters = characters;
    }

    public CastMovieRelated() {
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }
}
