package oops.com;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla");
        Vehicle motorcycle = new Motercycle("Yamaha", "MT-09");

        // Demonstrating polymorphism
        car.startEngine();
        motorcycle.startEngine();

        // Using toString to display details
        System.out.println(car);  // Output: Car [make=Toyota, model=Corolla]
        System.out.println(motorcycle);  // Output: Motorcycle [make=Yamaha, model=MT-09]
    }
}

