package databaseH2;

import org.h2.jdbcx.JdbcConnectionPool;

import java.sql.*;

public class DataSource {

    private static final String dbUrl = "jdbc:h2:./usersDatabase";
    private static final String user = "snake";
    private static final String password = "snake";
    private static final JdbcConnectionPool cp;

    static {
        cp = JdbcConnectionPool.create(dbUrl, user, password);
        cp.setMaxConnections(100);
    }

    public static void close(){
        cp.dispose();
    }

    public static Connection getConnection() throws SQLException {
        return cp.getConnection();
    }
}
