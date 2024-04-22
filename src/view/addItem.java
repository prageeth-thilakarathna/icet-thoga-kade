/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.centralController;
import database.databaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ygpra
 */
public class addItem extends javax.swing.JPanel {
    
    private static final addItem instance = new addItem();

    /**
     * Creates new form addItem
     */
    private addItem() {
        initComponents();
        itemCodeDisplay.setEditable(false);
        itemCodeDisplay.setText(centralController.getInstance().getId("item", "code", "P", "P001"));
    }
    
    public static addItem getAddItemInstance(){
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
        forDescription = new javax.swing.JLabel();
        descriptionInput = new javax.swing.JTextField();
        forUnitPrice = new javax.swing.JLabel();
        unitPriceInput = new javax.swing.JTextField();
        forQtyOnHand = new javax.swing.JLabel();
        qtyOnHandInput = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        itemCodeDisplay = new javax.swing.JTextField();
        unitPriceErrorDisplay = new javax.swing.JLabel();
        qtyOnHandErrorDisplay = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 241, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(12, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Add Item");

        forItemCode.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forItemCode.setForeground(new java.awt.Color(12, 0, 0));
        forItemCode.setText("Item Code : ");

        forDescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forDescription.setForeground(new java.awt.Color(12, 0, 0));
        forDescription.setText("Description : ");

        descriptionInput.setBackground(new java.awt.Color(199, 200, 204));
        descriptionInput.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        descriptionInput.setForeground(new java.awt.Color(12, 0, 0));
        descriptionInput.setBorder(null);
        descriptionInput.setName(""); // NOI18N

        forUnitPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forUnitPrice.setForeground(new java.awt.Color(12, 0, 0));
        forUnitPrice.setText("Unit Price : ");

        unitPriceInput.setBackground(new java.awt.Color(199, 200, 204));
        unitPriceInput.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        unitPriceInput.setForeground(new java.awt.Color(12, 0, 0));
        unitPriceInput.setBorder(null);
        unitPriceInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unitPriceKeyTyped(evt);
            }
        });

        forQtyOnHand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forQtyOnHand.setForeground(new java.awt.Color(12, 0, 0));
        forQtyOnHand.setText("Qty On Hand : ");

        qtyOnHandInput.setBackground(new java.awt.Color(199, 200, 204));
        qtyOnHandInput.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        qtyOnHandInput.setForeground(new java.awt.Color(12, 0, 0));
        qtyOnHandInput.setBorder(null);
        qtyOnHandInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyOnHandKeyTyped(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(237, 150, 11));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(239, 241, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAction(evt);
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

        itemCodeDisplay.setBackground(new java.awt.Color(199, 200, 204));
        itemCodeDisplay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemCodeDisplay.setForeground(new java.awt.Color(12, 0, 0));
        itemCodeDisplay.setBorder(null);

        unitPriceErrorDisplay.setForeground(new java.awt.Color(255, 0, 0));

        qtyOnHandErrorDisplay.setForeground(new java.awt.Color(255, 0, 0));
        qtyOnHandErrorDisplay.setPreferredSize(new java.awt.Dimension(41, 16));

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
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forDescription)
                    .addComponent(forItemCode)
                    .addComponent(forQtyOnHand)
                    .addComponent(forUnitPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unitPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitPriceErrorDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(descriptionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qtyOnHandInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtyOnHandErrorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemCodeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forItemCode)
                    .addComponent(itemCodeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forDescription)
                    .addComponent(descriptionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forUnitPrice)
                    .addComponent(unitPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitPriceErrorDisplay))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(forQtyOnHand)
                        .addComponent(qtyOnHandInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(qtyOnHandErrorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAction
        // add item
        try {
            String code = itemCodeDisplay.getText();
            String description = descriptionInput.getText();
            String unitPrice = unitPriceInput.getText();
            String qtyOnHand = qtyOnHandInput.getText();

            String sql = "INSERT INTO item VALUES(?,?,?,?)";

            Connection connection = databaseConnection.getInstance().getConnection();
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, code);
            stm.setString(2, description);
            stm.setDouble(3, Double.parseDouble(unitPrice));
            stm.setInt(4, Integer.parseInt(qtyOnHand));

            int res = stm.executeUpdate();
            if (res > 0) {
                String tempCode = itemCodeDisplay.getText();
                itemCodeDisplay.setText(centralController.getInstance().getId("item", "code", "P", "P001"));
                descriptionInput.setText("");
                unitPriceInput.setText("");
                qtyOnHandInput.setText("");
                JOptionPane.showOptionDialog(null, tempCode + " Item Added is Successful.", "Success", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.successIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
            } else {
                JOptionPane.showOptionDialog(null, "Failed! Has some issues with Adding " + itemCodeDisplay.getText() + " Item.", "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, centralController.getInstance().getOkButton(), centralController.getInstance().getOkButton()[0]);
        }
    }//GEN-LAST:event_btnAddAction

    private void btnCancelAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAction
        descriptionInput.setText("");
        unitPriceInput.setText("");
        qtyOnHandInput.setText("");
        qtyOnHandErrorDisplay.setText("");
        unitPriceErrorDisplay.setText("");

        instance.setVisible(false);
        itemHome.getItemHomeInstance().setVisible(true);
        centralController.getInstance().enableNavBtn();
    }//GEN-LAST:event_btnCancelAction

    private void unitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitPriceKeyTyped
        String value = unitPriceInput.getText();
        char ch = evt.getKeyChar();
        validateUnitPrice(value, ch);
    }//GEN-LAST:event_unitPriceKeyTyped

    private void qtyOnHandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyOnHandKeyTyped
        String value = qtyOnHandInput.getText();
        char ch = evt.getKeyChar();
        validateQtyOnHand(value, ch);
    }//GEN-LAST:event_qtyOnHandKeyTyped

    private void validateUnitPrice(String value, char ch) {
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

        if ((length >= 0 && length < 10) & condition & (ch >= '0' && ch <= '9') || (int) ch == 8 || (int) ch == 46) {
            unitPriceInput.setEditable(true);
            unitPriceErrorDisplay.setText("");
        } else {
            unitPriceInput.setEditable(false);

            if (condition == false) {
                unitPriceErrorDisplay.setText("* Not a Q==0");
            } else if (length == 10) {
                unitPriceErrorDisplay.setText("* only 10 digits");
            } else {
                unitPriceErrorDisplay.setText("* only digits(0-9)");
            }
        }
    }
    
    private void validateQtyOnHand(String value, char ch){
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

        if ((length >= 0 && length < 10) & condition & (ch >= '0' && ch <= '9') || (int) ch == 8) {
            qtyOnHandInput.setEditable(true);
            qtyOnHandErrorDisplay.setText("");
        } else {
            qtyOnHandInput.setEditable(false);

            if (condition == false) {
                qtyOnHandErrorDisplay.setText("* Not a Q==0");
            } else if (length == 10) {
                qtyOnHandErrorDisplay.setText("* only 10 digits");
            } else {
                qtyOnHandErrorDisplay.setText("* only digits(0-9)");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JTextField descriptionInput;
    private javax.swing.JLabel forDescription;
    private javax.swing.JLabel forItemCode;
    private javax.swing.JLabel forQtyOnHand;
    private javax.swing.JLabel forUnitPrice;
    private javax.swing.JTextField itemCodeDisplay;
    private javax.swing.JLabel qtyOnHandErrorDisplay;
    private javax.swing.JTextField qtyOnHandInput;
    private javax.swing.JLabel title;
    private javax.swing.JLabel unitPriceErrorDisplay;
    private javax.swing.JTextField unitPriceInput;
    // End of variables declaration//GEN-END:variables
}
