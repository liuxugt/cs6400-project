package cs6400.database;

import cs6400.struct.company.*;
import cs6400.struct.genre.HistogramElement;
import cs6400.struct.genre.genre;
import cs6400.struct.movie.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Mapper {

    public List<Movie> getAllMovies();
    public Movie getMovieById(@Param("id") int id);
    public Movie getMovieByTitle(@Param("title") String title);
    public Company getCompanyById(@Param("id") int id);
    public Company getCompanyByName(@Param("name") String name);

    public List<CompanyMovieRelated> getCompaniesRelatedToMovie(@Param("id") int id);
    public List<CrewMovieRelated> getCrewsRelatedToMovie(@Param("id") int movie_id, @Param("job") String job);
    public List<CastMovieRelated> getCastRelatedToMovie(@Param("id") int id);
    public List<GenreMovieRelated> getGenreRelatedToMovie(@Param("id") int id);
    public List<MovieMovieRelated> getMovieReleaseCloseToMovie(@Param("id") int id);
    public List<MovieMovieRelated> getMovieMatchGenreToMovie(@Param("id") int id);
    public List<MovieMovieRelated> getSimilarMovie(@Param("id") int id, @Param("limit") int limit);
    public List<MovieMovieRelated> getMovieInSameCollection(@Param("id") int id);


    public List<CompanyCompanyRelated> getSimilarCompany(@Param("id") int id);
    public List<CompanyCompanyRelated> getParentCompany(@Param("id") int id);
    public List<CompanyCompanyRelated> getSubordinate(@Param("id") int id);
    public List<CrewCompanyRelated> getCrewRelatedToCompany(@Param("id") int id, @Param("job") String job);
    public List<CastCompanyRelated> getCastRelatedToCompany(@Param("id") int id);
    public List<MovieCompanyRelated> getMovieRelatedToCompany(@Param("id") int id);
    public List<GenreCompanyRelated> getGenreRelatedToCompany(@Param("id") int id, @Param("limit") int limit);

    public List<HistogramElement> getHistogramByYear(@Param("id") int id);
    public List<HistogramElement> getHistogramByDirectorOnMovie(@Param("movie_id") int movie_id, @Param("id") int id);
    public List<HistogramElement> getHistogramByDirectorOnCompany(@Param("company_id") int company_id, @Param("id") int id);
    public genre getGenre(@Param("name") String name);
}