/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ygpra
 */
public class orderDetails {
    private String orderId;
    private String itemCode;
    private int qty;
    private double unitPrice;
    
    public orderDetails(String orderId, String itemCode, int qty, double unitPrice){
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    // getters
    public String getOrderId(){
        return orderId;
    }
    
    public String getItemCode(){
        return itemCode;
    }
    
    public int getQty(){
        return qty;
    }
    
    public double getUnitPrice(){
        return unitPrice;
    }
    
    // setters
    public void setOrderId(String orderId){
        this.orderId = orderId;
    }
    
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
}
