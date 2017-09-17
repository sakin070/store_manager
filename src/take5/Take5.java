/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take5;

/**
 *
 * @author saheed
 */
public class Take5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Outlet musaroq = new Outlet();
            musaroq.addItem(new Product(001, "paracetamol","emzor","Phamacy","2017-09-15"), 50, 150);
            musaroq.addItem(new Product(002,"eritromiscine","becham","Phamacy","2019-10-15"),20, 300);
            musaroq.addItem(new Product(003,"vitaminc","dontknow","Phamacy","2019-10-15"), 40, 200);
            musaroq.addItem(new Product(004,"turbinhaler","symbicort","Phamacy","2018-04-24"), 5, 100);
            musaroq.addItem(new Product(005,"jordans","nike","shoe","2018-04-24"), 50, 500);
            musaroq.saveOutlet();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
