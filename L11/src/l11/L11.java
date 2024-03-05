
package l11;

public class L11 {

    public static void main(String[] args) {
        
        Faculty myF = new Faculty();
        myF.setName("Ahmad");
        myF.setSalary(67850.54);
        myF.setHireDate(2024);
        myF.setDepartment("CompSci");
        myF.setID(567);
        myF.setTitle("Student");
        
        myF.WriteOutput();
        Faculty myO = new Faculty("Hi", 4747.5, 2039, 456, "Hem", "Erm");
        myO.WriteOutput();
        System.out.println("");
        
        
        Staff myS = new Staff();
        myS.setName("Abraham");
        myS.setSalary(34063.67);
        myS.setHireDate(2022);
        myS.setID(123);
        myS.setDepartment("Humanity");  
        myS.setPaygrade(5);
   
    
        myS.WriteOutput();
        System.out.println("");
        Staff myR = new Staff("Hi", 4747.5, 2039, 456, "Hem", 20);
        myR.WriteOutput();
    } // end class
} // end main
