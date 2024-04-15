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
public class order {
    private String id;
    private String date;
    private String customerId;
    
    public order(String id, String date, String customerId){
        this.id = id;
        this.date = date;
        this.customerId = customerId;
    }
    
    // getters
    public String getId(){
        return id;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getCustomerId(){
        return customerId;
    }
    
    // setters
    public void setId(String id){
        this.id = id;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
}
