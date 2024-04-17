/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.centralController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.customer;

/**
 *
 * @author ygpra
 */
public class viewCustomers extends javax.swing.JPanel {

    private static final viewCustomers instance = new viewCustomers();

    /**
     * Creates new form viewCustomers
     */
    private viewCustomers() {
        initComponents();
        customerTable.getTableHeader().setBackground(new Color(204, 211, 202));
        customerTable.getTableHeader().setForeground(new Color(12, 0, 0));
        customerTable.getTableHeader().setFont(new Font("", 1, 14));
        customerTable.getTableHeader().setPreferredSize(new Dimension(30, 30));
    }

    public static viewCustomers getViewCustomersInstance() {
        return instance;
    }

    public void setTableInfo() {
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
            ArrayList<customer> customersDetail = centralController.getInstance().getCustomerDetails();
            DefaultTableModel dtm = (DefaultTableModel) customerTable.getModel();
            dtm.setRowCount(0);

            for (customer obj : customersDetail) {
                Object[] rowData = {
                    obj.getId(),
                    obj.getName(),
                    obj.getAddress(),
                    obj.getSalary()
                };
                dtm.addRow(rowData);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showOptionDialog(null, ex.getMessage(), "Error", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, centralController.errorIcon, btnOkCustom, btnOkCustom[0]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(239, 241, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(12, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("View Customers");

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

        customerTable.setBackground(new java.awt.Color(221, 221, 221));
        customerTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        customerTable.setForeground(new java.awt.Color(12, 0, 0));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Address", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.setCellSelectionEnabled(true);
        customerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerTable.setRowHeight(20);
        customerTable.setSelectionBackground(new java.awt.Color(161, 161, 230));
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        instance.setVisible(false);
        customerHome.getCustomerHomeInstance().setVisible(true);
        centralController.getInstance().enableNavBtn();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JTable customerTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
