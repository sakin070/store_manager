/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take5;
import java.util.LinkedList;
import java.util.Iterator;
import java.io.*;
/**
 *
 * @author saheed
 */
public class Outlet implements Cloneable,Serializable{
    private LinkedList<OutletItem> data = null;
    private File file = new File("savedOutlet.ser");
    
    public Outlet addItem(Product item,int quantity,double price){
        if (data == null){
            data = new LinkedList<OutletItem>();
        }
        data.add(new OutletItem( item, quantity, price));
        return this;
    }
    public LinkedList<OutletItem> getData(){
        return this.data;
    }
    public void setData(LinkedList<OutletItem> data){
        this.data = data;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Outlet Collection { \n");
        for(OutletItem item:data){
            sb.append(item.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
    public OutletItem findItem(int id){
        Iterator<OutletItem> it = data.iterator();
        OutletItem ans = null;
        while(it.hasNext()&& ans == null){
            OutletItem temp = it.next();
            if (temp.getItem().getID() == id){
                ans = temp;
            }
        }
        if (ans == null){
            throw new IllegalStateException();
        }
        return ans;
    }
    public void saveOutlet()throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(data);
        oos.close();
    }
    public void loadOutlet() throws IOException,ClassNotFoundException{
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
         this.data =(LinkedList<OutletItem>) ois.readObject();
          ois.close();
    }
}
