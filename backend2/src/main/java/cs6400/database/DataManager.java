package cs6400.database;

import cs6400.struct.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class DataManager {

    SqlSessionFactory factory;


    public DataManager(SqlSessionFactory factory){
        this.factory = factory;
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

    public List<Movie> getAllMovies(){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getAllMovies();
        } finally{
            sqlSession.close();
        }
    }

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

    public List<CompanyMovieRelated> getCompaniesByMovieTitle(String title){
        SqlSession sqlSession = factory.openSession();
        try{
            Mapper mapper = sqlSession.getMapper(Mapper.class);
            return mapper.getCompaniesRelatedToMovie(title);
        } finally {
            sqlSession.close();
        }
    }

}
