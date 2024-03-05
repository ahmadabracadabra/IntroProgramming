
package h8e;

public class Camera extends Equipment {
    //attributes
    protected int pixels;
    
    //constructors
    public Camera() {
        super();
        pixels = 0;
    }
    
    public Camera(double w, double c, double pu, String m, int pix) {
        super(w,c,pu,m);
        pixels = pix;
    }
    
    //accessor and mutator
    public int getPixels() {
        return pixels;
    }

    
    public void setPixels(int pixels) {
        this.pixels = pixels;
    }
    
    //output
    public void WriteOutput() {
        super.WriteOutput();
        System.out.println("Pixels:" + pixels);
    }
    
}
