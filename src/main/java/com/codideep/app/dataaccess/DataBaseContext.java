/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KAAF0
 */
public class DataBaseContext {

    private static final String CONNECTIONSTRING = "jdbc:mariadb://localhost:3306/dbactivity20242";
    private static final String USER = "root";
    private static final String PASSWORD = "030191";

    private static Connection CONNECTION = null;

    public static void generateConnection() {
        try {
            CONNECTION = DriverManager.getConnection(CONNECTIONSTRING, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Connection getConnection() {
        return CONNECTION;
    }

    public static void closeConnection() throws SQLException {
        CONNECTION.close();
    }
}
