package CreationalP.Factory.shape;

public class FactoryDriver {

    public static void main(String[] args) {
    
       //get an object of Circle and call its draw method.
       Ishape shape1 = ShapeFactory.getShape("CIRCLE");
 
       //call draw method of Circle
       shape1.draw();
 
       //get an object of Rectangle and call its draw method.
       Ishape shape2 = ShapeFactory.getShape("RECTANGLE");
 
       //call draw method of Rectangle
       shape2.draw();
 
       //get an object of Square and call its draw method.
       Ishape shape3 = ShapeFactory.getShape("SQUARE");
 
       //call draw method of circle
       shape3.draw();
    }
 }