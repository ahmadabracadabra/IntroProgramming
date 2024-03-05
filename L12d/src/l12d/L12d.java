package l12d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L12d {

    
    public static void main(String[] args) {
     
        File inFile = new File("palin.txt");
        Scanner fileInput = null;
        
        try {
            fileInput = new Scanner(inFile);
        }
        
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
              
        
    String userInput = "";
    //get input
    System.out.println("Enter a phrase");
   
    while (fileInput.hasNext()){
         userInput = fileInput.nextLine();
         
     
    //output the original phrase
    System.out.print("\"" + userInput + "\"");
    
    //make lower case
    userInput = userInput.toLowerCase();
    
    //eliminate punctuation
    String word1= "";
    int length = userInput.length();
  //use a loop to create word1, which is your original phrase without punctuation
    for (int i = length - 1; i >= 0; --i) {
          if ((userInput.charAt(i) >= 'a') && (userInput.charAt(i) <= 'z')) {
             word1 = word1 + userInput.charAt(i);
          }
    }
   

   //word1 is now the original phrase without punctuation. 
   //create word2, which is word1 backwards
   String word2 = "";
    for (int i = word1.length() - 1; i >= 0; i--) {
       word2 = word2 + word1.charAt(i) ;
    }
    
        
     if( word2.equals(word1))
      System.out.println(" is a palindrome");
      else
     System.out.println(" is not a palindrome");
    
    }
    }
}
