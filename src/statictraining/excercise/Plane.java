package statictraining.excercise;

import java.util.Objects;

import interfaces.Vehicle;

public class Plane extends Vehicle {

	public Plane() {
		super();
	}

	public Plane(String make, String model, String colour, String props) {
		super(make, model, colour);
//		setMake(make);
//		setModel(model);
//		setColour(colour);
		this.props = props;
	}

	private String props;

	public String getProps() {
		return props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	@Override
	public int hashCode() {
		return Objects.hash(props);
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

		Plane other = (Plane) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.props != other.getProps()) {
			return false;
		}
		return true;
	}

//	@Override
//	public void print() {
//	super.print();
//		this.getMake();
//		this.getModel();
//		this.getColour();
//		this.getProps();
//		System.out.println("Props: " + this.getProps());
//	}

	// Replace print() with toString

	@Override
	public String toString() {
		return "Plane [make=" + getMake() + ", Model=" + getModel() + ", Colour=" + getColour() + ", Id=" + getId()
				+ ", props=" + getProps() + "]";
	}

	@Override
	public int calcBill() {
		return 20;
	}

}