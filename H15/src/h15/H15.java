package h15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//NAME: Ahmad Abraham
/*
This program uses the Binary Search algorithm to search for objects of 
type Circle, Fraction, FeetInches,  Rectangle. Search for objects in 
array using this algorithm, enter two numbers (or pair of numbers) at a time.
*/

public class H15 {

    public static void main(String[] args) {
        //scanner input from user
        Scanner scnr = new Scanner(System.in);
      
        //scanner input from file
          File f = new File("BinarySearch.in");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        { 
        }
        
        
        //declared arrays
        Rectangle[] myRec = new Rectangle[12];
        Circle[] myCircle = new Circle[20];
        Fraction[] myFract = new Fraction[24];
        FeetInches[] myFeetIn = new FeetInches[16];   
        
       
        //input from file into array and output
        //RECTANGLE
        System.out.println("Rectangle:");
       for(int i =0; i < 12; i++) {       
       double length = fileInput.nextDouble();
       double width = fileInput.nextDouble();
       Rectangle r = new Rectangle(length,width);
       myRec[i] = r;
       System.out.println(myRec[i]);
       }
       
        System.out.println();
       
       //CIRCLE
       System.out.println("Circle:");
       for(int i =0; i < 20; i++) {  
       double radius = fileInput.nextDouble();
       Circle c = new Circle(radius);
       myCircle[i] = c;
       System.out.println(myCircle[i]);
       }
       
         System.out.println();
         
       //FRACTION
       System.out.println("Fraction:");
       for(int i =0; i < 24; i++) {  
       int num = fileInput.nextInt();
       int den = fileInput.nextInt();
       Fraction fr = new Fraction(num,den);
       myFract[i] = fr;
       System.out.println(myFract[i]);
       }
       
         System.out.println();
         
       //FEETINCHES
       System.out.println("FeetInches:");
       for(int i =0; i < 16; i++) {         
       int feet = fileInput.nextInt();
       int inches = fileInput.nextInt();
       FeetInches fi = new FeetInches(feet,inches);
       myFeetIn[i] = fi;
       System.out.println(myFeetIn[i]);
       }
       
        System.out.println();
         
     
        
    //INPUT FROM USER BINARY SEARCH
      //rectangle 
      //example comments are first and last in index
      //example: 1.5 1.0 6.2 7.0
    System.out.println("Enter two length/width pairs:");
    double inLen = scnr.nextDouble();
    double inWid = scnr.nextDouble();
    double inLen2 = scnr.nextDouble();
    double inWid2 = scnr.nextDouble();
    Rectangle lenwid = new Rectangle(inLen,inWid);
    Rectangle lenwid2 = new Rectangle(inLen2,inWid2);
    System.out.println(binarySearch(myRec,lenwid,0,11));
    System.out.println(binarySearch(myRec,lenwid2,0,11));   
        
        
       //circle  
       //example: 1.1 6.0
    System.out.println("Enter two radii:");
    double inRadi = scnr.nextDouble();
    double inRadi2 = scnr.nextDouble();
    Circle radius = new Circle(inRadi);
    Circle radius2 = new Circle(inRadi2);
    System.out.println(binarySearch(myCircle,radius,0,19));
    System.out.println(binarySearch(myCircle,radius2,0,19));
       
    
       //fraction  
       //example: 1 16 15 8
    System.out.println("Enter two numerator/denominator pairs:");
    int inNum = scnr.nextInt();
    int inDen = scnr.nextInt();
    int inNum2 = scnr.nextInt();
    int inDen2 = scnr.nextInt();
    Fraction frac = new Fraction(inNum,inDen);
    Fraction frac2 = new Fraction(inNum2,inDen2);
    System.out.println(binarySearch(myFract,frac,0,23));
    System.out.println(binarySearch(myFract,frac2,0,23)); 
    
    
       //feetinches  
    System.out.println("Enter two feet/inches pairs:");
    //example: 2 4 31 4
    int inFeet = scnr.nextInt();
    int inIn = scnr.nextInt();
    int inFeet2 = scnr.nextInt();
    int inIn2 = scnr.nextInt();
    FeetInches feetinch = new FeetInches(inFeet,inIn);
    FeetInches feetinch2 = new FeetInches(inFeet2,inIn2);
    System.out.println(binarySearch(myFeetIn,feetinch,0,15));
    System.out.println(binarySearch(myFeetIn,feetinch2,0,15)); 
        
    } //end main
    

 //binary search for Rectangle 
public static int binarySearch(Rectangle[]R, Rectangle key, int low, int high) {
int rangeSize = (high-low) + 1;
int mid = (high+low)/2;

if(key.compareTo(R[mid]) == 0) {
    return mid;//found it, no further recursion needed
}
else if(rangeSize==1) {
    return -1;//not in array
}
if (key.compareTo(R[mid]) < 0) {
    return binarySearch(R, key, low, mid);
}
else {
    return binarySearch(R, key, mid+1, high);
}
}

 //binary search for Circle   
public static int binarySearch(Circle[]C, Circle key, int low, int high) {
int rangeSize = (high-low) + 1;
int mid = (high+low)/2;

if(key.compareTo(C[mid]) == 0) {
    return mid;//found it, no further recursion needed
}
else if(rangeSize==1) {
    return -1;//not in array
}
if (key.compareTo(C[mid]) < 0) {
    return binarySearch(C, key, low, mid);
}
else {
    return binarySearch(C, key, mid+1, high);
}
}

 //binary search for Fraction 
public static int binarySearch(Fraction[]F, Fraction key, int low, int high) {
int rangeSize = (high-low) + 1;
int mid = (high+low)/2;

if(key.compareTo(F[mid]) == 0) {
    return mid;//found it, no further recursion needed
}
else if(rangeSize==1) {
    return -1;//not in array
}
if (key.compareTo(F[mid]) < 0) {
    return binarySearch(F, key, low, mid);
}
else {
    return binarySearch(F, key, mid+1, high);
}
}

 //binary search for FeetInches 
public static int binarySearch(FeetInches[]FI, FeetInches key, int low, int high) {
int rangeSize = (high-low) + 1;
int mid = (high+low)/2;

if(key.compareTo(FI[mid]) == 0) {
    return mid;//found it, no further recursion needed
}
else if(rangeSize==1) {
    return -1;//not in array
}
if (key.compareTo(FI[mid]) < 0) {
    return binarySearch(FI, key, low, mid);
}
else {
    return binarySearch(FI, key, mid+1, high);
}
}
    
    
} // end class
