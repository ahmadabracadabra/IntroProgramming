package h3;

import java.util.Random;

public class Die {
   //declared variable
   private int face;
   
   //roll constructor
    public Die() {
    roll();
    }
    
    //generate random number between 1-6 inclusive
    public void roll() {
    Random rand = new Random();
    setFace(rand.nextInt(6)+1); 
    }
    
    //die face accessor
    public int getFace() {
        return face;
    }
    
    //set die face value
    public void setFace(int face) {
        this.face = face;
    }
    
    //print string value of face value
    public String toString() {
        if (face == 1) return "1";
        if (face == 2) return "2";
        if (face == 3) return "3";
        if (face == 4) return "4";
        if (face == 5) return "5";
        if (face == 6) return "6";  
        else return "Unexpected error";
    }
    

} // end class