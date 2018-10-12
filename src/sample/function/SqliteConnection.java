package sample.function;
import java.sql.*;

public class SqliteConnection {

    public static Connection Connector(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn  = DriverManager.getConnection("jdbc:sqlite:scheduler_db.sqlite");
            return conn;
        }
        catch (Exception e ){
            return null;
        }
    }
}
