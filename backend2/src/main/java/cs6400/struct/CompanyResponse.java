package cs6400.struct;

import java.util.ArrayList;
import java.util.List;

public class CompanyResponse {
    private String name;
    private int id;
    private long revenue;
    private int movie_count;
    private List<CompanyCompanyRelated> companies;
    private List<GenreCompanyRelated> genres;
    private List<CrewCompanyRelated> crews;
    private List<CastCompanyRelated> casts;
    private List<MovieCompanyRelated> movies;

    public int getCrewSize(){ return crews.size(); }
    public int getCastSize(){ return casts.size(); }
    public int getCompanySize() {return companies.size(); }
    public int getMovieSize() { return movies.size(); }
    public int getGenreSize() { return genres.size(); }

    public void addMovie(MovieCompanyRelated movie){ movies.add(movie); }
    public void addCompany(CompanyCompanyRelated company){ companies.add(company); }
    public void addGenere(GenreCompanyRelated genre){ genres.add(genre); }
    public void addCast(CastCompanyRelated cast) { casts.add(cast); }
    public void addCrew(CrewCompanyRelated crew) { crews.add(crew); }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public long getRevenue() { return revenue; }
    public void setRevenue(long revenue) { this.revenue = revenue; }
    public int getMovie_count() { return movie_count; }
    public void setMovie_count(int movie_count) { this.movie_count = movie_count; }
    public List<CompanyCompanyRelated> getCompanies() { return companies; }
    public void setCompanies(List<CompanyCompanyRelated> companies) { this.companies = companies; }
    public List<GenreCompanyRelated> getGenres() { return genres; }
    public void setGenres(List<GenreCompanyRelated> genres) { this.genres = genres; }
    public List<CrewCompanyRelated> getCrews() { return crews; }
    public void setCrews(List<CrewCompanyRelated> crews) { this.crews = crews; }
    public List<CastCompanyRelated> getCasts() { return casts; }
    public void setCasts(List<CastCompanyRelated> casts) { this.casts = casts; }
    public List<MovieCompanyRelated> getMovies() { return movies; }
    public void setMovies(List<MovieCompanyRelated> movies) { this.movies = movies; }

    public CompanyResponse(String name, int id, long revenue, int movie_count) {
        this.name = name;
        this.id = id;
        this.revenue = revenue;
        this.movie_count = movie_count;
        casts = new ArrayList<CastCompanyRelated>();
        genres = new ArrayList<GenreCompanyRelated>();
        companies = new ArrayList<CompanyCompanyRelated>();
        movies = new ArrayList<MovieCompanyRelated>();
        crews = new ArrayList<CrewCompanyRelated>();

    }
    public CompanyResponse(){
        casts = new ArrayList<CastCompanyRelated>();
        genres = new ArrayList<GenreCompanyRelated>();
        companies = new ArrayList<CompanyCompanyRelated>();
        movies = new ArrayList<MovieCompanyRelated>();
        crews = new ArrayList<CrewCompanyRelated>();
    }
}
