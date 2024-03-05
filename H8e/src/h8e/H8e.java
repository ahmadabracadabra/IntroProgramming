//NAME: Ahmad Abraham
package h8e;
/*This program designs and implements a set of classes 
representing electronic equipment, including laptops,cellphones, and digital cameras*/
import java.util.ArrayList;
import java.util.Collections;

public class H8e {

    
    public static void main(String[] args) {
    
        //Write a main method that creates at least two laptops, two cellphones, and two cameras using the non-default constructor. 
        Laptop l1 = new Laptop(45.03,457.99, 54.32, "Dell", 128);
        Laptop l2 = new Laptop(55.02,1037.99, 74.30, "Apple", 512);
        
        Cellphone cp1 = new Cellphone(3.45, 780.99, 24.10, "Apple", "T-Mobile");
        Cellphone cp2 = new Cellphone(3.25, 580.99, 20.30, "Samsung", "Verizon");
        
        Camera cam1 = new Camera(12.25, 950.99, 10.30, "Sony", 48);
        Camera cam2 = new Camera(13.45, 780.95, 11.45, "Samsung", 128);
        
        //arraylist declared
        ArrayList<Equipment> myE = new ArrayList<Equipment>();
        
        //add objects to arraylist
        myE.add(l1);
        myE.add(l2);
        myE.add(cp1);
        myE.add(cp2);
        myE.add(cam1);
        myE.add(cam2);
        
        //print unsorted arraylist
        System.out.println("Unsorted ArrayList:");
        for(int i = 0; i < myE.size(); i++) {
            myE.get(i).WriteOutput();
        }
        
        //space for readability
        System.out.println("");
        
        //sort arraylist
        Collections.sort(myE);
        
        //print sorted arrayList
        System.out.println("Sorted ArrayList:");
        for(int i = 0; i < myE.size(); i++) {
            myE.get(i).WriteOutput();
        }
        
    } // end main
    
} // end class
