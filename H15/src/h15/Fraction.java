
package h15;


public class Fraction implements Comparable<Fraction> {
    //attributes
      private int numerator;
      private int denominator;
      
    //constructors  
      public Fraction() {
          numerator = 0;
          denominator = 1;
      }
      
      public Fraction(int num, int den) {
           int g = gcd(Math.abs(num),Math.abs(den));
           if(g != 0) {
           numerator = num / g;
          denominator = den / g;
           }
           else {
               numerator = num;
               denominator = den;
            }           
      }

 //accessors and mutators
    public int getNumerator() {
        return numerator;
    }

   
    public void setNumerator(int n) {
        int g = gcd(Math.abs(n),Math.abs(denominator));
            if(g != 0) {
           numerator = n / g;
            } 
            else {
               numerator = n;
            }
    }

   
    public int getDenominator() {
        return denominator;
    }

   
    public void setDenominator(int d) {
        int g = gcd(Math.abs(numerator),Math.abs(d));
            if(g != 0) {
           denominator = d / g;
            }
            else {
               denominator = d;
            }
    }
      
    //add two fractions
    public Fraction add(Fraction a) {
       int n1 = (this.numerator * a.denominator) + (a.numerator * this.denominator);
       int d1 = this.denominator * a.denominator;
       Fraction ans = new Fraction(n1 , d1);
       return ans;
    }  
    
    //subtract two fractions
     public Fraction subtract(Fraction s) {
       int n1 = (this.numerator * s.denominator) - (s.numerator * this.denominator);
       int d1 = this.denominator * s.denominator;
       Fraction ans = new Fraction(n1, d1);
       return ans;
    }
    
     //multiply two fractions
      public Fraction multiply(Fraction m) {
       int n1 = this.numerator * m.numerator;
       int d1 = this.denominator * m.denominator;
       Fraction ans = new Fraction(n1, d1);
       return ans;
    }
      
      //divide two fractions
      public Fraction divide(Fraction d) {
       int n1 = this.numerator * d.denominator;
       int d1 = this.denominator * d.numerator;
       Fraction ans = new Fraction(n1, d1);
       return ans;
    }
    
      //output in fraction format (flip/move negative signs when needed)
    public String toString() {
        if(denominator < 0) {
        numerator = -numerator;
        denominator = -denominator;
        }
        return numerator + "/" + denominator;     
    }
    
    //reduce fractions
    private int gcd(int int1, int int2) {
          int smaller = Math.min((Math.abs(int1)),Math.abs(int2));
          int i;
         for(i = smaller; i > 1; i--) {
            if ((int1 % i == 0) && (int2 % i == 0)) {
            break;
            }
         }
         return i;
         }
    
    //turn fractions into decimals and then compare
    public int compareTo(Fraction f) {
      double f1 = (double)this.numerator / (double)this.denominator;
      double f2 = (double)f.numerator / (double)f.denominator;
       if(f1 > f2) {
       return 1;
       } 
       else if(f1 < f2) {
       return -1;
       } 
       else {
           return 0;
       }
    }
    
} // end class

