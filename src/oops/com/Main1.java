package oops.com;

public class Main1 {
    public static void main(String[] args) {
        // Circle example
        Circle circle = new Circle(5.0);
        circle.displayShapeInfo();  // Output includes radius and area

        System.out.println();

        // Rectangle example
        Rectangle rectangle = new Rectangle(4.0, 7.0);
        rectangle.displayShapeInfo();  // Output includes length, width, and area
    }
}
