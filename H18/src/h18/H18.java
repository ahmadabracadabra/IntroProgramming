package h18;
//NAME: Ahmad Abraham

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
This program times how long it takes to sort an 
array of strings using 6 different sorts
*/
public class H18 {

    
    public static void main(String[] args) {
       //declare array of strings
       String[] wordArray = new String[9164];
       
       //input array
       inputArray(wordArray);
        
       
       //sort array of strings
       selectionSort(wordArray, 9164);
       
       //print sorted array
       //printArray(wordArray);        
        
         
       //declare array A and B
       String[] A = new String[9164];
       inputArray(A);
      
       String[] B = new String[9164];
        
       
       //SELECTION SORT LOOP
        System.out.println("Selection Sort:");
       double total = 0;
        for (int i=0; i<10; i++) {
            copyAB(A, B);
            //start
            long startTime = System.nanoTime(); 
            selectionSort(B, 9164);
            //stop
            long endTime = System.nanoTime();
            double duration = (endTime - startTime)/1000000.0; //milliseconds
            //calculate and output time taken
            total = total + duration;
            System.out.println(duration);   
           }
        System.out.println("Average:" + total/10);
        
        
        //space
        System.out.println();
        
      
     
      
       
        
        //INSERTION SORT LOOP
        System.out.println("Insertion Sort:");
       double total2 = 0;
        for (int i=0; i<10; i++) {
            copyAB(A, B);
            
            //start
            long startTime = System.nanoTime(); 
            insertionSort(B, 9164);
            //stop
            long endTime = System.nanoTime();
            double duration = (endTime - startTime)/1000000.0; //milliseconds
            //calculate and output time taken
            total2 = total2 + duration;
            System.out.println(duration);   
           }
        System.out.println("Average:" + total2/10);
        
        
        //space
        System.out.println();
        
        
        //BUBBLE SORT LOOP
        System.out.println("Bubble Sort:");
       double total3 = 0;
        for (int i=0; i<10; i++) {
            copyAB(A, B);
            //start
            long startTime = System.nanoTime(); 
            insertionSort(B, 9164);
            //stop
            long endTime = System.nanoTime();
            double duration = (endTime - startTime)/1000000.0; //milliseconds
            //calculate and output time taken
            total3 = total3 + duration;
            System.out.println(duration);   
           }
        System.out.println("Average:" + total3/10);
      
        
        //space
        System.out.println();
        
        
        //COLLECTION SORT LOOP
        System.out.println("Collection Sort:");
        double total4 = 0;
        for (int i=0; i<10; i++) {
        List <String> wordList = Arrays.asList(wordArray);  
        long startTime = System.nanoTime();
        Collections.sort(wordList);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime)/1000000.0; //milliseconds
        total4 = total4 + duration;
        System.out.println(duration);
        }
        System.out.println("Average:" + total4/10);
        
        
        //space
        System.out.println();
        
        
        //MERGE SORT LOOP
        System.out.println("Merge Sort:");
       double total5 = 0;
        for (int i=0; i<10; i++) {
            copyAB(A, B);
            //start
            long startTime = System.nanoTime(); 
            mergesort(B);
            //stop
            long endTime = System.nanoTime();
            double duration = (endTime - startTime)/1000000.0; //milliseconds
            //calculate and output time taken
            total5 = total5 + duration;
            System.out.println(duration);   
           } 
        System.out.println("Average:" + total5/10);
        
        
        //space
        System.out.println();
        
        
        //QUICK SORT
        System.out.println("Quick Sort:");
       double total6 = 0;
        for (int i=0; i<10; i++) {
            copyAB(A, B);
            //start
            long startTime = System.nanoTime(); 
            quickSort(B, 0,9163);
            //stop
            long endTime = System.nanoTime();
            double duration = (endTime - startTime)/1000000.0; //milliseconds
            //calculate and output time taken
            total6 = total6 + duration;
            System.out.println(duration);   
           } 
        System.out.println("Average:" + total6/10);
        
        
        
    } //end main
    
     public static void copyAB(String[] A, String[] B) {
        for(int i =0; i < A.length; i++) {  
       B[i] = A[i];
       }   
    }
    
   
     public static <T> void printArray(T [] A)
    {
        for (int i=0; i<A.length; i++)
            System.out.println(A[i]);
        System.out.println();
    }


     //input array method
    public static void inputArray(String[] myA) {
    File f = new File("words.txt");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        {      
        }
        for(int i =0; i < myA.length; i++) {  
       String inWord = fileInput.nextLine();
       String s = new String(inWord);
       myA[i] = s;
       }
    } 
        
//from Sorts.docx
//SELECTION SORT
public static <T extends Comparable > void selectionSort(T[] theArray, int n) {
for (int last = n-1; last >= 1; last--)
{
int largest = indexOfLargest(theArray, last+1);
T temp = theArray[largest];
theArray[largest] = theArray[last];
theArray[last] = temp;
} // end for
} // end selectionSort
private static <T extends Comparable > int indexOfLargest(T[] theArray, int size)
{
int indexSoFar = 0; // index of largest item found so far
for (int currIndex = 1; currIndex < size; ++currIndex) {
if (theArray[currIndex].compareTo(theArray[indexSoFar])>0) {
indexSoFar = currIndex;
} // end if
} // end for
return indexSoFar; // index of largest item
} // end indexOfLargest


