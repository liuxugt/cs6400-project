package cs6400.backend;

import java.util.List;

import cs6400.struct.company.CompanyResponse;
import cs6400.struct.genre.HistogramElement;
import cs6400.struct.movie.Movie;
import cs6400.struct.movie.MovieResponse;

public class BackendRepo {

    BackendServices services;
    private final String[] contents = new String[] {"movie_count", "director"};

    public BackendRepo(){
        this.services = new BackendServices();
    }


    public Movie getMovieById(int id){
        return services.getMovieById(id);
    }

    public List<Movie> getAllMovies(){
        return services.getAllMovies();
    }

    public MovieResponse getMovieResponseByTitle(String title){
        System.out.println(title + " in repo");
        return services.getMovieResponseByTitle(title);
    }

    public Movie getTestMovie(){
        return services.getTestMovie();
    }

    public CompanyResponse getCompanyResponseByName(String name){
        System.out.println(name + " in repo");
        return services.getCompanyResponseByName(name);
    }

    public List<HistogramElement> getHistogram(String genre_name, int id, int content_id){
        switch(content_id){
            case 0:
                return services.getHistogramByYear(genre_name);
            case 1:
                return services.getHistogramByDirectorOnMovie(genre_name, id);
            case 2:
                return services.getHistogramByDirectorOnCompany(genre_name, id);
            default:
                return null;
        }
    }
}
