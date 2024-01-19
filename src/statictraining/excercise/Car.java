package statictraining.excercise;

import java.util.Objects;

import interfaces.Vehicle;

public class Car extends Vehicle {

	public Car() {
		super();
	}

	public Car(String make, String model, String colour, String bootsize) {
		super(make, model, colour);
//		setMake(make);
//		setModel(model);
//		setColour(colour);
		this.bootsize = bootsize;
	}

	private String bootsize;

	public String getBootsize() {
		return bootsize;
	}

	public void setBootsize(String bootsize) {
		this.bootsize = bootsize;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bootsize);
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

		Car other = (Car) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.bootsize != other.getBootsize()) {
			return false;
		}
		return true;

	}

	@Override
	public int calcBill() {
		return 10;
	}

//	@Override
//	public void print() {
//		super.print();
//		this.getMake();
//		this.getModel();
//		this.getColour();
//		this.getBootsize();
//		System.out.println("Bootsize: " + this.getBootsize());
//	}

	// Replace print() with toString

	@Override
	public String toString() {
		return "Car [make=" + getMake() + ", Model=" + getModel() + ", Colour=" + getColour() + ", Id=" + getId()
				+ ", bootsize=" + getBootsize() + "]";
	}

}