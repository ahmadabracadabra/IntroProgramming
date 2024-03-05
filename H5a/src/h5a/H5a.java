//NAME: Ahmad Abraham
/**
This program reduces negative fractions and then outputs 
the biggest and the smallest fractions (using ArrayLists) from an input file. 
 */
package h5a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class H5a {

    public static void main(String[] args) {
        //declared arraylist
        ArrayList<Fraction> Flist = new ArrayList<Fraction>();
        
        //file input
         File f = new File("H5.txt");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        { 
        }
        
        //loop to get file input and put in arraylist
         while(fileInput.hasNext()) {
             int in1 = fileInput.nextInt();
             int in2 = fileInput.nextInt();
             Fraction newF = new Fraction(in1,in2);
             Flist.add(newF);
         }
        
          
         //output reduced fractions
         for(Fraction fr: Flist) {
             System.out.println(fr);
         }
         
         //find smallest and biggest fractions
        Fraction biggest = Collections.max(Flist);
        Fraction smallest = Collections.min(Flist);
         
        //output biggest and smallest fraction
        System.out.println("The biggest fraction is: " + biggest);
        System.out.println("The smallest fraction is: " + smallest);
            
        
    } // end main 
} // end class
