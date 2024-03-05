//NAME: Ahmad Abraham
package H9;

public class Faculty extends Employee implements Comparable<Faculty>{
    //atrributes
    private String title;
    
    //constructors
    public Faculty() {
      super();
      title = "null";
    }
    
    public Faculty(String t, String n, double sal, int hd, int id, String d) {
      super(n,sal,hd,id,d);
      title = t;
    }
    
    //accessors and mutators
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    //sort by department
     public int compareTo(Faculty f) {
        String f1 = this.department;
        String f2 = f.department;
        int minLen = Math.min(f1.length(), f2.length());

     for (int i = 0; i < minLen; i++) {
        if (f1.charAt(i) != f2.charAt(i)) {
            return f1.charAt(i) - f2.charAt(i);
        }
     }
       return f1.length() - f2.length();
    } 
    
    
    //output
    public void writeOutput() {
        super.writeOutput();
        System.out.println( "Title: " + title);
    }
    
} // end class
