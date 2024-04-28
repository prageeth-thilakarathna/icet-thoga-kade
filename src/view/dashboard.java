/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JButton;

/**
 *
 * @author ygpra
 */
public class dashboard extends javax.swing.JFrame {
    
    private static final dashboard instance = new dashboard();

    /**
     * Creates new form dashboard
     */
    private dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        jPanelPages.setLayout(new BorderLayout());
        jPanelPages.add(customerHome.getCustomerHomeInstance(), BorderLayout.CENTER);
    }
    
    public static dashboard getHomeInstance(){
        return instance;
    }
    
    public javax.swing.JPanel getPagePanel(){
        return jPanelPages;
    }
    
    public JButton getCustomerBtn(){
        return btnCustomer;
    }
    
    public JButton getOrderBtn(){
        return btnOrders;
    }
    
    public JButton getItemBtn(){
        return btnItem;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNavigation = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnItem = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanelPages = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DashBoard - Thoga Kade");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanelNavigation.setBackground(new java.awt.Color(98, 99, 213));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(254, 254, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Thoga Kade");

        btnCustomer.setBackground(new java.awt.Color(254, 254, 255));
        btnCustomer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(98, 99, 213));
        btnCustomer.setText("Customer");
        btnCustomer.setBorder(null);
        btnCustomer.setBorderPainted(false);
        btnCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomer.setFocusPainted(false);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerAction(evt);
            }
        });

        btnOrders.setBackground(new java.awt.Color(254, 254, 255));
        btnOrders.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(98, 99, 213));
        btnOrders.setText("Orders");
        btnOrders.setBorder(null);
        btnOrders.setBorderPainted(false);
        btnOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrders.setFocusPainted(false);
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersAction(evt);
            }
        });

        btnItem.setBackground(new java.awt.Color(254, 254, 255));
        btnItem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnItem.setForeground(new java.awt.Color(98, 99, 213));
        btnItem.setText("Item");
        btnItem.setBorder(null);
        btnItem.setBorderPainted(false);
        btnItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnItem.setFocusPainted(false);
        btnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemAction(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(254, 254, 255));
        btnExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(98, 99, 213));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitAction(evt);
            }
        });

        javax.swing.GroupLayout jPanelNavigationLayout = new javax.swing.GroupLayout(jPanelNavigation);
        jPanelNavigation.setLayout(jPanelNavigationLayout);
        jPanelNavigationLayout.setHorizontalGroup(
            jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btnItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelNavigationLayout.setVerticalGroup(
            jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(78, 78, 78)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanelPages.setBackground(new java.awt.Color(239, 241, 255));

        javax.swing.GroupLayout jPanelPagesLayout = new javax.swing.GroupLayout(jPanelPages);
        jPanelPages.setLayout(jPanelPagesLayout);
        jPanelPagesLayout.setHorizontalGroup(
            jPanelPagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        jPanelPagesLayout.setVerticalGroup(
            jPanelPagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnItemAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemAction
        ordersHome.getOrdersHomeInstance().setVisible(false);
        customerHome.getCustomerHomeInstance().setVisible(false);
        jPanelPages.setLayout(new BorderLayout());
        itemHome.getItemHomeInstance().setVisible(true);
        jPanelPages.add(itemHome.getItemHomeInstance(), BorderLayout.CENTER);
    }//GEN-LAST:event_btnItemAction

    private void btnExitAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAction
        System.exit(0);
    }//GEN-LAST:event_btnExitAction

    private void btnCustomerAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerAction
        ordersHome.getOrdersHomeInstance().setVisible(false);
        itemHome.getItemHomeInstance().setVisible(false);
        jPanelPages.setLayout(new BorderLayout());
        customerHome.getCustomerHomeInstance().setVisible(true);
        jPanelPages.add(customerHome.getCustomerHomeInstance(), BorderLayout.CENTER);
    }//GEN-LAST:event_btnCustomerAction

    private void btnOrdersAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersAction
        customerHome.getCustomerHomeInstance().setVisible(false);
        itemHome.getItemHomeInstance().setVisible(false);
        jPanelPages.setLayout(new BorderLayout());
        ordersHome.getOrdersHomeInstance().setVisible(true);
        jPanelPages.add(ordersHome.getOrdersHomeInstance(), BorderLayout.CENTER);
    }//GEN-LAST:event_btnOrdersAction

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnItem;
    private javax.swing.JButton btnOrders;
    private javax.swing.JPanel jPanelNavigation;
    private javax.swing.JPanel jPanelPages;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
