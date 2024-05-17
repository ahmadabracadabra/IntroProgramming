package h16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//NAME: Ahmad Abraham
/*
This program prints out the original unsorted array of circles 
and the sorted array of circles using templates and selection sort.
*/

public class H16 {

   
    public static void main(String[] args) {
      
       //array of 15 circles
       Circle[] myCircle = new Circle[15];
        
       //call method to make Circles
       makeCircle(myCircle,15);
       
       System.out.println("Unsorted Circles:");
       printArray(myCircle);
        
        //sort
       selectionSort(myCircle,15);
        
       //output sorted circles
       System.out.println("Sorted Circles:");
       printArray(myCircle);
       
          
        
    }//end main
    
 //selection sort method   
public static <T extends Comparable> void selectionSort(T[] theArray, int n)
{
for (int last = n-1; last >= 1; last--)
{
int largest = indexOfLargest(theArray, last+1);
T temp = theArray[largest];
theArray[largest] = theArray[last];
theArray[last] = temp;
} // end for
} // end selectionSort

//largest method
private static <T extends Comparable> int indexOfLargest(T[]theArray, int size)
{
int indexSoFar = 0; // index of largest item found so far
for (Integer currIndex = 1; currIndex < size; ++currIndex) {
if (theArray[currIndex].compareTo(theArray[indexSoFar]) > 0) {
indexSoFar = currIndex;
} // end if
} // end for
return indexSoFar; // index of largest item
} // end indexOfLargest


//from video/templeMethods3
 public static <T> void printArray(T[]myA)
    {
        for (int k=0; k<myA.length; k++)
        {
            System.out.println(myA[k]);
        }
        System.out.println();
    }

 //method to make circles
public static void makeCircle(Circle[] myCircle, int len) {
    File f = new File("circles.in");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        {      
        }
        for(int i =0; i < myCircle.length; i++) {  
       double radius = fileInput.nextDouble();
       Circle c = new Circle(radius);
       myCircle[i] = c;
       }
    }
 
    
}//end class
