//NAME: Ahmad Abraham
package l11;

public class Staff extends Employee{
    //attributes
    //wants all attributes to be protected
    protected int paygrade;
    
    //constructors
    public Staff() {
        super();
        paygrade = 0;
    }
    
    public Staff(String n, double sal, int hd, int id, String d, int pg) {
        super(n,sal,hd,id,d);
        if(pg >= 1 && pg <= 20) {
        paygrade = pg;
        }
    }
    
    //accesors and mutators
    public int getPaygrade() {
        return paygrade;
    }
    
    public void setPaygrade(int paygrade) {
         if(paygrade >= 1 && paygrade <= 20) {
        this.paygrade = paygrade;
         }
    }
    
    //output
     public void WriteOutput() {
        super.WriteOutput();
        System.out.println( "Pay Grade: " + paygrade);
    }
     
} // end class