//BUBBLE SORT
public static <T extends Comparable > void bubbleSort(T[] theArray, int n) {
boolean sorted = false; // false when swaps occur
for (int pass = 1; (pass < n) && !sorted; ++pass)
{
sorted = true; // assume sorted
for (int index = 0; index < n-pass; ++index) {
int nextIndex = index + 1;
if (theArray[index].compareTo(theArray[nextIndex]) > 0)
{
T temp = theArray[index]; // exchange items
theArray[index] = theArray[nextIndex];
theArray[nextIndex] = temp;
sorted = false; // signal exchange
} // end if
} // end for
} // end for
} // end bubbleSort


//INSERTION SORT
public static <T extends Comparable > void insertionSort(T[] theArray, int n) {
for (int unsorted = 1; unsorted < n; ++unsorted) {
T nextItem = theArray[unsorted];
int loc = unsorted;
while ((loc > 0) && (theArray[loc-1].compareTo(nextItem) > 0))
{
// shift theArray[loc-1] to the right
theArray[loc] = theArray[loc-1];
loc--;
} // end while
theArray[loc] = nextItem;
} // end for
} // end insertionSort



//MERGE SORT
public static<T extends Comparable > void mergesort(T[ ] theArray) {
// Declare temporary array used for merge, must do
// unchecked cast from Comparable<?>[] to T[]
T[] tempArray = (T[])new Comparable<?>[theArray.length];
mergesort(theArray, tempArray, 0, theArray.length - 1 );
} // end mergesort

private static<T extends Comparable > void merge(T[] theArray, T[] tempArray, int first, int mid, int last) {
int first1 = first; // beginning of first subarray
int last1 = mid; // end of first subarray
int first2 = mid + 1; // beginning of second subarray
int last2 = last; // end of second subarray
int index = first1; // next available location in tempArray
while ((first1 <= last1) && (first2 <= last2)) {
if (theArray[first1].compareTo(theArray[first2])<0) {
tempArray[index] = theArray[first1];
first1++; }
else {
tempArray[index] = theArray[first2];
first2++;
} // end if
index++;
} // end while
while (first1 <= last1) {
// Invariant: tempArray[first1..index-1] is in order
tempArray[index] = theArray[first1];
first1++;
index++;
} // end while
while (first2 <= last2) {
// Invariant: tempArray[first1..index-1] is in order
tempArray[index] = theArray[first2];
first2++;
index++;
} // end while
for (index = first; index <= last; ++index) {
theArray[index] = tempArray[index];
} // end for
} // end merge

public static <T extends Comparable > void mergesort(T[] theArray, T[] tempArray, int first, int last) {
if (first < last) {
int mid = (first + last)/2; // index of midpoint
mergesort(theArray, tempArray, first, mid);
mergesort(theArray, tempArray, mid+1, last);
merge(theArray, tempArray, first, mid, last);
} // end if
} // end mergesort


//QUICK SORT
private static <T extends Comparable > void choosePivot(T[] theArray, int first, int last) {
// ---------------------------------------------------------
// Chooses a pivot for quicksort's partition algorithm and
// swaps it with the first item in an array.
// Precondition: theArray[first..last] where first <= last.
// Postcondition: theArray[first] is the pivot.
// ---------------------------------------------------------
// Implementation left as an exercise.
} // end choosePivot

private static <T extends Comparable > int partition(T[] theArray, int first, int last) {
T tempItem;
// place pivot in theArray[first]
//choosePivot(theArray, first, last); // comment out this line
T pivot = theArray[first]; // reference pivot
// initially, everything but pivot is in unknown
int lastS1 = first; // index of last item in S1
// move one item at a time until unknown region is empty
// firstUnknown is the index of first item in unknown region
for (int firstUnknown = first + 1; firstUnknown <= last;
++firstUnknown) {
// Invariant: theArray[first+1..lastS1] < pivot
// theArray[lastS1+1..firstUnknown-1] >= pivot
// move item from unknown to proper region
if (theArray[firstUnknown].compareTo(pivot) < 0) {
// item from unknown belongs in S1
++lastS1;
tempItem = theArray[firstUnknown];
theArray[firstUnknown] = theArray[lastS1];
theArray[lastS1] = tempItem;
} // end if
// else item from unknown belongs in S2
} // end for
// place pivot in proper position and mark its location
tempItem = theArray[first];
theArray[first] = theArray[lastS1];
theArray[lastS1] = tempItem;
return lastS1;
} // end partition



public static <T extends Comparable > void quickSort(T[] theArray, int first, int last) {
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
} // end if
} // end quickSort

        
             
   
} //end class
