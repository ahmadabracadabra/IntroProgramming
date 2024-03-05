
package H9;


public class Graduate extends Student {
    
    private String degree;
    private boolean thesis;
    
    //constructors
    public Graduate() {
      super();
      degree = "";
      thesis = false;
    }
    
    public Graduate(String n, int sn, String d, boolean t) {
        super(n, sn);
        degree = d;
        thesis = t;
    }
    
    
    //setter and getter
    public String getDegree() {
        return degree;
    }

   
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
   
    public boolean isThesis() {
        return thesis;
    }

    public void setThesis(boolean thesis) {
        this.thesis = thesis;
    }
    
    
     public void writeOutput() {
        super.writeOutput();
        System.out.println( "Degree: " + degree);
        System.out.println( "Thesis Completed: " + thesis);
    }
    
}
