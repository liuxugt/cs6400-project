package cs6400.database;

import cs6400.struct.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Mapper {

    public List<Movie> getAllMovies();
    public Movie getMovieById(@Param("id") int id);
    public Movie getMovieByTitle(@Param("title") String title);
}
