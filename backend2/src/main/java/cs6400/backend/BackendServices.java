package cs6400.backend;

import cs6400.database.DataManager;
import cs6400.database.DatabaseSqlSessionFactory;
import cs6400.struct.*;
import org.apache.ibatis.mapping.Environment;

import java.util.List;


public class BackendServices {
    DataManager dataManager;
    public BackendServices(){
        try{
            DatabaseSqlSessionFactory databaseSqlSessionFactory = new DatabaseSqlSessionFactory();
            dataManager = new DataManager(databaseSqlSessionFactory.getFactory());
        } catch(Exception e){
            System.out.println(e);
            throw new IllegalStateException("Building the SqlSessionFactory failed");
        }
    }
    public Movie getMovieById(int id){
        return dataManager.getMovieById(id);
    }

    public List<Movie> getAllMovies(){
        return dataManager.getAllMovies();
    }

}
