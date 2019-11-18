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

    public MovieResponse getMovieByTitle(String title) {

        System.out.println(title + " in service");
        Movie basic_info = dataManager.getMovieByTitle(title);
        if(basic_info == null){
            return null;
        }

        System.out.println(title + " pass null checking");
        MovieResponse response = new MovieResponse(basic_info);
        List<CompanyMovieRelated> companies = dataManager.getCompaniesByMovieTitle(title);
        response.setCompanies(companies);
        System.out.println(title + " get companies");
        System.out.println(companies);
        System.out.println(response);
//        if(!basic_info.getStatus().equals("Released")){
//            return response;
//        }
        return response;
    }

}
