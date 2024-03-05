package l12c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 
public class L12c {

    
    public static void main(String[] args) {
        String s;
        File inFile = new File("words2.txt");
        Scanner fileInput = null;
        
        try {
            fileInput = new Scanner(inFile);
        }
        
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
       
        while (fileInput.hasNext()){
         s = fileInput.nextLine();
         System.out.println(s);
        }
        
        
        
         } //end main
        } 
        
    
    

