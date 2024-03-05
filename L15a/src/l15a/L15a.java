package l15a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

//NAME: Ahmad Abraham
//This program generates a random number to pick a word from the file and output it

public class L15a {

    public static void main(String[] args) {
        //declare variables
        Random rand = new Random();
        String word = "";
        
       
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
        for (int i = 1; i <= randNum; i++) { 
        word = fileInput.nextLine();
        }
        
        //output
          System.out.println(word);
          System.out.println(randNum);
        
    } //end main
    
} //end class
