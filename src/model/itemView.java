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
public class itemView {
    private String code;
    private String description;
    private String unitPrice;
    private String qtyOnHand;
    
    public itemView(String code, String description, String unitPrice, String qtyOnHand){
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
    
    public String getUnitPrice(){
        return unitPrice;
    }
    
    public String getQtyOnHand(){
        return qtyOnHand;
    }
    
    // setters
    public void setCode(String code){
        this.code = code;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setUnitPrice(String unitPrice){
        this.unitPrice = unitPrice;
    }
    
    public void setQtyOnHand(String qtyOnHand){
        this.qtyOnHand = qtyOnHand;
    }
}
