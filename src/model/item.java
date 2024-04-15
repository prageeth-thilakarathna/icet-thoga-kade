package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ygpra
 */
public class item {
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
    
    public item(String code, String description, double unitPrice, int qtyOnHand){
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }
    
    // getters
    public String getCode(){
        return code;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getUnitPrice(){
        return unitPrice;
    }
    
    public int getQtyOnHand(){
        return qtyOnHand;
    }
    
    // setters
    public void setCode(String code){
        this.code = code;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    
    public void setQtyOnHand(int qtyOnHand){
        this.qtyOnHand = qtyOnHand;
    }
}
