package l17a;
//NAME: Ahmad Abraham

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
This program times how long it takes to sort an 
array of strings using selectionSort
*/
public class L17a {

    
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

    //selection sort template method
     public static <T extends Comparable> void selectionSort(T [] A, int n)
    { for (int i=0; i<A.length-1; i++)
    { int smallest = i;
       for (int j=i+1; j<=A.length-1; j++)
        {  
            if(A[j].compareTo(A[smallest])<0)
                    smallest = j;
        }
       T temp=A[i];
       A[i]= A[smallest];
       A[smallest]=temp;
       
    } 
    
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

   

   
} //end class
