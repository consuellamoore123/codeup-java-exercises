package Shapes;


public class Rectangle {
    protected int length;
    protected int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(5, 3);
        int area = rectangle.getArea();
        int perimeter = rectangle.getPerimeter();


        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}






