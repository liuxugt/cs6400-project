package cs6400.backend;

import java.util.List;
import java.util.ArrayList;
import cs6400.struct.*;
import org.apache.ibatis.mapping.Environment;

public class BackendRepo {

    BackendServices services;

    public BackendRepo(){
        this.services = new BackendServices();
    }


    public Movie getMovieById(int id){
        return services.getMovieById(id);
    }

    public List<Movie> getAllMovies(){
        return services.getAllMovies();
    }

    public MovieResponse getMovieByTitle(String title){
        System.out.println(title + " in repo");
        return services.getMovieByTitle(title);
    }
}
