/*
 * Driver to test the new and improved FeetInches class
 */
package L4;

import java.util.Scanner;
public class L4 {  
   
    public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);
        //get first FeetInches object
       System.out.println("Enter the number of feet as a whole number");
       int feet1 = keyboard.nextInt();
       System.out.println("Enter the number of inches as a whole number");
       int inch1 = keyboard.nextInt();
       FeetInches f = new FeetInches(feet1, inch1);
       System.out.println(f);
        //get integer to multiply and divide
       System.out.println("Enter an integer");
       int num = keyboard.nextInt();
       //multiply
       FeetInches m= f.multiply(num);
       System.out.print(f  + " multiplied by " + num + " is ");
       System.out.println(m);
       //.divide
       FeetInches d= f.divide(num);
       System.out.print(f  + " divided by " + num + " is ");
       System.out.println(d);
       //get second FeetInches object
       System.out.println("Enter the number of feet as a whole number");
        int feet2 = keyboard.nextInt();
        System.out.println("Enter the number of inches as a whole number");
        int inch2 = keyboard.nextInt();
        FeetInches g = new FeetInches(feet2, inch2);
        //add
        FeetInches a = f.add(g);
        System.out.println(f + " plus " + g + " is " + a);
        //subtract
        FeetInches s = f.subtract(g);
        System.out.println(f + " minus " + g + " is " + s);
        
        
    }
    
}
