package h12;
//NAME: Ahmad Abraham
/*
This program reads several lines from the palin.txt file and for
each line, it check (recursively) whether it is a palindrome. 
If it is a palindrome it outputs the original string preceded by an integer. 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class H12 {
    public static void main(String[] args) {
       
        //read input from file
         File f = new File("palin.txt");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        { 
        }
        
        
        //declarations
        int counter = 0;
        String inputPal=fileInput.nextLine();
        
        
        //while loop 
        while(fileInput.hasNext()) {
        //inputPal made lowercase, removeWS called, then palindrome called
        if(palindrome(removeWS(inputPal.toLowerCase()))) {
            //counter keeps track of preceding integer
            counter++;
            System.out.println(counter + ": " + inputPal);
        }
        inputPal=fileInput.nextLine();
        } //end while loop
        
        
        
    } //end main
    
    
    
  //remove whitespace + puncuation
 public static String removeWS(String a)
 { 
  if(a.length() == 0) {
     return a;
  }
   Character ch = (Character) a.charAt(0);
   //only letters and digits returned
    if(Character.isLetterOrDigit(ch)) {
       return ch + removeWS(a.substring(1));
    }
   else {
      return removeWS(a.substring(1));
   }
   
 }
 
 //check if string is palindrome
  public static boolean palindrome(String p) {
  if((p.length() == 1) || (p.length() == 0)) {
   return true;
  }
  //check if first and last character are the same
	char first = p.charAt(0);
	char last = p.charAt(p.length() - 1);
	if(first == last) {
	   return palindrome(p.substring(1,p.length()-1));
	}
	else {
	   return false;
	}
  }
 
} // end class

