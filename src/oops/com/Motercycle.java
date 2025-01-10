package oops.com;

public class Motercycle extends Vehicle {
    public Motercycle(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine of the motorcycle: " + getMake() + " " + getModel());
    }

    @Override
    public String toString() {
        return "Motorcycle [make=" + getMake() + ", model=" + getModel() + "]";
    }
}

