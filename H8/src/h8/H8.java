
//NAME: Ahmad Abraham
//This program allows the user to play hangman.

package h8;

import java.util.Scanner;

public class H8 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //declare and initalize variables
        int i;
        int count = 0;
        String word;
        String guess = "";
        char userLetter;
        
        //user enters word to guess
        System.out.println("Enter a word:");
        word = scnr.next();
        int length = word.length();
        
        //convert word to underscores
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
          
        
        } //end main  
    } //end class
    

