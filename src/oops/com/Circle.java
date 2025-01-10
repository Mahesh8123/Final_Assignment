package oops.com;

public class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", area=" + calculateArea() + "]";
    }
}
