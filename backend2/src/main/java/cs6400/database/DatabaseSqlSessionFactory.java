package cs6400.database;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class DatabaseSqlSessionFactory {
    SqlSessionFactory factory;
    public DatabaseSqlSessionFactory() {
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(reader, "development");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SqlSessionFactory getFactory(){
        return factory;
    }
}
