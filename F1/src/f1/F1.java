//NAME: Ahmad Abraham
package f1;


public class F1 {

    public static void main(String[] args) {
        //dogs used
        Dog d1 = new Dog("Tubby", "Pitbull", 3 ,50);
        Dog d2 = new Dog("Ozemp", "Poodle", 4, 44);
        
        //comparing dog weights/sizes
        if(d1.compareTo(d2) > 0) {
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d1.getName() + " is LARGER than " + d2.getName());     
        }
        else if (d1.compareTo(d2) < 0) {
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d1.getName() + " is SMALLER than " + d2.getName());   
        }
        else {
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d1.getName() + " is the SAME SIZE as " + d2.getName());   
        }
        
    } // end main
} // end class
     
