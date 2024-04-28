/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.databaseConnection;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.customer;
import model.inventory;
import model.itemView;
import model.viewOrderDetails;
import view.dashboard;

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
    public static final Color DarkGrey = new Color(169, 169, 169);
    public static final Color LightGrey = new Color(199, 200, 204);
    
    public static DecimalFormat df = new DecimalFormat("0.00");

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
    
    public JButton[] getOkButton(){
        // ok button
        JButton btnOk = new JButton("OK");
        btnOk.setFont(new Font("", 1, 14));
        btnOk.setBackground(centralController.MainColor);
        btnOk.setForeground(Color.white);
        btnOk.setBorderPainted(false);
        btnOk.setFocusPainted(false);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.getRootFrame().dispose();
            }
        });
        JButton[] btnOkCustom = {btnOk};
        return btnOkCustom;
    }
    
    public ResultSet getCustomer(String customerId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM customer WHERE id='"+customerId+"'";
        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeQuery(sql);
    }
    
    public ResultSet getOrder(String orderId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM orders WHERE id='"+orderId+"'";
        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeQuery(sql);
    }
    
    public ResultSet getOrderDetails(String orderId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM order_detail WHERE orderId='"+orderId+"'";
        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeQuery(sql);
    }
    
    public ResultSet getItem(String code) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM item WHERE code='"+code+"'";
        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeQuery(sql);
    }
    
    public ArrayList<viewOrderDetails> getViewOrderDetails() throws ClassNotFoundException, SQLException {
        ArrayList<viewOrderDetails> orderDetails = new ArrayList<>();
        String sql = "SELECT * FROM orders";

        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rstOrders = stm.executeQuery(sql);

        while (rstOrders.next()) {
            viewOrderDetails ob = new viewOrderDetails(rstOrders.getString("id"), rstOrders.getString("customerId"));
            orderDetails.add(ob);
        }
        
        String sqlDetails = "SELECT * FROM order_detail";
        ResultSet rstDetails = stm.executeQuery(sqlDetails);
        
        for(viewOrderDetails ob : orderDetails){
            if(rstDetails.next()){
                ob.setItemCode(rstDetails.getString("itemCode"));
                ob.setQuantity(rstDetails.getString("qty"));
                String total = df.format(rstDetails.getInt("qty")*rstDetails.getDouble("unitPrice"));
                ob.setTotal(total);
            }
        }

        return orderDetails;
    }
    
    public void disableNavBtn(){
        JButton customerBtn = dashboard.getHomeInstance().getCustomerBtn();
        customerBtn.setEnabled(false);
        
        JButton ordersBtn = dashboard.getHomeInstance().getOrderBtn();
        ordersBtn.setEnabled(false);
        
        JButton itemBtn = dashboard.getHomeInstance().getItemBtn();
        itemBtn.setEnabled(false);
    }
    
    public void enableNavBtn(){
        JButton customerBtn = dashboard.getHomeInstance().getCustomerBtn();
        customerBtn.setEnabled(true);
        
        JButton ordersBtn = dashboard.getHomeInstance().getOrderBtn();
        ordersBtn.setEnabled(true);
        
        JButton itemBtn = dashboard.getHomeInstance().getItemBtn();
        itemBtn.setEnabled(true);
    }
    
    // id generate
    public String getId(String tableName, String PKColName, String idChar, String firstId){
        try {
            ResultSet resultTableRowCount = getTableRowCount(tableName);
            resultTableRowCount.next();

            int size = resultTableRowCount.getInt("row_count");

            if (size > 0) {
                ResultSet resultSet = getTableLastId(tableName, PKColName);
                resultSet.next();

                String lastId = resultSet.getString(PKColName);

                String[] part = lastId.split(idChar);
                int num = Integer.parseInt(part[1]);
                num++;

                return String.format(idChar+"%03d", num);
            } else {
                return firstId;
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showOptionDialog(null, e.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
        }
        return null;
    }
    
    // get table row count
    private ResultSet getTableRowCount(String tableName) throws ClassNotFoundException, SQLException{
        String sql = "SELECT COUNT(*) AS row_count FROM "+tableName;
        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeQuery(sql);
    }
    
    // get table last id
    private ResultSet getTableLastId(String tableName, String PKColName) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM "+tableName+" ORDER BY "+PKColName+" DESC LIMIT 1";
        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeQuery(sql);
    }
    
    public ArrayList<itemView> getViewItems() throws SQLException, ClassNotFoundException{
        ArrayList<itemView> viewItems = new ArrayList<>();
        String sql = "SELECT * FROM item";

        Connection connection = databaseConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {
            itemView ob = new itemView(rst.getString("code"), rst.getString("description"), rst.getString("unitPrice"), rst.getString("qtyOnHand"));
            viewItems.add(ob);
        }
        
        return viewItems;
    }
    
    // observable
    public void observable(inventory ob){
        observerImpl.getObserverImplInstance().update(ob);
    }
}
