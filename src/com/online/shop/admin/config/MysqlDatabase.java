package com.online.shop.admin.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Amol.Sarwade
 */
public class MysqlDatabase implements Database {

    @Override
    public Connection initDatabase() {
        final String dbDriver = "com.mysql.jdbc.Driver";
        final String dbURL = "jdbc:mysql://localhost:3306/";
        final String dbName = "online-shop";
        final String dbUsername = "root";
        final String dbPassword = "root";

        try {
            Class.forName(dbDriver);
        } catch (Exception e) {
            System.err.println("Unable to load JDBC driver " + dbDriver + " : " + e
                    .getMessage());
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
        } catch (Exception e) {
            System.err.println("Unable to connect to URL " + dbURL + " : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Connected to database: " + dbName);
        return connection;
    }

}
