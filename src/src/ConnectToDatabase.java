package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDatabase {

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private String sql = null;

    private void setConnection() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/",
                    "root",
                    "ar840"
            );
            this.statement = this.connection.createStatement();
            this.statement.execute("use omms");

        } catch (ClassNotFoundException | SQLException e) {
            
            System.err.println(e);
        }
    }

    private void executeQuery() {

        try {
            
            this.setConnection();
            this.statement.execute(sql);
            this.resultSet = this.statement.getResultSet();
        } catch (SQLException ex) {
            
            System.err.println(ex);
        }
    }
    
    
    public ResultSet getResult(String sql) {

        this.sql = sql;
        this.executeQuery();
        return this.resultSet;
    }
    
    public void closeConnection() {
        
        try {
            
            this.connection.close();
            this.statement.close();
            this.resultSet.close();
            this.sql = null;
        } catch (Exception e) {
            
            System.err.println(e);
        }
    }
}
