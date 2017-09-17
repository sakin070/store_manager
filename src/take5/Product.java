package take5;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Product implements Properties,Serializable{
        private int id;
	private String name;
	private String vendor;
	private String category;
	private LocalDate expiryDate;
//	private int quantity;
//	private double costPrice;
//	private double sellingPrice;

	public 	Product(int id ,String name, String vendor, String category,String expiryDate){//, int quantity, double costPrice, double sellingPrice){
                this.id =id;
		this.name = name;
		this.vendor = vendor;
		this.expiryDate = LocalDate.parse(expiryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//		this.quantity = quantity;
//		this.costPrice = costPrice;
//		this.category = category;
//		this.sellingPrice = sellingPrice;

	}
        
        public int getID(){
            return id;
        
        }
        public void setID(int id){
            this.id = id;
        }
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getVendor(){
		return vendor;
	}
	public void setVendor(String vendor){
		this.vendor = vendor;
	}
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public LocalDate getExpiryDate(){
		return expiryDate;
	}
	public void setExpiryDate(String date){
		this.expiryDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
//	public int getQuantity(){
//		return quantity;
//	}
//	public void setQuantity(int number){
//		quantity = number;
//	}
//	public void increaseQuantity(){
//		quantity++;
//	}
//	public void reduceQuantity(){
//		if(quantity==0){
//			throw new IllegalStateException("quantity is not enough");
//		}
//		quantity--;
//	}
//	public void reduceQuantity(int number){
//		if(quantity<number){
//			throw new IllegalStateException("quantity is not enough");
//		}
//		quantity = quantity - number;
//	}
//	public void increaseQuantity(int number){
//		quantity = quantity + number;
//	}
//	public double getCostPrice(){
//		return costPrice;
//	}
//	public void setCostPrice(double number){
//		costPrice = number;
//	}
//	public double getSellingPrice(){
//		return sellingPrice;
//	}
//	public void setSellingPrice(double number){
//		sellingPrice = number;
//	}
        @Override
	public String toString(){
		return name+" by "+vendor+" category: "+category+" expires by "+expiryDate;//+" quantity: "+quantity+" costprice: "+costPrice+" sellingprice: "+sellingPrice;
	}
	public Product self(){
		return this;
	}


}