package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 3);
        System.out.println("Are: " + box1.getArea());
        System.out.println("Perimeter: " + box1.getPerimeter());


        Rectangle box2 = new Square(5);
        System.out.println("Are: " + box2.getArea());
        System.out.println("Perimeter: " + box2.getPerimeter());
    }
}
