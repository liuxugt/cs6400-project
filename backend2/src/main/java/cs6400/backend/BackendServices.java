package cs6400.backend;

import cs6400.database.DataManager;
import cs6400.database.DatabaseSqlSessionFactory;
import cs6400.struct.*;
import org.apache.ibatis.mapping.Environment;

import java.util.List;


public class BackendServices {
    DataManager dataManager;
    final int capacity = 10;
    final String job_dire = "Director";
    final String job_write = "Screenplay";
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

    public MovieResponse getMovieResponseByTitle(String title) {
        System.out.println(title + " in service");
        Movie basic_info = dataManager.getMovieByTitle(title);
        if(basic_info == null){
            return null;
        }
        int id = basic_info.getId();
        System.out.println(title + " pass null checking");
        MovieResponse response = new MovieResponse(basic_info);
        List<CompanyMovieRelated> companies = dataManager.getCompaniesRelatedToMovie(id);
        response.setCompanies(companies);
        System.out.println(title + " get companies");
        System.out.println(companies);
        System.out.println(response);
//        if(!basic_info.getStatus().equals("Released")){
//            return response;
//        }
        return response;
    }

    public Movie getTestMovie(){
        return dataManager.getMovieByTitle("Moana");
    }
    public CompanyResponse getCompanyResponseByName(String name){
        System.out.println(name + " in service");
        Company basic_info = dataManager.getCompanyByName(name);
        if(basic_info == null){
            return null;
        }
        System.out.println(name + " pass null checking");
        CompanyResponse response = new CompanyResponse(basic_info);
        int id = basic_info.getId();
        response.setCasts(dataManager.getCastRelatedToCompany(id));
        response.setDirectors(dataManager.getCrewRelatedToCompany(id, job_dire ));
        response.setWriters(dataManager.getCrewRelatedToCompany(id,job_write));
        response.setGenres(dataManager.getGenreRelatedToCompany(id, capacity));
        response.setMovies(dataManager.getMovieRelatedToCompany(id));
        return response;
    }

}
