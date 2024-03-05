//NAME: Ahmad Abraham
/*
This program determines the class you want to 
use based on character input, and preforms the calculations 
specified in the respective class
*/

package h6;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class H6 {
  
    public static void main(String[] args) {
        //declared ArrayLists
        ArrayList<Circle> C = new ArrayList<Circle>();
        ArrayList<Rectangle> R = new ArrayList<Rectangle>();
        ArrayList<Fraction> F = new ArrayList<Fraction>();
        ArrayList<FeetInches> I = new ArrayList<FeetInches>();
        
        //input from file
        File f = new File("H6.in");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        { 
        }
        
        
        //loop through all input from file
        while(fileInput.hasNext()) { // while start
            //input letter of Class
            char inputClass = fileInput.next().charAt(0);
            
        //determine which class to use
        switch(inputClass) {
            case 'C':
                  double radius = fileInput.nextDouble();
                   Circle c = new Circle(radius);
                   C.add(c);
            break;
            case 'R':
                 double length = fileInput.nextDouble();
                 double width = fileInput.nextDouble();
                  Rectangle r = new Rectangle(length,width);
                  R.add(r);
            break;
                 case 'F':
                 int num = fileInput.nextInt();
                 int den = fileInput.nextInt();
                  Fraction fr = new Fraction(num,den);
                  F.add(fr);
            break;
            case 'I':
                int feet = fileInput.nextInt();
                int inches = fileInput.nextInt();
                 FeetInches i = new FeetInches(feet,inches);
                 I.add(i); 
            break;
            default:
                System.out.println("Enter Valid Letter: C for Circle, R for Rectangle, F for Fraction, I for FeetInches");
            break;
        } // end switch
        } // end while
        
        //output class calculations in groups
        System.out.println("These are the Circles: ");
        for(Circle myc: C) {
             System.out.println(myc);
         }
        
        System.out.println();
        System.out.println("These are the Rectangles: ");
        for(Rectangle myr: R) {
             System.out.println(myr);
         }
        
        System.out.println();
        System.out.println("These are the Fractions: ");
        for(Fraction myf: F) {
             System.out.println(myf);
         }
        
        System.out.println();
        System.out.println("These are the FeetInches: ");
        for(FeetInches myi: I) {
             System.out.println(myi);
         }
        
        
    } // end main
} // end class
