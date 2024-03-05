package inheritancedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//NAME:Ahmad Abraham

public class InheritanceDemo {

    public static void main(String[] args) {
       File inFile = new File("student.in");
          Scanner  fileInput = null;
        try {
          fileInput = new Scanner(inFile);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        }
        //input student into an ArrayList
        ArrayList<Student> myList = new ArrayList<Student>();
        while(fileInput.hasNext())
                { int id=fileInput.nextInt();
                  String name=fileInput.nextLine();
                  Student s=new Student(name, id);
                  myList.add(s);
                    
                }
          System.out.println();
        System.out.println("Students not sorted");
        for(int i=0; i<myList.size(); i++)
        {
            myList.get(i).WriteOutput();
        }
        
        Collections.sort(myList);
          System.out.println();
         System.out.println("Students sorted");
         
        for(int i=0; i<myList.size(); i++)
        {
            myList.get(i).WriteOutput();
        }
        fileInput.close();
        
          inFile = new File("undergrad.in");
         
        try {
          fileInput = new Scanner(inFile);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        }
        //input student into an ArrayList
        ArrayList<Undergraduate> myL = new ArrayList<Undergraduate>();
        while(fileInput.hasNext())
                { int id=fileInput.nextInt();
                int level = fileInput.nextInt();
                  String name=fileInput.nextLine();
                  Undergraduate u=new Undergraduate(name, id, level);
                  myL.add(u);
                    
                }
          System.out.println();
         System.out.println("Undergrads not sorted");
         
        for(int i=0; i<myL.size(); i++)
        {
            myL.get(i).WriteOutput();
        }
        
        Collections.sort(myL);
         System.out.println();
         
        System.out.println("Undergrads sorted");
        for(int i=0; i<myL.size(); i++)
        {
            myL.get(i).WriteOutput();
        }
        fileInput.close();
        
    }
      
}
