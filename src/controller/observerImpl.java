/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.databaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.inventory;

/**
 *
 * @author ygpra
 */
public class observerImpl implements observer {

    private static final observerImpl instance = new observerImpl();

    private observerImpl() {
    }

    public static observerImpl getObserverImplInstance() {
        return instance;
    }

    @Override
    public void update(inventory ob) {
        try {
            int qtyOnHand = 0;
            ResultSet rst = centralController.getInstance().getItem(ob.getItemCode());
            rst.next();

            if (ob.getPrevQty() == 0) {
                qtyOnHand = rst.getInt("qtyOnHand") - ob.getQty();
            } else if (ob.getQty() > ob.getPrevQty()) {
                qtyOnHand = rst.getInt("qtyOnHand") - (ob.getQty() - ob.getPrevQty());
            } else {
                qtyOnHand = rst.getInt("qtyOnHand") + (ob.getPrevQty() - ob.getQty());
            }

            String sql = "UPDATE item SET qtyOnHand=" + qtyOnHand + " WHERE code='" + ob.getItemCode() + "'";

            Connection connection = databaseConnection.getInstance().getConnection();
            Statement stm = connection.createStatement();
            stm.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
        }

    }
}
