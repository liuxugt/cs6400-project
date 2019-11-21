package cs6400.backend;

import cs6400.struct.Movie;
import cs6400.struct.MovieResponse;
import org.apache.ibatis.mapping.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ApplicationController {

    private BackendRepo repository;

    public ApplicationController(){
        this.repository = new BackendRepo();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/movies/{movie_id}")
    public ResponseEntity<?> getMovie(@PathVariable String movie_id){
        int id;
        try{
            id = Integer.parseInt(movie_id);
        }
        catch (NumberFormatException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Movie movie = this.repository.getMovieById(id);
        if(movie != null){
            return new ResponseEntity<>(movie, HttpStatus.ACCEPTED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET, value = "api/movies")
    public ResponseEntity<?> getAllMovies(){
        List<Movie> movies = this.repository.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/movies/title/{movie_title}")
    public ResponseEntity<?> getMovieByTitle(@PathVariable String movie_title){
        System.out.println(movie_title);
        MovieResponse res = this.repository.getMovieResponseByTitle(movie_title);
        System.out.println(res);
        if (res == null) {
            return new ResponseEntity<>("404 error: Movie Not Found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/test")
    public ResponseEntity<?> testAPI(){
        Movie movies = this.repository.getTestMovie();
        System.out.println(movies);
        return new ResponseEntity<>(movies, HttpStatus.ACCEPTED);
    }
}
