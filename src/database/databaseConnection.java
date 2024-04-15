/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ygpra
 */
public class databaseConnection {

    private static databaseConnection dBConnection;
    private final Connection connection;

    private databaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thoga_kade?autoReconnect=true&useSSL=false", "root", "200284");
    }

    public static databaseConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new databaseConnection();
        }
        return dBConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
