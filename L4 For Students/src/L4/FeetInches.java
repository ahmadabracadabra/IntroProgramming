/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4;

public class FeetInches {
    
    private int feet;
    private int inches;

    public FeetInches()
    {//write the code for the default constructor here
    feet = 0;
    inches = 0;
    }
    public FeetInches(int f, int i)
    {  //write the code for the constructor. 
    //do not worry (for now) about negative values
    //but if the user tries to construct an object
    //with more than 12 inches the constructor 
    //has to fix it. 
    //For example 4 feet and 15 inches becomes 5 and inches 3
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
    
    public void setInches(int i) {
        if (i > 11) {
    inches = i % 12;
    feet = feet + (i/12);
    }
    else {
     inches = i;
    }
    }
    
    public void setFeet(int f) {
       feet = f;
    }
    //write the accessors and mutators here
    // note that setInches must also account for the parameter 
    // being greater than 12
    
    
    //add accessors and mutators
    //add methods add, subtract, multiply, divide
    
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
    
    
    public String toString()
    {
     
        return feet + " feet " + inches + " inches";
        
        
        //code to allow the user to output a FeetInches object
    }
    
}
    

