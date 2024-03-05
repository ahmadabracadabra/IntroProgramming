package l4a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L4a {

    public static void main(String[] args) {
        
        File f = new File("circles.in");
        Scanner  fileInput = null;
        try{
            fileInput = new Scanner(f);
            
        }
        catch (FileNotFoundException ex)
        { 
        }
        
        double input = fileInput.nextDouble();
        double sum = 0;
       // System.out.println(input);    
       
       while(fileInput.hasNext()) { 
         input=fileInput.nextDouble();
         sum = sum + input;
         System.out.println(input);
        }
        
        System.out.println("The sum is: " +sum);
       
       
    } // end main
    
} // end class
