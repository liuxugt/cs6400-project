package cs6400.backend;

import cs6400.database.DataManager;
import cs6400.database.DatabaseSqlSessionFactory;
import cs6400.struct.company.Company;
import cs6400.struct.company.CompanyCompanyRelated;
import cs6400.struct.company.CompanyResponse;
import cs6400.struct.genre.HistogramElement;
import cs6400.struct.genre.genre;
import cs6400.struct.movie.Movie;
import cs6400.struct.movie.MovieMovieRelated;
import cs6400.struct.movie.MovieResponse;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BackendServices {
    DataManager dataManager;
    final int capacity = 20;
    final int genre_capacity = 10;
    final String job_dire = "Director";
    final String job_write = "Screenplay";
    final String[] sample_reason_company = new String[] {"subordinate or parent", "similar recent genres"};
    final String[] sample_reason_movie = new String[] {"same collection", "similar genre and companies", "similar genres with close release"};
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
        response.setCompanies(dataManager.getCompaniesRelatedToMovie(id));
        response.setGenres(dataManager.getGenresRelatedToMovie(id));
        response.setDirectors(dataManager.getCrewRelatedToMovie(id, job_dire));
        response.setWriters(dataManager.getCrewRelatedToMovie(id, job_write));
        response.setCasts(dataManager.getCastRelatedToMovie(id));
        if(basic_info.getCollection_name() != null){
            response.addAllMovie(dataManager.getMovieInSameCollection(id));
            for(int i = 0; i < response.getMovieSize(); i++){
                response.getMovies().get(i).setReason(sample_reason_movie[0]);
            }
        }
        List<MovieMovieRelated> similarMovie = dataManager.getSimilarMovie(id, capacity - response.getMovieSize());
        for(int i  =0; i < similarMovie.size(); i++){
            similarMovie.get(i).setReason(sample_reason_movie[1]);
        }

        Collections.sort(similarMovie, new Comparator<MovieMovieRelated>(){
            public int compare(MovieMovieRelated a1, MovieMovieRelated a2){
                int year = Integer.parseInt(basic_info.getRelease_date().split("-")[0]);
                int year1 = Integer.parseInt(a1.getRelease_date().split("-")[0]);
                int year2 = Integer.parseInt(a2.getRelease_date().split("-")[0]);
                a1.setOrder_rating(a1.getOrder_rating() - Math.abs(year1 - year) * 0.05);
                a2.setOrder_rating(a2.getOrder_rating() - Math.abs(year2 - year) * 0.05);
                double order = a2.getOrder_rating() - a1.getOrder_rating();
                if( order > 0){
                    return 1;
                }
                else if(order < 0){
                    return -1;
                }
                else{
                    return 0;
                }

            }
        });
        response.addAllMovie(similarMovie);
        if(!basic_info.getStatus().equals("Released")){
            return response;
        }
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
        response.setGenres(dataManager.getGenreRelatedToCompany(id, genre_capacity));
        response.setMovies(dataManager.getMovieRelatedToCompany(id));
        List<CompanyCompanyRelated> parent = dataManager.getParentCompany(id);
        List<CompanyCompanyRelated> subordinate = dataManager.getSubordinate(parent.get(parent.size() - 1).getId());
        for(int i = 0; i < subordinate.size(); i++){
            if(subordinate.get(i).getId() != id){
                subordinate.get(i).setReason(sample_reason_company[0]);
                response.addCompany(subordinate.get(i));
            }
        }

        return response;
    }

    public List<HistogramElement> getHistogramByYear(String name){
        genre temp = dataManager.getGenre(name);
        return dataManager.getHistogramByYear(temp.getId());
    }
    public List<HistogramElement> getHistogramByDirectorOnCompany(String name, int company_id){
        genre temp = dataManager.getGenre(name);
        return dataManager.getHistogramByDirectorOnCompany(company_id, temp.getId());
    }

    public List<HistogramElement> getHistogramByDirectorOnMovie(String name, int movie_id){
        genre temp = dataManager.getGenre(name);
        return dataManager.getHistogramByDirectorOnMovie(movie_id, temp.getId());
    }
}
