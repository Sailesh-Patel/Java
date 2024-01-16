package garage;

public class Car extends Vehicle {

	public Car() {
	}

	public Car(String make, String model, String colour, String bootsize) {
		setMake(make);
		setModel(model);
		setColour(colour);
		this.bootsize = bootsize;
	}

	private String bootsize;

	public String getBootsize() {
		return bootsize;
	}

	public void setBootsize(String bootsize) {
		this.bootsize = bootsize;
	}

}
