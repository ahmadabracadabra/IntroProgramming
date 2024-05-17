
package h15;


public class Rectangle implements Comparable<Rectangle>{
        private double length, width;
        
        //constructors
        public Rectangle() {
            length = 0; 
            width = 0;
        }
        
        public Rectangle(double l, double w) {
           length = l;
           width = w;
        }
        
        //get length from main
        public double getLength() {
           return length;
        }
        
        //set length from main input
        public void setLength(double l) {
           length = l;
        }
        
        //get width from main
        public double getWidth() {
           return width;
        }
        
         //set width from main input
        public void setWidth(double w) {
           width = w;
        }
        
        //calculate area
        public double area() {
           return length * width;
        }
        
        //calculate perimeter
        public double perimeter() {
           return (length * 2.0) + (width * 2.0);
        }
        
         public int compareTo(Rectangle r) {
             double r1 = this.length * this.width;
             double r2 = r.length * r.width; 
             if(r1 > r2) {
             return 1;
             }
             else if(r1 < r2) {
              return -1;
             }
             else {
                 return 0;
             }
         }
        
        //output
        public String toString () {
        return "Length: " + length + "  Width: " + width;
        }
    
}
