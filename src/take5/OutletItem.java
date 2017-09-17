/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take5;
import java.io.*;
/**
 *
 * @author saheed
 */
public class OutletItem implements Cloneable,Serializable{
    private Product item = null;
    private int quantity = 0;
    private double price = 0;
    
    public OutletItem(Product item,int quantity,double price){
        if(item == null){
            throw new IllegalStateException(" item null");
        }
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }
    public Product getItem(){
        return this.item;
    }
    public void setItem(Product item){
        this.item = item;
    }
    public void sellItem(){
        if(this.quantity< 1){
            throw new IllegalArgumentException("Not enough quantity");
        }
        this.quantity = this.quantity-1;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString(){
        return item.toString()+"  quantity: "+quantity+"  price: "+price;
    }
}
