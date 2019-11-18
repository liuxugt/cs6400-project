package cs6400.struct;

import java.util.ArrayList;
import java.util.List;

public class MovieResponse {
    private String title;
    private String language;
    private double voting_average;
    private String country;
    private String collection_name;
    private String release_date;
    private String status;

    private List<CrewMovieRelated> crews;
    private List<CompanyMovieRelated> companies;
    private List<MovieMovieRelated> movies;
    private List<GenreMovieRelated> genres;
    private List<CastMovieRelated> casts;

    public int getMovieSize(){
        return movies.size();
    }

    public int getCompanySize(){
        return companies.size();
    }
    public int getDirectorSize(){
        return crews.size();
    }
    public int getGenreSize(){
        return genres.size();
    }
    public int getCastSize(){
        return casts.size();
    }

    public void addMovie(MovieMovieRelated movie){
        movies.add(movie);
    }
    public void addCompany(CompanyMovieRelated company){
        companies.add(company);
    }
    public void addGenre(GenreMovieRelated genre){
        genres.add(genre);
    }
    public void addCrew(CrewMovieRelated crew){
        crews.add(crew);
    }

    public void addAllMovie(List<MovieMovieRelated> movies){
        this.movies.addAll(movies);
    }
    public void addAllCompanies(List<CompanyMovieRelated> companies){
        this.companies.addAll(companies);
    }
    public void addAllGenres(List<GenreMovieRelated> genres){
        this.genres.addAll(genres);
    }
    public void addAllCrew(List<CrewMovieRelated> crews){
        this.crews.addAll(crews);
    }
    public void addAllCast(List<CastMovieRelated> casts){
        this.casts.addAll(casts);
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public double getVoting_average() { return voting_average; }

    public void setVoting_average(double voting_average) { this.voting_average = voting_average; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getCollection_name() { return collection_name; }

    public void setCollection_name(String collection_name) { this.collection_name = collection_name; }

    public String getRelease_date() { return release_date; }

    public void setRelease_date(String release_date) { this.release_date = release_date; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public List<CrewMovieRelated> getCrews() { return crews; }

    public List<CompanyMovieRelated> getCompanies() { return companies; }

    public List<MovieMovieRelated> getMovies() { return movies; }

    public List<GenreMovieRelated> getGenres() { return genres; }

    public List<CastMovieRelated> getCasts() { return casts; }

    public void setCrews(List<CrewMovieRelated> crews) { this.crews = crews; }

    public void setCompanies(List<CompanyMovieRelated> companies) { this.companies = companies; }

    public void setMovies(List<MovieMovieRelated> movies) { this.movies = movies; }

    public void setGenres(List<GenreMovieRelated> genres) { this.genres = genres; }

    public void setCasts(List<CastMovieRelated> casts) { this.casts = casts; }

    public MovieResponse(String title, String language, double voting_average, String country, String collection_name, String release_date, String status) {
        this.title = title;
        this.language = language;
        this.voting_average = voting_average;
        this.country = country;
        this.collection_name = collection_name;
        this.release_date = release_date;
        this.status = status;
        crews = new ArrayList<>();
        companies = new ArrayList<>();
        genres = new ArrayList<>();
        movies = new ArrayList<>();
    }


    public MovieResponse(Movie movie){
        this.title = movie.getTitle();
        this.language = movie.getLanguage();
        this.voting_average = movie.getVoting_average();
        this.country = movie.getCountry();
        this.collection_name = movie.getCollection_name();
        this.release_date = movie.getRelease_date();
        this.status = movie.getStatus();

        crews = new ArrayList<>();
        companies = new ArrayList<>();
        genres = new ArrayList<>();
        movies = new ArrayList<>();
        casts = new ArrayList<>();
    }

    public MovieResponse() {
    }
}
