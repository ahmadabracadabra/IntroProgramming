/*
Create a Book class with attributes author(String), title (String), and price (String). 
Make sure you create ALL modifiers and accessors, and a toString that will print the author, the title, and the price. 
Create a compareTo that will compare according to the title.

You have been given an input file called book.txt 
In the input file there are three lines for each book 
The author is on the first line, the title on the second line, 
and the price on the third line.
Write a program to create an arrayList that will hold Book objects, 
Get input from the file,create Book objects and put them into the arrayList. 
Output the arrayList IN REVERSE. 
Then call Collections sort. 
Output the arrayList again, this time NOT in reverse. 
Note: You have been given two input files. You don't know which one we shall use for grading.
Verify your program works with both by just altering the name of the file in your try/catch.
 */
package test2num2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Test2Num2 {

    
    public static void main(String[] args) {
        Scanner fileInput=null;
        File f = new File("book.txt");
        try
        {
         fileInput = new Scanner(f);
        }
        catch (FileNotFoundException e){
            
        }
         
        //declare arraylist
        ArrayList<Book> myB = new ArrayList<Book>();
       
        //declared variables
        String inAuthor;
        String inTitle;
        String inPrice;
        
       int counter = -1;
        //get input from file
        while(fileInput.hasNext()) {
            inAuthor = fileInput.nextLine();
            inTitle = fileInput.nextLine();
            inPrice = fileInput.nextLine();
       Book b = new Book(inAuthor,inTitle,inPrice);
       myB.add(b); 
       counter++;
        }
        
        //output in reverse
        for(int k = counter; k >= 0; k--) {
            System.out.println(myB.get(k));
        }
        
        //seperate output for readability
        System.out.println();
        
        //sort list
        Collections.sort(myB);
        
        //output list
        for(Book bo: myB) {
             System.out.println(bo);
         }
        
    }//main  
}//class
