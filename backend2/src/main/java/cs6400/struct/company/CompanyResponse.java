package cs6400.struct.company;

import java.util.ArrayList;
import java.util.List;

public class CompanyResponse {
    private String name;
    private int id;
    private long revenue;
    private int movie_count;
    private List<CompanyCompanyRelated> companies;
    private List<GenreCompanyRelated> genres;
    private List<CrewCompanyRelated> directors;
    private List<CrewCompanyRelated> writers;
    private List<CastCompanyRelated> casts;
    private List<MovieCompanyRelated> movies;

    public int getDirectorsSize(){ return directors.size(); }
    public int getWritersSize() {return writers.size(); }
    public int getCastSize(){ return casts.size(); }
    public int getCompanySize() {return companies.size(); }
    public int getMovieSize() { return movies.size(); }
    public int getGenreSize() { return genres.size(); }

    public void addMovie(MovieCompanyRelated movie){ movies.add(movie); }
    public void addCompany(CompanyCompanyRelated company){ companies.add(company); }
    public void addGenere(GenreCompanyRelated genre){ genres.add(genre); }
    public void addCast(CastCompanyRelated cast) { casts.add(cast); }
    public void addWriter(CrewCompanyRelated writer) { writers.add(writer); }
    public void addDirector(CrewCompanyRelated director) { directors.add(director); }

    public void addAllMovie(List<MovieCompanyRelated> movies) { this.movies.addAll(movies);}
    public void addAllCompany(List<CompanyCompanyRelated> companies) { this.companies.addAll(companies); }
    public void addAllGenre(List<GenreCompanyRelated> genres) { this.genres.addAll(genres); }
    public void addAllWriter(List<CrewCompanyRelated> writers) { this.writers.addAll(writers); }
    public void addAllDirector(List<CrewCompanyRelated> directors) { this.directors.addAll(directors);}
    public void addAllCast(List<CastCompanyRelated> casts) { this.casts.addAll(casts); }


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
    public List<CastCompanyRelated> getCasts() { return casts; }
    public void setCasts(List<CastCompanyRelated> casts) { this.casts = casts; }
    public List<MovieCompanyRelated> getMovies() { return movies; }
    public void setMovies(List<MovieCompanyRelated> movies) { this.movies = movies; }
    public List<CrewCompanyRelated> getDirectors() { return directors; }
    public void setDirectors(List<CrewCompanyRelated> directors) { this.directors = directors; }
    public List<CrewCompanyRelated> getWriters() { return writers; }
    public void setWriters(List<CrewCompanyRelated> writers) { this.writers = writers; }

    public CompanyResponse(String name, int id, long revenue, int movie_count) {
        this.name = name;
        this.id = id;
        this.revenue = revenue;
        this.movie_count = movie_count;
        casts = new ArrayList<CastCompanyRelated>();
        genres = new ArrayList<GenreCompanyRelated>();
        companies = new ArrayList<CompanyCompanyRelated>();
        movies = new ArrayList<MovieCompanyRelated>();
        directors = new ArrayList<CrewCompanyRelated>();
        writers = new ArrayList<CrewCompanyRelated>();
    }

    public CompanyResponse(){
        casts = new ArrayList<CastCompanyRelated>();
        genres = new ArrayList<GenreCompanyRelated>();
        companies = new ArrayList<CompanyCompanyRelated>();
        movies = new ArrayList<MovieCompanyRelated>();
        directors = new ArrayList<CrewCompanyRelated>();
        writers = new ArrayList<CrewCompanyRelated>();
    }

    public CompanyResponse(Company company){
        this.name = company.getName();
        this.id = company.getId();
        this.revenue = company.getRevenue();
        this.movie_count = company.getMovie_count();

        casts = new ArrayList<CastCompanyRelated>();
        genres = new ArrayList<GenreCompanyRelated>();
        companies = new ArrayList<CompanyCompanyRelated>();
        movies = new ArrayList<MovieCompanyRelated>();
        directors = new ArrayList<CrewCompanyRelated>();
        writers = new ArrayList<CrewCompanyRelated>();
    }
}
