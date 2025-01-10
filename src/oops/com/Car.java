package oops.com;

public class Car extends Vehicle 
{	
	public Car(String make, String model) {
		super(make, model);
	}
	
	@Override
	
	public void startEngine() {
		System.out.println("Starting the Engine Of Car" + getMake() + " " + getModel());
	}
	
	
	@Override
    public String toString() {
        return "Car [make=" + getMake() + ", model=" + getModel() + "]";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
