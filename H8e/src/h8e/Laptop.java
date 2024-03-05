
package h8e;

public class Laptop extends Equipment {
    //attributes
    protected int RAM;
    
    //constructors
     public Laptop() {
        super();
        RAM = 0;
    }
    
    public Laptop(double w, double c, double pu, String m, int r) {
        super(w,c,pu,m);
        RAM = r;
    }

    //accessors and mutator
    public double getRAM() {
        return RAM;
    }

    
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    
    //output
    public void WriteOutput() {
        super.WriteOutput();
        System.out.println("RAM:" + RAM);
    }
    
}
