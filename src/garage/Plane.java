package garage;

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
	public void print() {
		super.print();
//		this.getMake();
//		this.getModel();
//		this.getColour();
//		this.getProps();
		System.out.println("Props: " + this.getProps());
	}

}