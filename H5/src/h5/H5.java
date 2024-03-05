//NAME: Ahmad Abraham
/**
This program reduces negative fractions and then outputs 
the biggest and the smallest fractions from an input file. 
 */
package h5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class H5 {

    public static void main(String[] args) {
        
        //input from file
         File f = new File("H5.txt");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        { 
        }
        
        //set biggest and smallest
        int in1 = fileInput.nextInt();
        int in2 = fileInput.nextInt();
        Fraction biggest = new Fraction(in1,in2);
        Fraction smallest = new Fraction(in1,in2);
        
        //outputing first input from file
        System.out.println(biggest);
        
        //loop get file input and compare
        while(fileInput.hasNext()) {
         in1 = fileInput.nextInt();
         in2 = fileInput.nextInt();
         Fraction input = new Fraction(in1,in2);
         //output each reduced fraction
         System.out.println(input);
         if(input.compareTo(biggest) > 0) {
         biggest = input;
         }
         if(input.compareTo(smallest) <= 0) {
         smallest = input;
         } 
     
        } // end while
        
        
        //output biggest and smallest fractions
        System.out.println("The biggest fraction is: " + biggest);
        System.out.println("The smallest fraction is: " + smallest);
        
        
        
    } // end main 
} // end class
