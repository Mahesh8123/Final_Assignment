package oops.com;

public class Vehicle {
	private String make;
	private String model;
	
	
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
	}

	
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	public void startEngine() {
		System.out.println("Starting The Engine of a Generic Vehicle");
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
