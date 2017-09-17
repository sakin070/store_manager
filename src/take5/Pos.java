package take5;


import java.util.LinkedList;
import java.util.Iterator;

public class Pos{
	// to be able to query the inventory to find a product
	// reduce the quantity of a product when try to make a sale
	// total the cost
	// ask for customer idn and  work without idn
	// print a recipt
	// remenber to add exceptions
	private Outlet outlet;
	private double currentCost;
        private double dailyTotal;
        private LinkedList<Integer> itemsToBeSold = null;
        private StringBuffer sb1 = new StringBuffer();
        private StringBuffer sb2 = new StringBuffer();
	//private Customer customer;

	public Pos(Outlet outlet){
            this.outlet = outlet;
	}
	public void toBeSold(int id){
            if(itemsToBeSold == null){
                itemsToBeSold = new LinkedList<Integer>();
            }
           itemsToBeSold.add(id);
           OutletItem temp = outlet.findItem(id);
           sb1.append(temp.getItem());
           sb1.append("\n");
           sb2.append(temp.getPrice());
           sb2.append("\n");
           //System.out.print("                   ");
           currentCost = currentCost+temp.getPrice();
           

	}
        public String toBeSold1(){
            return sb1.toString();
        }
        public String toBeSold2(){
            return sb2.toString();
        }
	// remove from to be sold
        

        public void removeFromToBeSold(int id){
            itemsToBeSold.removeLastOccurrence(id);
            Iterator<Integer>  it1 = itemsToBeSold.iterator();
            currentCost = 0;
            sb1 = new StringBuffer();
            sb2 = new StringBuffer();
            while(it1.hasNext()){
                Integer tempID = it1.next();
                OutletItem tempItem = outlet.findItem(tempID);
                sb1.append(tempItem.getItem());
                sb1.append("\n");            
                sb2.append(tempItem.getPrice());
                sb2.append("\n");
                currentCost = currentCost+tempItem.getPrice();
            }
        }

	public void sell(){// Should sell return a recipt
            Iterator<Integer> it1 = itemsToBeSold.iterator();
            while(it1.hasNext()){
                OutletItem temp = outlet.findItem(it1.next());
                temp.sellItem();
            }
            dailyTotal = dailyTotal +currentCost;
            currentCost = 0;
            itemsToBeSold = null;
            sb1 = new StringBuffer();
            sb2 = new StringBuffer();
	}
        
        
        
        public void refund(int id){
           OutletItem temp = outlet.findItem(id);
            temp.setQuantity(temp.getQuantity()+1);
        }
        
        public double getTotlCost(){
            return currentCost;
        }
	// to add refunds back and things link that
	// just create a data type of type date its much easier
	// the unit measurement
	//

}