/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.databaseConnection;
import controller.centralController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ygpra
 */
public class searchCustomer extends javax.swing.JPanel {

    private static final searchCustomer instance = new searchCustomer();

    /**
     * Creates new form searchCustomer
     */
    private searchCustomer() {
        initComponents();
    }

    public static searchCustomer getSearchCustomerInstance() {
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        enterCustIdLabel = new javax.swing.JLabel();
        inputCustId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        customerIdLabel = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        custNameValue = new javax.swing.JLabel();
        addressValue = new javax.swing.JLabel();
        salaryValue = new javax.swing.JLabel();
        customerIdValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 241, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(12, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Search Customer");

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
                btnCancelActionPerformed(evt);
            }
        });

        enterCustIdLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        enterCustIdLabel.setForeground(new java.awt.Color(12, 0, 0));
        enterCustIdLabel.setText("Enter Customer ID :");

        inputCustId.setBackground(new java.awt.Color(199, 200, 204));
        inputCustId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputCustId.setForeground(new java.awt.Color(12, 0, 0));
        inputCustId.setBorder(null);
        inputCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCustIdActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(237, 150, 11));
        btnSearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(239, 241, 255));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        customerIdLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        customerIdLabel.setForeground(new java.awt.Color(12, 0, 0));
        customerIdLabel.setText("Customer ID : ");

        custNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        custNameLabel.setForeground(new java.awt.Color(12, 0, 0));
        custNameLabel.setText("Customer Name : ");

        addressLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(12, 0, 0));
        addressLabel.setText("Address : ");

        salaryLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(12, 0, 0));
        salaryLabel.setText("Salary : ");

        custNameValue.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        custNameValue.setForeground(new java.awt.Color(12, 0, 0));
        custNameValue.setMaximumSize(new java.awt.Dimension(0, 24));

        addressValue.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addressValue.setForeground(new java.awt.Color(12, 0, 0));
        addressValue.setMaximumSize(new java.awt.Dimension(0, 24));

        salaryValue.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        salaryValue.setForeground(new java.awt.Color(12, 0, 0));
        salaryValue.setMaximumSize(new java.awt.Dimension(0, 24));

        customerIdValue.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        customerIdValue.setForeground(new java.awt.Color(12, 0, 0));
        customerIdValue.setMaximumSize(new java.awt.Dimension(0, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custNameLabel)
                            .addComponent(customerIdLabel)
                            .addComponent(addressLabel)
                            .addComponent(salaryLabel))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaryValue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerIdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressValue, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterCustIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterCustIdLabel)
                    .addComponent(inputCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerIdLabel)
                    .addComponent(customerIdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custNameLabel)
                    .addComponent(custNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(addressValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryLabel)
                    .addComponent(salaryValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        inputCustId.setText("");
        customerIdValue.setText("");
        custNameValue.setText("");
        addressValue.setText("");
        salaryValue.setText("");

        instance.setVisible(false);
        customerHome.getCustomerHomeInstance().setVisible(true);
        centralController.getInstance().enableNavBtn();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
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

        try {
            // search customer
            String id = inputCustId.getText();
            String sql = "SELECT * FROM customer WHERE id='" + id + "'";

            databaseConnection dBConnection = databaseConnection.getInstance();
            Connection connection = dBConnection.getConnection();
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            rst.next();

            customerIdValue.setText(rst.getString("id"));
            custNameValue.setText(rst.getString("name"));
            addressValue.setText(rst.getString("address"));
            salaryValue.setText(rst.getString("salary"));

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, btnOkCustom, btnOkCustom[0]);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void inputCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCustIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCustIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressValue;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JLabel custNameValue;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JLabel customerIdValue;
    private javax.swing.JLabel enterCustIdLabel;
    private javax.swing.JTextField inputCustId;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JLabel salaryValue;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
