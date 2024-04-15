/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.databaseConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import model.customer;

/**
 *
 * @author ygpra
 */
public class centralController {

    private static final centralController instance = new centralController();

    private centralController() {
    }

    public static centralController getInstance() {
        return instance;
    }

    // icons
    public static final ImageIcon successIcon = new ImageIcon("C:\\Users\\ygpra\\Desktop\\iCET Assignments and Coursework\\JDBC\\Project Thoga-Kade\\ThogaKade\\src\\resources\\success-icon.png");
    public static final ImageIcon questionIcon = new ImageIcon("C:\\Users\\ygpra\\Desktop\\iCET Assignments and Coursework\\JDBC\\Project Thoga-Kade\\ThogaKade\\src\\resources\\question-icon.png");
    public static final ImageIcon errorIcon = new ImageIcon("C:\\Users\\ygpra\\Desktop\\iCET Assignments and Coursework\\JDBC\\Project Thoga-Kade\\ThogaKade\\src\\resources\\error-icon.png");

    // colors
    public static final Color MainColor = new Color(98, 99, 213);
    public static final Color SecondColor = new Color(237, 150, 11);

    public ArrayList<customer> getCustomerDetails() throws ClassNotFoundException, SQLException {
        ArrayList<customer> customersDetail = new ArrayList<>();
        String sql = "SELECT * FROM customer";

        databaseConnection dBConnection = databaseConnection.getInstance();
        Connection connection = dBConnection.getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {
            customer c1 = new customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getString("salary"));
            customersDetail.add(c1);
        }

        return customersDetail;
    }

}
