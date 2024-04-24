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

/**
 *
 * @author ygpra
 */
public class deleteItem extends javax.swing.JPanel {

    private static final deleteItem instance = new deleteItem();

    /**
     * Creates new form deleteItem
     */
    private deleteItem() {
        initComponents();
        btnDelete.setEnabled(false);
        itemCodeInput.setEditable(true);
        btnSearch.setEnabled(true);
    }

    public static deleteItem getDeleteItemInstance() {
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        forItemCode = new javax.swing.JLabel();
        itemCodeInput = new javax.swing.JTextField();
        forDescription = new javax.swing.JLabel();
        descriptionDisplay = new javax.swing.JLabel();
        forUnitPrice = new javax.swing.JLabel();
        unitPriceDisplay = new javax.swing.JLabel();
        forQtyOnHand = new javax.swing.JLabel();
        qtyOnHandDisplay = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 241, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(12, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Delete Item");

        forItemCode.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forItemCode.setForeground(new java.awt.Color(12, 0, 0));
        forItemCode.setText("Enter Item Code :");

        itemCodeInput.setBackground(new java.awt.Color(199, 200, 204));
        itemCodeInput.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemCodeInput.setForeground(new java.awt.Color(12, 0, 0));
        itemCodeInput.setBorder(null);

        forDescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forDescription.setForeground(new java.awt.Color(12, 0, 0));
        forDescription.setText("Description : ");

        descriptionDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        descriptionDisplay.setForeground(new java.awt.Color(12, 0, 0));
        descriptionDisplay.setMaximumSize(new java.awt.Dimension(0, 24));

        forUnitPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forUnitPrice.setForeground(new java.awt.Color(12, 0, 0));
        forUnitPrice.setText("Unit Price : ");

        unitPriceDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        unitPriceDisplay.setForeground(new java.awt.Color(12, 0, 0));
        unitPriceDisplay.setMaximumSize(new java.awt.Dimension(0, 24));

        forQtyOnHand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forQtyOnHand.setForeground(new java.awt.Color(12, 0, 0));
        forQtyOnHand.setText("Qty On Hand : ");

        qtyOnHandDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        qtyOnHandDisplay.setForeground(new java.awt.Color(12, 0, 0));
        qtyOnHandDisplay.setMaximumSize(new java.awt.Dimension(0, 24));

        btnDelete.setBackground(new java.awt.Color(231, 41, 41));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(239, 241, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAction(evt);
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
                btnSearchAction(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forUnitPrice)
                    .addComponent(forDescription)
                    .addComponent(forQtyOnHand)
                    .addComponent(forItemCode))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(qtyOnHandDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(unitPriceDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forItemCode)
                    .addComponent(itemCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forDescription)
                    .addComponent(descriptionDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forUnitPrice)
                    .addComponent(unitPriceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forQtyOnHand)
                    .addComponent(qtyOnHandDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAction
        try {
            // delete order
            String code = itemCodeInput.getText();
            String sql = "DELETE FROM item WHERE code='" + code + "'";

            Connection connection = databaseConnection.getInstance().getConnection();
            Statement stm = connection.createStatement();
            stm.executeUpdate(sql);

            String tempCode = itemCodeInput.getText();

            itemCodeInput.setText("");
            descriptionDisplay.setText("");
            unitPriceDisplay.setText("");
            qtyOnHandDisplay.setText("");
            btnDelete.setEnabled(false);
            itemCodeInput.setEditable(true);
            btnSearch.setEnabled(true);

            JOptionPane.showOptionDialog(null, tempCode + " Item Delete is Successful.", "Success", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.successIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
        }
    }//GEN-LAST:event_btnDeleteAction

    private void btnSearchAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAction
        String itemCode = itemCodeInput.getText();
        displaySearchResult(itemCode);
    }//GEN-LAST:event_btnSearchAction

    private void btnCancelAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAction
        itemCodeInput.setText("");
        descriptionDisplay.setText("");
        unitPriceDisplay.setText("");
        qtyOnHandDisplay.setText("");
        btnDelete.setEnabled(false);
        itemCodeInput.setEditable(true);
        btnSearch.setEnabled(true);

        instance.setVisible(false);
        itemHome.getItemHomeInstance().setVisible(true);
        centralController.getInstance().enableNavBtn();
    }//GEN-LAST:event_btnCancelAction

    // display search result
    private void displaySearchResult(String code) {
        try {
            // search item
            ResultSet rst = centralController.getInstance().getItem(code);
            rst.next();

            descriptionDisplay.setText(rst.getString("description"));
            unitPriceDisplay.setText(rst.getString("unitPrice"));
            qtyOnHandDisplay.setText(rst.getString("qtyOnHand"));
            btnDelete.setEnabled(true);
            itemCodeInput.setEditable(false);
            btnSearch.setEnabled(false);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel descriptionDisplay;
    private javax.swing.JLabel forDescription;
    private javax.swing.JLabel forItemCode;
    private javax.swing.JLabel forQtyOnHand;
    private javax.swing.JLabel forUnitPrice;
    private javax.swing.JTextField itemCodeInput;
    private javax.swing.JLabel qtyOnHandDisplay;
    private javax.swing.JLabel title;
    private javax.swing.JLabel unitPriceDisplay;
    // End of variables declaration//GEN-END:variables
}
