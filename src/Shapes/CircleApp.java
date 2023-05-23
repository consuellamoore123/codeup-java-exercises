package Shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());

        scanner.close();
    }
}

