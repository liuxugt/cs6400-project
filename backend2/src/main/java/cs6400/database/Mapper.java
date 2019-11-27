package cs6400.database;

import cs6400.struct.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Mapper {

    public List<Movie> getAllMovies();
    public Movie getMovieById(@Param("id") int id);
    public Movie getMovieByTitle(@Param("title") String title);
    public Company getCompanyByName(@Param("name") String name);

    public List<CompanyMovieRelated> getCompaniesRelatedToMovie(@Param("id") int id);
    public List<CrewMovieRelated> getCrewsRelatedToMovie(@Param("id") int movie_id, @Param("department") String department);
    public List<CastMovieRelated> getCastRelatedToMovie(@Param("id") int id);
    public List<GenreMovieRelated> getGenreRelatedToMovie(@Param("id") int id);
    public List<MovieMovieRelated> getMovieReleaseCloseToMovie(@Param("id") int id);
    public List<MovieMovieRelated> getMovieMatchGenreToMovie(@Param("id") int id);
    public List<MovieMovieRelated> getSimilarMovie(@Param("id") int id);

    public List<CompanyCompanyRelated> getSimilarCompanyOn(@Param("id") int id);
    public List<CompanyCompanyRelated> getParentCompany(@Param("id") int id);
    public List<CompanyCompanyRelated> getSubordinate(@Param("id") int id);
    public List<CrewMovieRelated> getCrewRelatedToCompany(@Param("id") int id, @Param("limit") int limit);
    public List<CastMovieRelated> getCastRelatedToCompany(@Param("id") int id, @Param("limit") int limit);
    public List<MovieCompanyRelated> getMovieRelatedToCompany(@Param("id") int id);
    public List<GenreCompanyRelated> getGenreRelatedToCompany(@Param("id") int id, @Param("limit") int limit);
}