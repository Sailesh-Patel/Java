package garage;

public class Vehicle {

	private String make;

	private String model;

	private String colour;

	public Vehicle() {
		super();
	}

	public Vehicle(String make, String model, String colour) {
		super();
		setMake(make);
		setModel(model);
		setColour(colour);
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void print() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Colour: " + colour);
	}

}