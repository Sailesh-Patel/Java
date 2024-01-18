package abstraction;

import java.util.Objects;

public class Bike extends Vehicle {

	public Bike() {
		super();
	}

	public Bike(String make, String model, String colour, String sidecar) {
		super(make, model, colour);
//		setMake(make);
//		setModel(model);
//		setColour(colour);
		this.sidecar = sidecar;
	}

	private String sidecar;

	public String getSidecar() {
		return sidecar;
	}

	public void setSidecar(String sidecar) {
		this.sidecar = sidecar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sidecar);
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

		Bike other = (Bike) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.sidecar != other.getSidecar()) {
			return false;
		}
		return true;
	}

//	@Override
//	public void print() {
//	super.print();
//		System.out.println(this.getMake());
//		System.out.println(this.getModel());
//		System.out.println(this.getColour());
//		System.out.println("Sidecar: " + this.getSidecar());
//
//	}

	// Replace print() with toString

	@Override
	public String toString() {
		return "Bike [make=" + getMake() + ", Model=" + getModel() + ", Colour=" + getColour() + ", sidecar="
				+ getSidecar() + "]";
	}

	@Override
	public int calcBill() {
		return 5;
	}

}