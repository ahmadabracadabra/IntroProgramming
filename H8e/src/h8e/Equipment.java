
package h8e;

public class Equipment implements Comparable<Equipment> {
   //attributes
   protected double weight;
   protected double cost;
   protected double wattage;
   protected String manufacturer;

   //constructors
   public Equipment() {
     weight = 0;
     cost = 0;
     wattage = 0;
     manufacturer = "";
   }
   
   public Equipment(double w, double c, double pu, String m) {
       weight = w;
       cost = c;
       wattage = pu;
       manufacturer = m;
   }
   
    //accessors and mutators
    public double getWeight() {
        return weight;
    }

    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public double getCost() {
        return cost;
    }

   
    public void setCost(double cost) {
        this.cost = cost;
    }

    
    public double getWattage() {
        return wattage;
    }

    
    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    
    public String getManufacturer() {
        return manufacturer;
    }

    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
     //compare to sort by cost 
    public int compareTo(Equipment e) {
        double e1 = this.cost;
        double e2 = e.cost;
        if (e1 > e2) {
            return 1;
        }
        else if (e1 < e2) {
            return -1;
        }
        else {
            return 0;
        }
    }
    
    
    //output
    public void WriteOutput() {
        System.out.println("Weight:" + weight);
        System.out.println("Cost:$" + cost);
        System.out.println("Wattage:" + wattage);
        System.out.println("Manufacturer:" + manufacturer);
    }
   
}
