package objects;

import java.util.Objects;

public class Vehicle {

	private String make;

	private String model;

	private String colour;

	private Object name;

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

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Vehicle other = (Vehicle) obj;
		return make == other.make && Objects.equals(model, other.model) && Objects.equals(colour, other.colour)
				&& Objects.equals(name, other.name);
	}

//	public void print() {
//		System.out.println("Make: " + make);
//		System.out.println("Model: " + model);
//		System.out.println("Colour: " + colour);
//	}

	// Replace print() with toString
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", colour=" + colour + "]";
	}

}
