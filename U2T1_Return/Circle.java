package U2T1_Return;

public class Circle{
    private static final String MATH = null;
    private double radius;

    //constructor 
    public Circle(double r){
        radius = r;
    }

    public double calcArea(){
        double area = Math.PI * radius * radius;
        //System.out.println("The circle with a radius "+radius+" has an area of "+area);

        return area;
    }


}    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//     private double radius;

//     //constructor
//     public Circle(double rad){
//         radius = rad;
//     }//method to print area 
//     public void printArea(){
//         double area = Math.PI * radius * radius;
//         System.out.println("A circle with radius " + radius + " has an area of " + area);
//     }
// }