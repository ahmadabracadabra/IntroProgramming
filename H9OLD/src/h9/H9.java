
package h9;

//NAME: Ahmad Abraham
/*
This program creates an array of 12 random integers (between 1-9) and 
create another array with all numbers less than or equal to another randomly 
generated integer (between 1-9) removed. 
*/

import java.util.Random;

public class H9 {

    public static void main(String[] args) {
        //declared variables
        Random rand = new Random();  
        int[] myArray = new int[12];
        int[] newArray = new int[12];
        int randNum;
        int randLimit;
        int i;
        
        //generate 12 random numbers (between 1 and 9) and store in an array
        System.out.println("The original array contained: ");
        for(i = 0; i < 12; i++) {
            randNum = rand.nextInt(9) + 1;
            myArray[i] = randNum;
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
        
        // generate random number (between 1 and 9) to be restraint for new array
        randLimit = rand.nextInt(9) + 1;
        System.out.println("All numbers less than or equal to " + randLimit + " to be removed.");
        
        
        //generates a new array that removes integers that are less than or equal to randLimit
        System.out.println("The new array contains: ");
        for (i = 0; i < 12; i++) {
            if (myArray[i] > randLimit) {
              newArray[i] = myArray[i];
              System.out.print(newArray[i] + " ");
            }
        }
        
        
        
        } //end main
    } //end class
    

