package cs6400.backend;

import cs6400.struct.movie.Movie;
import cs6400.struct.movie.MovieResponse;
import cs6400.struct.company.CompanyResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@CrossOrigin(origins = "*",  allowCredentials = "true", allowedHeaders = "*")
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
    public ResponseEntity<?> getMovieResponseByTitle(@PathVariable String movie_title){
        System.out.println(movie_title);
        MovieResponse res = this.repository.getMovieResponseByTitle(movie_title);
        System.out.println(res);
        if (res == null) {
            return new ResponseEntity<>("404 error: Movie " + movie_title + " Not Found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/test")
    public ResponseEntity<?> testAPI(){
        Movie movies = this.repository.getTestMovie();
        System.out.println(movies);
        return new ResponseEntity<>(movies, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/company/name/{company_name}")
    public ResponseEntity<?> getCompanyResponseByName(@PathVariable String company_name){
        System.out.println(company_name);
        CompanyResponse res = this.repository.getCompanyResponseByName(company_name);
        if(res == null){
            return new ResponseEntity<>("404 error: Company " + company_name + " Not Found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/visualization/{genre}/{content_id}")
    public ResponseEntity<?> getPredictedGenreContent(@PathVariable("genre") String genre, @PathVariable("content_id") int id){
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
