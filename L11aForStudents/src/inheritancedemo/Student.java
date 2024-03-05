
package inheritancedemo;
//NAME:Ahmad Abraham
//student class derived from person class
class Student extends Person implements Comparable<Student> {
    //attribute
    //protected since student is superclass to undergraduate
    protected int studentNumber;
    
    //constructors
    public Student() {
     super();
     studentNumber = 0;
    }
    
    public Student(String n, int sn) {
        super(n);
        studentNumber = sn;
    }
    
    //accessors and mutators
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    //checks if two students have same ID
    public boolean sameStudent(Student s) {
       return this.studentNumber == s.studentNumber;
   }
    
    //compare studentID numbers
     public int compareTo(Student s) {
      int s1 = this.studentNumber;
      int s2 = s.studentNumber;
         if(s1 > s2) {
       return 1;
       } 
       else if(s1 < s2) {
       return -1;
       } 
       else {
           return 0;
       }
    } 
    
    
    //output
     public void WriteOutput() {
        super.WriteOutput();
        System.out.println("Student ID: " + studentNumber);
    }
    
}
