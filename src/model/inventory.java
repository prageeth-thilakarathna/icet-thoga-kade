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
public class inventory {
    private int qty;
    private int prevQty;
    private String itemCode;
    
    public inventory(int qty, int prevQty, String itemCode){
        this.qty = qty;
        this.prevQty = prevQty;
        this.itemCode = itemCode;
    }
    
    // getters
    public int getQty(){
        return qty;
    }
    
    public int getPrevQty(){
        return prevQty;
    }
    
    public String getItemCode(){
        return itemCode;
    }
}
