package cs6400.database;

import cs6400.struct.company.*;
import cs6400.struct.genre.HistogramElement;
import cs6400.struct.genre.genre;
import cs6400.struct.movie.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class DataManager {

    SqlSessionFactory factory;
    public DataManager(SqlSessionFactory factory){
        this.factory = factory;
    }

    public List<Movie> getAllMovies(){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getAllMovies();
        } finally{
            sqlSession.close();
        }
    }

    //Start the movie API queries
    public Movie getMovieByTitle(String title){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println(title);
            return mapper.getMovieByTitle(title);
        } finally {
            sqlSession.close();
        }
    }
    public Movie getMovieById(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getMovieById(id);

        } finally{
            sqlSession.close();
        }
    }

    public List<CompanyMovieRelated> getCompaniesRelatedToMovie(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getCompaniesRelatedToMovie(id);
        } finally {
            sqlSession.close();
        }
    }

    public List<GenreMovieRelated> getGenresRelatedToMovie(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getGenreRelatedToMovie(id);
        } finally {
            sqlSession.close();
        }
    }

    public List<CastMovieRelated> getCastRelatedToMovie(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getCastRelatedToMovie(id);
        } finally {
            sqlSession.close();
        }
    }

    public List<CrewMovieRelated> getCrewRelatedToMovie(int id, String job){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getCrewsRelatedToMovie(id, job);
        } finally {
            sqlSession.close();
        }
    }
    public List<MovieMovieRelated> getMovieInSameCollection(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getMovieInSameCollection(id);
        } finally {
            sqlSession.close();
        }
    }

    public List<MovieMovieRelated> getSimilarMovie(int id, int limit){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getSimilarMovie(id, limit);
        } finally {
            sqlSession.close();
        }
    }

    //Start the company API queries
    public Company getCompanyByName(String name){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println("test");
            return mapper.getCompanyByName(name);
        } finally{
            sqlSession.close();
        }
    }

    public Company getCompanyById(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println("test");
            return mapper.getCompanyById(id);
        } finally{
            sqlSession.close();
        }
    }

    public List<MovieCompanyRelated> getMovieRelatedToCompany(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println("test");
            return mapper.getMovieRelatedToCompany(id);
        } finally{
            sqlSession.close();
        }
    }

    public List<CastCompanyRelated> getCastRelatedToCompany(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println("test");
            return mapper.getCastRelatedToCompany(id);
        } finally{
            sqlSession.close();
        }
    }
    public List<CrewCompanyRelated> getCrewRelatedToCompany(int id, String job){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println("test");
            return mapper.getCrewRelatedToCompany(id, job);
        } finally{
            sqlSession.close();
        }
    }

    public List<CompanyCompanyRelated> getCompanyRelatedToCompany(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println("test");
            return mapper.getSimilarCompany(id);
        } finally{
            sqlSession.close();
        }
    }

    public List<GenreCompanyRelated> getGenreRelatedToCompany(int id, int limit){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            System.out.println("test");
            return mapper.getGenreRelatedToCompany(id, limit);
        } finally{
            sqlSession.close();
        }
    }

    public List<CompanyCompanyRelated> getSubordinate(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getSubordinate(id);
        } finally{
            sqlSession.close();
        }
    }

    public List<CompanyCompanyRelated> getParentCompany(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getParentCompany(id);
        } finally{
            sqlSession.close();
        }
    }

    public List<HistogramElement> getHistogramByYear(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getHistogramByYear(id);
        } finally{
            sqlSession.close();
        }
    }
    public List<HistogramElement> getHistogramByDirectorOnMovie(int movie_id, int id){

        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getHistogramByDirectorOnMovie(movie_id, id);
        } finally{
            sqlSession.close();
        }
    }
    public List<HistogramElement> getHistogramByDirectorOnCompany(int company_id, int id){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getHistogramByDirectorOnCompany(company_id, id);
        } finally{
            sqlSession.close();
        }
    }

    public genre getGenre(String name){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getGenre(name);
        } finally{
            sqlSession.close();
        }
    }

}
