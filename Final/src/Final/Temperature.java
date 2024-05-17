
package Final;


public class Temperature implements Comparable<Temperature> {
//attributes    
private String day;
private double temp;

//default constructor
public Temperature() {
    day = "";
    temp = 0;
}

//constructor with parameter
public Temperature(String d, double t) {
    day = d;
    temp = t;
}

//set and get
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getTemp() {
        return temp;
    }

   
    public void setTemp(double temp) {
        this.temp = temp;
    }

    //compareTo
    public int compareTo(Temperature tmp) {
             double t1 = this.temp;
             double t2 = tmp.temp; 
             if(t1 > t2) {
             return 1;
             }
             else if(t1 < t2) {
              return -1;
             }
             else {
                 return 0;
             }  
    }
    
    
    //toString
    public String toString () {
        return "Day: " + day + "  Temperature: " + temp;
        }
    
    
    
    
}
