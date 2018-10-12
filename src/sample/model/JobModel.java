package sample.model;

import sample.function.SqliteConnection;
import java.sql.Connection;

public class JobModel {

    private Connection connection;

    public JobModel(){
        connection = SqliteConnection.Connector();
        if(connection  == null){
            System.exit(1);
        }
    }

    /**
     * Check the DB connection
     * @return true if the connection is working fine.
     */
    public boolean isDbConnected(){
        try {
            return !connection.isClosed();
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
