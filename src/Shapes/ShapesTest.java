// ShapesTest.java
import shapes.Measurable;
import shapes.Square;
import shapes.Rectangle;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        // Create a rectangle
        myShape = new Rectangle(5, 10);
        System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());
        System.out.println("Rectangle Area: " + myShape.getArea());

        // Create a square
        myShape = new Square(7);
        System.out.println("Square Perimeter: " + myShape.getPerimeter());
        System.out.println("Square Area: " + myShape.getArea());
    }
}


//        Rectangle box1 = new Rectangle(5, 3);
//        System.out.println("Are: " + box1.getArea());
//        System.out.println("Perimeter: " + box1.getPerimeter());
//
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Are: " + box2.getArea());
//        System.out.println("Perimeter: " + box2.getPerimeter());
//    }
//}
