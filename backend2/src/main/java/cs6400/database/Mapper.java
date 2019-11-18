package cs6400.database;

import cs6400.struct.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Mapper {

    public List<Movie> getAllMovies();
    public Movie getMovieById(@Param("id") int id);
    public Movie getMovieByTitle(@Param("title") String title);
    public Company getCompanyByName(@Param("name") String name);

    public List<CompanyMovieRelated> getCompaniesRelatedToMovie(@Param("title") String title);
    public List<CrewMovieRelated> getDirectorsRelatedToMovie(@Param("title") String title);
    public List<CrewMovieRelated> getWritersRelatedToMovie(@Param("title") String title);
    public List<CastMovieRelated> getCastRelatedToMovie(@Param("title") String title);
    public List<GenreMovieRelated> getCastRelatedToMovieSortByMovieCount(@Param("title") String title);
    public List<GenreMovieRelated> getCastRelatedToMovieSortByVotingAvg(@Param("title") String title);
}