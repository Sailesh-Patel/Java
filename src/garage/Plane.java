package garage;

public class Plane extends Vehicle {

	public Plane() {
	}

	public Plane(String make, String model, String colour, String props) {
		setMake(make);
		setModel(model);
		setColour(colour);
		this.props = props;
	}

	private String props;

	public String getProps() {
		return props;
	}

	public void setProps(String props) {
		this.props = props;
	}
}