package take5;

import java.time.LocalDate;
public interface Properties{// should be an interface rather than a class because that was the intended purpose
        abstract int getID();
        abstract void setID(int id);
	abstract String getName();
	abstract void setName(String name);
	abstract String getVendor();
	abstract void setVendor(String vendor);
	abstract String getCategory();
	abstract void setCategory(String category);
	abstract LocalDate getExpiryDate();
	abstract void setExpiryDate(String date);
//	abstract int getQuantity();
//	abstract void setQuantity(int number);
//	abstract double getCostPrice();
//	abstract void setCostPrice(double number);
//	abstract void setSellingPrice(double number);
//	abstract double getSellingPrice();



}