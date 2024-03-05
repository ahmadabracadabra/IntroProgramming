
package f1;

public class Dog implements Comparable <Dog> {
    private String name;
    private String breed;
    private int age;
    private int weight;
    
    //updated constructors to include weight
    public Dog()
     { name = "";
     breed = "";
     age=0;  
     weight=0;
     }
    public Dog(String n, String b, int a, int w)
     { name = n;
     breed = b;
     age=a;  
     weight=w;
     }
    
    public String getName()
    {
        return name;
        
    }
    public String getBreed()
    {
        return breed;
        
    }
    public int getAge()
    {
        return age;
        
    }
    
    // get dog weight
    public int getWeight()
    {
        return weight;
   
    }
    
    public void setName(String n)
    {
        name=n;
    }
    public void setBreed(String b)
    {
        breed=b;
    }
    public void setAge(int a)
    {
        age=a;
    }
    
    //set dog weight
    public void setWeight(int w)
    {
        weight=w;
    }
    
    //updated toString to include weight
    public String toString()
    {
        return name + " is a " + age + " year old " + breed + " that weighs " + weight + " pounds.";
    }
    
    //compare dog weight
    public int compareTo(Dog d) {
        if (this.weight > d.weight) {
        return 1;
        }
        else if(this.weight < d.weight) {
        return -1;
        }
        else {
        return 0;
        }
    }
            
}
