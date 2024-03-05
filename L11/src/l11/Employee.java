package l11;
//NAME: Ahmad Abraham
//employee class derived from person class
public class Employee extends Person {
    //attributes
    protected double salary;
    protected int hireDate;
    protected int ID;
    protected String department;
    
    //constructors
    public Employee(){
     super();
     salary = 0;
     hireDate = 0;
     ID = 0;
     department = "null";
    }
    
    public Employee(String n, double sal, int hd, int id, String d){
     super(n);
     salary = sal;
     hireDate = hd;
     ID = id;
     department = d;
    }

    
    //accessors and mutators (refactor > encapsulate fields)
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public int getHireDate() {
        return hireDate;
    }

   
    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    
    public int getID() {
        return ID;
    }

   
    public void setID(int ID) {
        this.ID = ID;
    }

   
    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }
    
    //checks if two employees have same ID
    public boolean hasSameID(Employee e) {
       return this.ID == e.ID;
   }
    
    //output
    public void WriteOutput()
    {
        super.WriteOutput();
        System.out.println( "Salary: " + salary);
        System.out.println( "Hire Date: " + hireDate);
        System.out.println( "ID: " + ID);
        System.out.println( "Department: " + department);
    }
    
}
