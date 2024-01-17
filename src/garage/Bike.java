package garage;

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
	public void print() {
		super.print();
//		System.out.println(this.getMake());
//		System.out.println(this.getModel());
//		System.out.println(this.getColour());
		System.out.println("Sidecar: " + this.getSidecar());

	}

}