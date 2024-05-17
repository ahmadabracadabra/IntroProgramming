package h17;


public class Circle implements Comparable<Circle>{
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
        
        
         public int compareTo(Circle c) {
             double c1 = this.radius;
             double c2 = c.radius; 
             if(c1 > c2) {
             return 1;
             }
             else if(c1 < c2) {
              return -1;
             }
             else {
                 return 0;
             }
         }
        
        
        
        public String toString () {
        return "Radius: " + radius;
        }
        
}
