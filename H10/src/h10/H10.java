
package h10;

import java.util.Random;
//NAME: Ahmad Abraham

public class H10 {

    public static void main(String[] args) {
       Random rand = new Random();
       //declare and initialize arrays
       String[] flowerArray = {"petunia", "pansy", "rose", "violet", "carnation"};
       String[] nameArray = {"Frankie", "Janet", "Sam", "Abbie"};
       int[][] soldArray = new int[4][5];
      
       
       //generate random numbers in table
       int row,col;
       for (row = 0; row < 4; row++) {
          for(col= 0; col < 5; col++) {
         soldArray[row][col] = rand.nextInt(21);
          }
       }
       
       
       //display name of flowers over columns
       for (int i = 0; i < 5; i++) {
           System.out.print("  \t   " + flowerArray[i]);
       }
       
       
        System.out.println("");
       
        
        //display names and flowers sold
       for (row= 0; row < 4; row++) {
           System.out.print(nameArray[row] + "\t");
           for(col= 0; col < 5; col++) {
           System.out.print("    " + soldArray[row][col] +  "\t\t");  
           }
       System.out.println("");
       }
       
       
        System.out.println("");
       
        
        //output total flowers each person sold
       for(int k = 0; k < 4; k++ ) { 
           int personTotal = 0;
           for(int m = 0; m < 5; m++ ) {
           personTotal = personTotal + soldArray[k][m];
           }
           System.out.println(nameArray[k] + " sold " + personTotal + " flowers");
       }
       
       
       System.out.println("");
      
       
       //output total flower type sold 
       for (int p = 0; p < 5; p++) {
            int flowerTotal = 0;
           for (int j = 0; j < 4; j++) {
           flowerTotal = flowerTotal + soldArray[j][p];    
           }
       System.out.println("Total number of " + flowerArray[p] + "s sold: " + flowerTotal);
       }
       
       
       
    } // end main
    
} // end class
