
package inheritancedemo;

//NAME: Ahmad Abraham
//person class, sets and gets name, compares names

public class Person {
    //attribute
    protected String name;
    
    //constructors
    public Person() {
    name = "null";
    }
    
    public Person(String n) {
     name = n;
    }   
    
    //accessors and mutators
    public void setName(String userName) {
      name = userName;
   }

   public String getName() {
      return name;
   }
   
   //check if two person objects have same name
   public boolean hasSameName(Person p) {
      return this.name.equals(p.name);
   }
   
   //output
   public void WriteOutput()
    {
        System.out.println( "Name: " + name);
    }
   
}

