/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp21transportfamily;

/**
 * Demo of key inheritance concepts of 
 * using super() to invoke superclass constructors
 * Overriding key methods like toString()
 * And Casting
 * @author edith
 */
public class SuperTest {
    public static void main(String[] args) {
        
//        Shape shape1 = new Shape("Chartruse");
//        System.out.println(shape1);
//        
        // assiging a Circle object to a variable typed to superclass
        // NOTE: shape2 has an explicit type of Shape, but an actual
        // type of Circle
        Shape shape2 = new Circle("Periwinkle", 34);
        System.out.println(shape2);
        
        
        // we can type cast to bring the shape2 into actual type land 
        Circle cir = (Circle) shape2;
        System.out.println(cir);

        Shape shape3 = new Triangle("Eggshell");
        
        
        
        
        // demo of casting
        if(shape3 instanceof Circle){
            Circle cir2 = (Circle) shape3;
            
        } else {
            System.out.println("SHAPE 3 NOT A CIRCLE");
        }
        
        calculateCircleArea(cir);
    }
    
    private static void calculateCircleArea(Circle c){
        double area = 3.1415923 * c.radius * c.radius;
        System.out.println("Area of circle: " + area);
    }
    
    
} // close class Supertest


/**
 * General instance; superclass
 * @author edith
 */
class Shape{
    String color;
    
    /**
     * Constructor
     */
    public Shape(String c){
        System.out.println("In constructor for Shape!");
        // make each shape have a color
        System.out.println("Setting shape color: " + c);
        this.color = c;
        
    } // end superclass constructor
    
    @Override
    public String toString(){
        return "I'm a shape. I have color: " + color;
    }
    
}

class Circle extends Shape{
    double radius;
    // constructor of Circle
    public Circle(String col, double r){
        
        // calls to the parent's constructor
        // using super MUST happen first in a subclass constror
        // passing inputted String col into the
        // superclass's constructor, i.e. Shape(String c)
        super(col);
        
        System.out.println("Continuing in Circle's constructor, setting radius to " + r);
        this.radius = r;
        
    } // end Circle consturctor
    
    @Override
    public String toString(){
        return "I'm a circle. I have radius: " + radius;
       
    }
    
}

class Triangle extends Shape{
    double angleA;
    double angleB;
    double angleC;
    
    public Triangle(String col){
        // invoke parent's constructor
        super(col);
        System.out.println("Contining in Trinagle's constructor");
        
        
    }
}
