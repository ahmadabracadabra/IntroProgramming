
package H9;
//NAME:Ahmad Abraham
//undergraduate class derived from student class
class Undergraduate extends Student {
    private int Level;
    
    //constructors
    public Undergraduate() {
        super();
        Level = 0;
    }
    
    public Undergraduate(String n, int sn, int l) {
        super(n,sn);
        Level = l;
    }
    
    //accessors and mutators
    public int getLevel() {
        return Level;
    }

 
    public void setLevel(int Level) {
        this.Level = Level;
    }
    
     //output
     public void writeOutput() {
        super.writeOutput();
        System.out.println("Level: " + Level);
    }
     
}
