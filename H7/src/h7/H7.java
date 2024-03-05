
package h7;

import java.util.Scanner;
public class H7 {

    public static void main(String[] args) {
        
Scanner key = new Scanner(System.in);
int F;
double C;
System.out.println("Enter a temperature in degrees Fahrenheit: ");
F=key.nextInt();
C=5*(F-32)/9.0;
System.out.println(F + " degrees Fahrenheit is " + C + " degrees Celsius.");

}

    }
    

