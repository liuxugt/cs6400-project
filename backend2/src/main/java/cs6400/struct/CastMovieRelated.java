package cs6400.struct;

public class CastMovieRelated {
    private String name;
    private int gender;
    private String characters;

    public CastMovieRelated(String name, int gender, String characters) {
        this.name = name;
        this.gender = gender;
        this.characters = characters;
    }

    public CastMovieRelated() {
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
