//NAME: Ahmad Abraham
package H9;

public class Staff extends Employee implements Comparable<Staff>{
    //attributes
    private int paygrade;
    
    //constructors
    public Staff() {
        super();
        paygrade = 0;
    }
    
    public Staff(int pg, String n, double sal, int hd, int id, String d) {
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
    
    //sort by salary
     public int compareTo(Staff s) {
      double s1 = this.salary;
      double s2 = s.salary;
         if(s1 > s2) {
       return 1;
       } 
       else if(s1 < s2) {
       return -1;
       } 
       else {
           return 0;
       }
    } 
    
    
    //output
     public void writeOutput() {
        super.writeOutput();
        System.out.println( "Pay Grade: " + paygrade);
    }
     
} // end class
