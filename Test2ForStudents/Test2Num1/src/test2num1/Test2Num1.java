/*
Create a Book class with attributes author(String), title (String), and price (String). 
Make sure you create ALL modifiers and accessors, and a toString that will print the author, the title, and the price. 
Create a compareTo that will compare according to the author's name.

You have been given an input file called book.txt 
In the input file there are three lines for each book 
The author is on the first line, the title on the second line, 
and the price on the third line.

Write a program to create an array that will hold a maximum of TEN Book objects,
this means your array is of length 10. 
Get input from the file,create Book objects and put them into the array. 
Output the array IN REVERSE. 
 
Note: You have been given two input files. You don't know which one we shall use for grading.
Verify your program works with both by just altering the name of the file in your try/catch.
 */
package test2num1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2Num1 {

    public static void main(String[] args) {
        Scanner fileInput=null;
        File f = new File("book.txt");
        try
        {
         fileInput = new Scanner(f);
        }
        catch (FileNotFoundException e){
            
        }
        
        //declared array and variables
        Book[] myB = new Book[10];
        String inAuthor;
        String inTitle;
        String inPrice;
        
  
        //get input from file
        int counter =0;
         while(fileInput.hasNext()) {
            inAuthor = fileInput.nextLine();
            inTitle = fileInput.nextLine();
            inPrice = fileInput.nextLine();
         Book b = new Book(inAuthor,inTitle,inPrice);
        counter++;
        myB[counter] = b;
        }
        
   
       //reverse output
        for(int k = 9; k >= 0; k--) {
            if(myB[k] != null) {
            System.out.println(myB[k]);
            }
        } 
        
    
}//main
}//class
