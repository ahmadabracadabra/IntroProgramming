package l17;

//NAME: Ahmad Abraham

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
This program sorts the array of rectangles using 
bubble sort and outputs their area.
*/
public class L17 {

    
    public static void main(String[] args) {
         
        //array of rectangles
        Rectangle[] myRec = new Rectangle[10];
        
        //input method
        inputArray(myRec);
        
        //print unsorted array
        System.out.println("Unsorted Rectangles:");
        printArray(myRec);
        
        //sort array with bubble sort
        bubbleSort(myRec,10);
        
        //print sorted array
        System.out.println("Sorted Rectangles:");
        printArray(myRec);
        
        
    } //end main
    
//bubbleSort method    
public static <T extends Comparable> void bubbleSort(T[] theArray, int n) {
  boolean sorted = false; // false when swaps occur
//loop through the entire array AND as long as sorted is FALSE
  for (int pass = 1; (pass < n) && !sorted; ++pass){
sorted = true; // assume sorted
for (int index = 0; index < n-pass; ++index) {
int nextIndex = index + 1;
if (theArray[index].compareTo(theArray[nextIndex]) > 0) //if the pair is out of order...exchange items
{
T temp = theArray[index]; // exchange items
theArray[index] = theArray[nextIndex];
theArray[nextIndex] = temp;
sorted = false; // signal exchange
} // end if
} // end inner for
} // end outer for
} // end bubbleSort
  

  public static void inputArray(Rectangle[] myRec) {
    File f = new File("rectInput.txt");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        {      
        }
        for(int i =0; i < myRec.length; i++) {  
       double leng = fileInput.nextDouble();
       double wid = fileInput.nextDouble();
       Rectangle r = new Rectangle(leng, wid);
       myRec[i] = r;
       }
    }
  
  
  //printArray method
  public static void printArray(Rectangle[]myR)
    {
        for (int k=0; k<myR.length; k++)
        {
            System.out.println(myR[k].area());
        }
        //space after printing
        System.out.println();
    } 

}//end class
