//NAME: Ahmad Abraham
package l11;

public class Faculty extends Employee {
    //atrributes
    //wants all attributes to be protected
    protected String title;
    
    //constructors
    public Faculty() {
      super();
      title = "null";
    }
    
    public Faculty(String n, double sal, int hd, int id, String d, String t) {
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
    
    //output
    public void WriteOutput() {
        super.WriteOutput();
        System.out.println( "Title: " + title);
    }
    
} // end class
