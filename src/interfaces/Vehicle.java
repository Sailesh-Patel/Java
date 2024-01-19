package interfaces;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

	private String make;

	private String model;

	private String colour;

	private Object name;

	private int id;

	private static int count = 1;

	public Vehicle(int id) {
		super();
		this.id = id;
	}

	public Vehicle() {
		super();
	}

	public Vehicle(String make, String model, String colour) {
		super();
		setMake(make);
		setModel(model);
		setColour(colour);
		setId(count++);
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	public abstract int calcBill();

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", colour=" + colour + ", id=" + id + "]";
	}

	// To compare by ID

//	@Override
//	public int compareTo(Vehicle o) {
//		if (id < o.getId()) {
//			return +1;
//		}
//		if (id > o.getId()) {
//			return -1;
//		} else {
//			return 0;
//		}

	// To compare by make in reverse order

//	@Override
//	public int compareTo(Vehicle o) {
//		return this.make.compareTo(o.make) * -1;
//	}

	// *-1 will reverse order

	// To compare by colour

	@Override
	public int compareTo(Vehicle o) {
		return this.colour.compareTo(o.colour);
	}

}
