package h8b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class H8b {

    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //declare variables
        Random rand = new Random();
        String word = "";
        int i;
        int count = 0;
        String guess = "";        
        char userLetter;
       
        //generate random number between 1 and 4581
        int randNum = rand.nextInt(4581) + 1;
        
         
        //get input from file
         File inFile = new File("words_no_duplicates.txt");
        Scanner fileInput = null;
        try {
            fileInput = new Scanner(inFile);
        } 
            // Print out exception if the file is not found
            catch (FileNotFoundException e) {
                System.out.println(e);
        }
        
        //picks the word that matches the random number
        for (i = 1; i <= randNum; i++) { 
        word = fileInput.nextLine();
        }
         
        
        //convert word to underscores
        int length = word.length();
        for ( i = 0; i < length; ++i) {
           guess += "_";
        }
        
        //output underscores once
        System.out.println(guess);
        
   
        while (count < 10) { // start loop 1, max ten wrong guesses
            //check if player won + output
            if (guess.equals(word)) {
              System.out.println("You win!");
              break;
             }
            //player inputs guess
            System.out.println("Enter a letter:");
            userLetter = scnr.next().charAt(0);
            int k = word.indexOf(userLetter);
            //count wrong guesses
             if (k == -1) {
                count++;
             }
             else {
                 //check word for letter guessed
            for (int j = 0; j < length; j++) { // start loop2
                if (userLetter == word.charAt(j)) {
                    guess = guess.substring(0,j) + userLetter + guess.substring(j+1);             
                }     
            } //end loop2         
                  }
             //output updated guess
            System.out.println(guess);
            } //end loop1
        
        
        //output lose
          if (!guess.equals(word)) {
              System.out.println("You lose, the word was " + word);
          }
        
    }
    
}
