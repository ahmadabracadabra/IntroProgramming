package h6;


public class Circle {
      private double radius;
      
        //constructors
        public Circle()
        {
            radius=0;
        }
        public Circle(double r)
        {
            radius=r;
        }
        
        //get radius from main
        public double getRadius()
        {
            return radius;
        }
        
        //set radius in class
        public void setRadius(double r)
        {
            radius = r;
        }
        
        //calculate area
        public double area()
        {
            return Math.PI * radius * radius;
        }
        
        public String toString () {
        return "Radius: " + radius;
        }
        
}
