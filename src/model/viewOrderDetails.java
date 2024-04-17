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
public class viewOrderDetails {
    private String orderId;
    private String customerId;
    private String itemCode;
    private String quantity;
    private String total;
    
    public viewOrderDetails(String orderId, String customerId){
        this.orderId = orderId;
        this.customerId = customerId;
    }
    
    // getters
    public String getOrderId(){
        return orderId;
    }
    
    public String getCustomerId(){
        return customerId;
    }
    
    public String getItemCode(){
        return itemCode;
    }
    
    public String getQuantity(){
        return quantity;
    }
    
    public String getTotal(){
        return total;
    }
    
    // setters
    public void setOrderId(String orderId){
        this.orderId = orderId;
    }
    
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }
    
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }
    
    public void setTotal(String total){
        this.total = total;
    }
}
