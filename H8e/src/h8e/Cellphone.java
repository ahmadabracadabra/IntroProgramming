
package h8e;


public class Cellphone extends Equipment {
    //attributes
    protected String carrier;
    
    //constructors
     public Cellphone() {
        super();
        carrier = "";
    }
    
    public Cellphone(double w, double c, double pu, String m, String car) {
        super(w,c,pu,m);
        carrier = car;
    }

    //accessors and mutators
    public String getCarrier() {
        return carrier;
    }

   
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    
      
    //output
    public void WriteOutput() {
        super.WriteOutput();
        System.out.println("Carrier:" + carrier);
    }
    
}
