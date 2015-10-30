package src;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDatabase {

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static String sql = null;

    private static void setConnection() {

        try {
            
            File file = new File("");

            Class.forName("org.sqlite.JDBC");
            ConnectToDatabase.connection = DriverManager.getConnection(
                    "jdbc:sqlite:"+file.getAbsolutePath()+"/.EMMS-RES/datas.sqlite");
            ConnectToDatabase.statement = ConnectToDatabase.connection.createStatement();
            ConnectToDatabase.statement.execute("CREATE  TABLE  IF NOT EXISTS user_info ("
                    + "user_name VARCHAR PRIMARY KEY  NOT NULL , password VARCHAR NOT NULL )");
        } catch (ClassNotFoundException | SQLException e) {
            
            System.err.println(e);
        }
    }

    private static void executeQuery() {

        try {
            
            ConnectToDatabase.setConnection();
            ConnectToDatabase.statement.execute(sql);
            ConnectToDatabase.resultSet = ConnectToDatabase.statement.getResultSet();
        } catch (SQLException ex) {
            
            System.err.println(ex);
        }
    }
    
    
    public static ResultSet getResult(String sql) {

        ConnectToDatabase.sql = sql;
        ConnectToDatabase.executeQuery();
        return ConnectToDatabase.resultSet;
    }
}