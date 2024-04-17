/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.centralController;
import database.databaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author ygpra
 */
public class updateOrder extends javax.swing.JPanel {

    private static final updateOrder instance = new updateOrder();
    private int qtySearchedValue;

    /**
     * Creates new form updateOrder
     */
    private updateOrder() {
        initComponents();
        btnUpdate.setEnabled(false);
        qtyInput.setEditable(false);
    }

    public static updateOrder getUpdateOrderInstance() {
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        forOrderId = new javax.swing.JLabel();
        orderIdInput = new javax.swing.JTextField();
        forCustomerId = new javax.swing.JLabel();
        customerIdDisplay = new javax.swing.JLabel();
        forCustomerName = new javax.swing.JLabel();
        customerNameDisplay = new javax.swing.JLabel();
        forItem = new javax.swing.JLabel();
        itemDisplay = new javax.swing.JLabel();
        forQty = new javax.swing.JLabel();
        forTotal = new javax.swing.JLabel();
        totalDisplay = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        qtyInput = new javax.swing.JTextField();
        qtyError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 241, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(12, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Update Order");

        forOrderId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forOrderId.setForeground(new java.awt.Color(12, 0, 0));
        forOrderId.setText("Enter Order ID :");

        orderIdInput.setBackground(new java.awt.Color(199, 200, 204));
        orderIdInput.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        orderIdInput.setForeground(new java.awt.Color(12, 0, 0));
        orderIdInput.setBorder(null);
        orderIdInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orderIdKeyTyped(evt);
            }
        });

        forCustomerId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forCustomerId.setForeground(new java.awt.Color(12, 0, 0));
        forCustomerId.setText("Customer ID : ");

        customerIdDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerIdDisplay.setForeground(new java.awt.Color(12, 0, 0));
        customerIdDisplay.setMaximumSize(new java.awt.Dimension(0, 24));

        forCustomerName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forCustomerName.setForeground(new java.awt.Color(12, 0, 0));
        forCustomerName.setText("Customer Name : ");

        customerNameDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerNameDisplay.setForeground(new java.awt.Color(12, 0, 0));
        customerNameDisplay.setMaximumSize(new java.awt.Dimension(0, 24));

        forItem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forItem.setForeground(new java.awt.Color(12, 0, 0));
        forItem.setText("Item : ");

        itemDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemDisplay.setForeground(new java.awt.Color(12, 0, 0));
        itemDisplay.setMaximumSize(new java.awt.Dimension(0, 24));

        forQty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forQty.setForeground(new java.awt.Color(12, 0, 0));
        forQty.setText("Quantity : ");

        forTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forTotal.setForeground(new java.awt.Color(12, 0, 0));
        forTotal.setText("Total : ");

        totalDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        totalDisplay.setForeground(new java.awt.Color(12, 0, 0));
        totalDisplay.setMaximumSize(new java.awt.Dimension(0, 24));

        btnUpdate.setBackground(new java.awt.Color(0, 127, 115));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(239, 241, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setFocusPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAction(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(98, 99, 213));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(239, 241, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAction(evt);
            }
        });

        qtyInput.setBackground(new java.awt.Color(199, 200, 204));
        qtyInput.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        qtyInput.setForeground(new java.awt.Color(12, 0, 0));
        qtyInput.setBorder(null);
        qtyInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });

        qtyError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forCustomerName)
                    .addComponent(forCustomerId)
                    .addComponent(forItem)
                    .addComponent(forQty)
                    .addComponent(forTotal)
                    .addComponent(forOrderId))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qtyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtyError, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(customerNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forOrderId)
                    .addComponent(orderIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forCustomerId)
                    .addComponent(customerIdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forCustomerName)
                    .addComponent(customerNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forItem)
                    .addComponent(itemDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(forQty)
                                .addComponent(qtyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(qtyError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forTotal)
                            .addComponent(totalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAction
        if (Integer.parseInt(qtyInput.getText()) != qtySearchedValue) {
            String sql = "UPDATE order_detail SET qty=" + Integer.parseInt(qtyInput.getText()) + " WHERE orderId='" + orderIdInput.getText() + "'";

            try {
                Connection connection = databaseConnection.getInstance().getConnection();
                Statement stm = connection.createStatement();
                int res = stm.executeUpdate(sql);

                if (res > 0) {
                    String id = orderIdInput.getText();
                    orderIdInput.setText("");
                    customerIdDisplay.setText("");
                    customerNameDisplay.setText("");
                    itemDisplay.setText("");
                    qtyInput.setText("");
                    totalDisplay.setText("");
                    JOptionPane.showOptionDialog(null, id + " Order Update is Successful.", "Success", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.successIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
            }
        } else {
            JOptionPane.showOptionDialog(null, "Failed! Please do not enter the previous quantity.", "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
        }
    }//GEN-LAST:event_btnUpdateAction

    private void btnCancelAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAction
        orderIdInput.setText("");
        customerIdDisplay.setText("");
        customerNameDisplay.setText("");
        itemDisplay.setText("");
        qtyInput.setText("");
        totalDisplay.setText("");

        instance.setVisible(false);
        ordersHome.getOrdersHomeInstance().setVisible(true);
    }//GEN-LAST:event_btnCancelAction

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        String value = qtyInput.getText();
        char ch = evt.getKeyChar();
        validateQty(value, ch);

        if (value.length() > 0 || (ch >= '1' && ch <= '9')) {
            btnUpdate.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_qtyKeyTyped

    private void validateQty(String value, char ch) {
        int length = value.length();

        boolean condition = true;
        int count = 0;
        if (length > 0) {
            count++;
        } else {
            count = 0;
        }

        if (count == 0 & ch == '0') {
            condition = false;
        }

        if ((length >= 0 && length < 2) & condition & (ch >= '0' && ch <= '9') || (int) ch == 8) {
            qtyInput.setEditable(true);
            qtyError.setText("");
        } else {
            qtyInput.setEditable(false);

            if (condition == false) {
                qtyError.setText("* Not a Q==0");
            } else if (length == 2) {
                qtyError.setText("* only 2 digits");
            } else {
                qtyError.setText("* only digits(0-9)");
            }
        }
    }

    private void orderIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderIdKeyTyped
        orderIdInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String value = orderIdInput.getText();
                displaySearchResult(value);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String value = orderIdInput.getText();
                displaySearchResult(value);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }//GEN-LAST:event_orderIdKeyTyped

    // display search result
    private void displaySearchResult(String value) {
        try {
            // search order
            String id = orderIdInput.getText();
            ResultSet rst = centralController.getInstance().getOrder(id);

            if (rst.next()) {
                customerIdDisplay.setText(rst.getString("customerId"));

                // search customer
                ResultSet rstCustomer = centralController.getInstance().getCustomer(rst.getString("customerId"));

                if (rstCustomer.next()) {
                    customerNameDisplay.setText(rstCustomer.getString("name"));

                    // search order details
                    ResultSet rstOrderDetails = centralController.getInstance().getOrderDetails(rst.getString("id"));

                    if (rstOrderDetails.next()) {
                        // search item
                        ResultSet rstItem = centralController.getInstance().getItem(rstOrderDetails.getString("itemCode"));

                        if (rstItem.next()) {
                            itemDisplay.setText(rstItem.getString("description"));
                            qtyInput.setText(rstOrderDetails.getString("qty"));

                            int qty = Integer.parseInt(rstOrderDetails.getString("qty"));
                            qtySearchedValue = qty;
                            double unitPrice = Double.parseDouble(rstOrderDetails.getString("unitPrice"));

                            String total = centralController.df.format(qty * unitPrice);
                            totalDisplay.setText("Rs. " + total);
                            qtyInput.setEditable(true);
                        }
                    }
                }
            } else {
                customerIdDisplay.setText("");
                customerNameDisplay.setText("");
                itemDisplay.setText("");
                qtyInput.setText("");
                totalDisplay.setText("");
                btnUpdate.setEnabled(false);
                qtySearchedValue = 0;
                qtyInput.setEditable(false);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel customerIdDisplay;
    private javax.swing.JLabel customerNameDisplay;
    private javax.swing.JLabel forCustomerId;
    private javax.swing.JLabel forCustomerName;
    private javax.swing.JLabel forItem;
    private javax.swing.JLabel forOrderId;
    private javax.swing.JLabel forQty;
    private javax.swing.JLabel forTotal;
    private javax.swing.JLabel itemDisplay;
    private javax.swing.JTextField orderIdInput;
    private javax.swing.JLabel qtyError;
    private javax.swing.JTextField qtyInput;
    private javax.swing.JLabel title;
    private javax.swing.JLabel totalDisplay;
    // End of variables declaration//GEN-END:variables
}