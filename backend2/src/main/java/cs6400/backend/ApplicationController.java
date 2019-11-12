package cs6400.backend;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {

    BackendRepo repository;

    public ApplicationController(BackendRepo repository){
        this.repository = repository;
    }
    @RequestMapping(method = RequestMethod.GET, value = '/movies/{movie_id}')
    public ResponseEntity<?> getMovie(@PathVariable String movie_id){
        int id;
        try{
            id = Integer.parseInt(movie_id);
        }
        catch (NumberFormatException e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        String movie_title = this.repository.getMovieTitle(id);
        if(movie_title != null){
            return new ResponseEntity<>(movie_title, HttpStatus.ACCEPTED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
