/*
 * For students
 */
package Final;

import java.io.*;
import java.util.Scanner;


public class Final {
//NAME: Ahmad Abraham
    
    public static void main(String[] args) {
        
      
       Temperature [] myArray = new Temperature[365];
       readData(myArray);
       //print all the data.Not sorted
        System.out.println("not Sorted");
       printData (myArray);
       //call quicksort to sort the data according to the temparature
      //quicksort is located in with the methods, you just have to call it here
       //print the sorted data
       quickSort(myArray,0,364);
        System.out.println("Sorted");
        printData (myArray);
     //Output the hottest and coldest day along with their temperatures.
        System.out.println("Hottest " + myArray[364]);
         System.out.println("Coldest " + myArray[0]);
     //Remember you have a toString method
     //Hint. the array is sorted according to temp
       
        System.out.println();
       System.out.println("Which month ?");
      // input a month
      Scanner keyboard = new Scanner(System.in);
      String month = keyboard.next();
       // output the hottest day and its temperature in this month. 
     Temperature big= findLargest(month, myArray);
    
   
      
    }
    
    public static void readData(Temperature[] t)
    {  //Input data, create Temperature objects, and fill array
        Scanner scan1=null, scan2=null;
        File inFile1 = new File("days.txt");
        File inFile2 = new File("temps.txt");
         
       try{
          scan1 = new Scanner(inFile1);
       /*days.txt contains the days
       temps.txt contains the temperature for each corresponding day
       so the first temperature (double) in temps.txt is the temperature for 
       January 1, the second is for January 2 etc. NOTE THE SPACE */
           scan2 = new Scanner(inFile2);
       } 
       catch (FileNotFoundException e)
       {  //do NOT put any code in here
       }
           //loop
           //get the day from days.txt using inFile1
           //get the temperature from temps.txt using inFile2
           //make Temperature object, put it in the array
        for(int i =0; i < t.length; i++) { 
       String inDay = scan1.nextLine();
       double inTemp = scan2.nextDouble();
       Temperature tp = new Temperature(inDay,inTemp);
       t[i] = tp;
       }
          
           
           
    //print data   
    }
    public static <T> void printData (T[] t)
    { 
        for (int i=0; i<t.length; i++)
            System.out.println(t[i]);
        System.out.println();
    }
    
    
    public static <T extends Comparable> void quickSort(T[] theArray, int first, int last) {

// ---------------------------------------------------------
// Sorts the items in an array into ascending order.
// Precondition: theArray[first..last] is an array.
// Postcondition: theArray[first..last] is sorted.
// Calls: partition.
// ---------------------------------------------------------

  int pivotIndex;

  if (first < last) {
    // create the partition: S1, Pivot, S2
    pivotIndex = partition(theArray, first, last);

    // sort regions S1 and S2
    quickSort(theArray, first, pivotIndex-1);
    quickSort(theArray, pivotIndex+1, last);
  }  // end if
}  // end quickSort

private static <T extends Comparable>
        int partition(T[] theArray, int first, int last) {
  T tempItem;
  // place pivot in theArray[first]
  //choosePivot(theArray, first, last);   // comment out this line
  T pivot = theArray[first];   // reference pivot

  // initially, everything but pivot is in unknown
  int lastS1 = first;          // index of last item in S1

  // move one item at a time until unknown region is empty
  // firstUnknown is the index of first item in unknown region

  for (int firstUnknown = first + 1; firstUnknown <= last;
                                    ++firstUnknown) {
    // Invariant: theArray[first+1..lastS1] < pivot
    //            theArray[lastS1+1..firstUnknown-1] >= pivot
    // move item from unknown to proper region
    if (theArray[firstUnknown].compareTo(pivot) < 0) {
      // item from unknown belongs in S1
      ++lastS1;
      tempItem = theArray[firstUnknown];
      theArray[firstUnknown] = theArray[lastS1];
      theArray[lastS1] = tempItem;
    }  // end if
  // else item from unknown belongs in S2
  }  // end for

  // place pivot in proper position and mark its location
  tempItem = theArray[first];
  theArray[first] = theArray[lastS1];
  theArray[lastS1] = tempItem;
  return lastS1;
}  // end partition

public static Temperature findLargest (String month, Temperature[] t) {  
    //month is a single word. But the day attribute contains a month and a day with a space in between
    //remember the String method contains
    //s.contains(t)  returns true if the String s contains the String t
     int k = 0;
   for(int i = 0; i < t.length; i++) {
    if(t[i].getDay().contains(month)) {
      if (t[i].compareTo(t[k])>0) {
      k = i;
      }
    }
   }
    System.out.println(t[k]);
return t[k]; 

}

    
} // end class
    

