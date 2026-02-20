/*  Write a java program to calculate the area of a rectangle, a square and a circle.
 Create an abstract class 'Shape' with three abstract methods namely rectangleArea() taking
 two parameters, squareArea() and circleArea() taking one parameter each.
Now create another class ‘Area’ containing all the three methods rectangleArea(),squareArea() and
circleArea() for printing the area of rectangle, square and circle respectively. Create an
object of class Area and call all the three methods.
(Use Runtime Polymorphism) */



// Abstract class Shape
abstract class Shape {
    // Abstract methods
    abstract void rectangleArea(double length, double width);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}

// Concrete class Area extends Shape
class Area extends Shape {
    // Implementation of rectangle area
    @Override
    void rectangleArea(double length, double width) {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }

    // Implementation of square area
    @Override
    void squareArea(double side) {
        double area = side * side;
        System.out.println("Square Area: " + area);
    }

    // Implementation of circle area
    @Override
    void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

// Main class
public class Que11 {
    public static void main(String[] args) {
        // Runtime polymorphism: reference of Shape, object of Area
        Shape shape = new Area();

        // Call the methods
        shape.rectangleArea(5, 10);   // Rectangle with length=5, width=10
        shape.squareArea(7);          // Square with side=7
        shape.circleArea(3);          // Circle with radius=3
    }
}



