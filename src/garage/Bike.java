package garage;

public class Bike extends Vehicle {

	public Bike() {
	}

	public Bike(String make, String model, String colour, String sidecar) {
		setMake(make);
		setModel(model);
		setColour(colour);
		this.sidecar = sidecar;
	}

	private String sidecar;

	public String getSidecare() {
		return sidecar;
	}

	public void setSidecare(String sidecar) {
		this.sidecar = sidecar;
	}
}