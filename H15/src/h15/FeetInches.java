package h15;

public class FeetInches implements Comparable<FeetInches> {
    
    private int feet;
    private int inches;

    //constructors
    public FeetInches() {
    feet = 0;
    inches = 0;
    }
    
    public FeetInches(int f, int i) {
    //branch checks if inches can be converted to feet
    if (i > 11) {
    inches = i % 12;
    feet = f + (i/12);
    }
    else {
     inches = i;
     feet = f;
    }
    
    }
    
    
    public int getInches() {
       return inches;
    }
    
    public int getFeet() {
       return feet;
    }
    
    //inches converted and saved to feet if possible, remaining inches saved to inches
    public void setInches(int i) {
    if (i > 11) {
    inches = i % 12;
    feet = feet + (i/12);
    }
    else {
     inches = i;
    }
    }
    
    //get feet from main
    public void setFeet(int f) {
       feet = f;
    }
    
    //methods add, subtract, multiply, divide 
    public FeetInches multiply(int n) {
       int f2 = n * this.feet;
       int in2 = n * this.inches;
       FeetInches ans = new FeetInches(f2, in2);
       return ans;
    }
    
     public FeetInches divide(int d) {
       int f2 = (this.feet * 12);
       int in2 = (this.inches + f2) / d;
       FeetInches ans = new FeetInches(0, in2);
       return ans;
    }
    
     public FeetInches add(FeetInches a) {
       int f1 = this.feet;
       int in1 = this.inches;
       int f2 = a.feet;
       int in2 = a.inches;
       FeetInches ans = new FeetInches(f1+f2, in1+in2);
       return ans;
    }
    
    public FeetInches subtract(FeetInches s) {
       int f1 = this.feet * 12;
       int in1 = this.inches + f1;
       int f2 = s.feet * 12;
       int in2 = s.inches + f2;
       int in = in1 - in2;
       FeetInches ans = new FeetInches(0, in);
       return ans;
    }
    
    //compare to
     public int compareTo(FeetInches fi) {
             double fi1 = (this.feet * 12) + this.inches;
             double fi2 = (fi.feet * 12) + fi.inches; 
             if(fi1 > fi2) {
             return 1;
             }
             else if(fi1 < fi2) {
              return -1;
             }
             else {
                 return 0;
             }
         }
    
    
    //output for class
    public String toString() {
        return feet + " feet " + inches + " inches"; 
    }
    
} // end class
    


