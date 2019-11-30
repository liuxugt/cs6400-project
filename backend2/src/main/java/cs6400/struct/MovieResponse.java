package cs6400.struct;

import java.util.ArrayList;
import java.util.List;

public class MovieResponse {
    private int id;
    private String title;
    private String language;
    private double average_rating;
    private String country;
    private String collection_name;
    private String release_date;
    private String status;


    private List<CrewMovieRelated> directors;
    private List<CrewMovieRelated> writers;
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
    public int getGenreSize(){
        return genres.size();
    }
    public int getCastSize(){
        return casts.size();
    }
    public int getDirectorSize() { return directors.size();}
    public int getWriterSize() { return writers.size(); }

    public void addMovie(MovieMovieRelated movie){
        movies.add(movie);
    }
    public void addCompany(CompanyMovieRelated company){
        companies.add(company);
    }
    public void addGenre(GenreMovieRelated genre){
        genres.add(genre);
    }
    public void addCast(CastMovieRelated cast) { casts.add(cast); }
    public void addDirector(CrewMovieRelated director) {directors.add(director);}
    public void addWriter(CrewMovieRelated writer) { directors.add(writer);}

    public void addAllMovie(List<MovieMovieRelated> movies){
        this.movies.addAll(movies);
    }
    public void addAllCompanies(List<CompanyMovieRelated> companies){
        this.companies.addAll(companies);
    }
    public void addAllGenres(List<GenreMovieRelated> genres){
        this.genres.addAll(genres);
    }
    public void addAllCast(List<CastMovieRelated> casts){
        this.casts.addAll(casts);
    }
    public void addAllDirector( List<CrewMovieRelated> directors) { this.directors.addAll(directors); }
    public void addAllWriter( List<CrewMovieRelated> writers) { this.writers.addAll(writers); }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
    public double getAverage_rating() { return average_rating; }
    public void setAverage_rating(double average_rating) { this.average_rating = average_rating; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getCollection_name() { return collection_name; }
    public void setCollection_name(String collection_name) { this.collection_name = collection_name; }
    public String getRelease_date() { return release_date; }
    public void setRelease_date(String release_date) { this.release_date = release_date; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public List<CompanyMovieRelated> getCompanies() { return companies; }
    public List<MovieMovieRelated> getMovies() { return movies; }
    public List<GenreMovieRelated> getGenres() { return genres; }
    public List<CastMovieRelated> getCasts() { return casts; }

    public List<CrewMovieRelated> getDirectors() { return directors; }
    public void setDirectors(List<CrewMovieRelated> directors) { this.directors = directors; }
    public List<CrewMovieRelated> getWriters() { return writers; }
    public void setWriters(List<CrewMovieRelated> writers) { this.writers = writers; }
    public void setCompanies(List<CompanyMovieRelated> companies) { this.companies = companies; }
    public void setMovies(List<MovieMovieRelated> movies) { this.movies = movies; }
    public void setGenres(List<GenreMovieRelated> genres) { this.genres = genres; }
    public void setCasts(List<CastMovieRelated> casts) { this.casts = casts; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public MovieResponse(int id, String title, String language, double average_rating, String country, String collection_name, String release_date, String status) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.average_rating = average_rating;
        this.country = country;
        this.collection_name = collection_name;
        this.release_date = release_date;
        this.status = status;
        directors = new ArrayList<>();
        writers = new ArrayList<>();
        companies = new ArrayList<>();
        genres = new ArrayList<>();
        movies = new ArrayList<>();
        casts = new ArrayList<>();
    }


    public MovieResponse(Movie movie){
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.language = movie.getLanguage();
        this.average_rating = movie.getAverage_rating();
        this.country = movie.getCountry();
        this.collection_name = movie.getCollection_name();
        this.release_date = movie.getRelease_date();
        this.status = movie.getStatus();

        directors = new ArrayList<>();
        writers = new ArrayList<>();
        companies = new ArrayList<>();
        genres = new ArrayList<>();
        movies = new ArrayList<>();
        casts = new ArrayList<>();
    }

    public MovieResponse() {
        directors = new ArrayList<>();
        writers = new ArrayList<>();
        companies = new ArrayList<>();
        genres = new ArrayList<>();
        movies = new ArrayList<>();
        casts = new ArrayList<>();
    }
}
