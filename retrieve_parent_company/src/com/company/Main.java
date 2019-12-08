package com.company;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.util.*;

public class Main {

    private static String api_key = "391c2e0f97f44ad4b7af65ec7f4bb4b4";
    private static String[] headers = new String[]{"description", "headquarters", "homepage", "id", "logo_path", "name", "origin_country", "parent_company"};

    static class Pair{
        int id;
        String name;
        public Pair(int id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Connection mysql_connection = null;
        try{
            mysql_connection = connection();
            if(mysql_connection == null){
                System.out.println("connection failed");
                throw new SQLException();
            }
            List<Pair> ids = retrieveFromMySQL(mysql_connection);
            List<String> data = retrieveFromTMDB(ids);
            writeToCSV(data);
            mysql_connection.close();

        } catch (SQLException e){
            if(mysql_connection != null){
                try{
                    System.err.print("Transaction is being rolled back");

                    mysql_connection.rollback();
                } catch (SQLException e1){
                    System.err.print("error in rolling back process");
                }
            }
        } catch(IOException io){
            System.out.println(io);
        }
    }



    public static Connection connection () throws SQLException {
        //DriverManager.registerDriver(new oracle.jdbc.driver.jdbcDriver());
        try{
            System.out.println("loading Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties connectionProps = new Properties();
            connectionProps.put("user", "root");
            connectionProps.put("password", "Xiaoxu433lx!");
            connectionProps.put("serverTimezone", "UTC");
            System.out.println(connectionProps);
            System.out.println("loading Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/cs6400", connectionProps);
            System.out.println("Connected to Database");
            return conn;

        } catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static List<Pair> retrieveFromMySQL(Connection connection) throws SQLException {
        try{
//            String select_statement = "select * from cs6400.movies where id = ?";
//            PreparedStatement ps = mysql_connection.prepareStatement(select_statement);
//            int test_id = 862;
//            ps.setInt(1, test_id);
//            ResultSet rs = ps.executeQuery();
//            System.out.println(rs.getFetchSize());
//            while(rs.next()){
//                System.out.println(rs.getString("title") + " " + rs.getString("id") + " " + rs.getString("imdb_id"));
//            }
//            if(ps != null){
//                ps.close();
//            }
            List<Pair> res = new ArrayList<>();
            String select_statement = "select id, name from cs6400.companies";
            PreparedStatement ps = connection.prepareStatement(select_statement);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
                res.add(new Pair(rs.getInt("id"), rs.getString("name")));
            }
            return res;
        }
        catch(SQLException e){
            System.out.println(e);
            throw e;
        }
    }

    public static List<String> retrieveFromTMDB(List<Pair> ids) {
        String base_URL = "https://api.themoviedb.org/3/company/";
        List<String> res = new ArrayList<>();

        for (int i = 11; i < ids.size(); i++){
            try {
                URL url = new URL(base_URL + ids.get(i).id + "?api_key=" + api_key);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                    conn.setRequestProperty("api_key", api_key);
                    conn.setDoOutput(true);
                    conn.setUseCaches(false);

                    InputStream is = conn.getInputStream();
                    BufferedReader rd = new BufferedReader((new InputStreamReader(is)));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = rd.readLine()) != null) {
                        response.append(line);
                    }
                    rd.close();
                    String[] split = response.toString().split(":");
                    StringBuilder row = new StringBuilder();
                    for(int j = 1; j < split.length; j++){
                        String[] temp = split[j].split(",\"");
                        row.append(temp[0]);
                        if(j != split.length - 1){
                            row.append(",");
                        }
                        else{
                            row.setLength(row.length() - 1);
                        }
                    }
                    System.out.println(row);
                    res.add(row.toString());
                } catch (Exception e) {
                    System.out.println(e);
                    String temp = "\"\",\"\",\"\","+ ids.get(i).id + ",null," + ids.get(i).name + ",null,null";
                    System.out.println(temp);
                    res.add(temp);
                } finally{
                    try{
                        Thread.sleep(250);
                    } catch (Exception e2){
                        System.out.println(e2);
                    }
                }
            }
        return res;
    }

    public static void writeToCSV(List<String> element) throws IOException{
        try{
            FileWriter writer = new FileWriter("companies.csv");
            writer.write(String.join(",", headers));
            writer.write(System.getProperty("line.separator"));
            for(int i = 0; i < element.size(); i++){
                writer.write(element.get(i));
                writer.write(System.getProperty("line.separator"));
            }
        }

        catch(IOException e){
            System.out.println(e);
            throw e;
        }
    }
}
