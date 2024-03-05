package h3;

//NAME: Ahmad Abraham
/* In this program, you roll 2 dice. If the total is exactly 7 you win. 
If it is 11 you lose. Anything else, you keep rerolling until win or lose.
*/

public class H3 {

    public static void main(String[] args) {
        //two die objects created
        Die d1 = new Die();
        Die d2 = new Die();
        
        int total = 0;
        while(total != 7 || total != 11){
         //roll dice
         d1.roll();
         d2.roll();
         
         //save die value into variables
         int num1 = d1.getFace();
         int num2 = d2.getFace();
         
         //store sum of die values
         total = num1 + num2;
         
         //check for win or lose and output the die values
         if(total == 7) {
             System.out.println(d1 + " + " + d2 + " = " + total);
             System.out.println("You win!");
             break;
         }
         if(total == 11) {
             System.out.println(d1 + " + " + d2 + " = " + total);
             System.out.println("You lose!");
             break;
         }
         
         //output history of retrys/tester
         System.out.println(d1 + " + " + d2 + " = " + total);
         
        } // end while
     
        
    } // end main 
} // end class
