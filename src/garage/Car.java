package garage;

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
	public void print() {
		super.print();
//		this.getMake();
//		this.getModel();
//		this.getColour();
//		this.getBootsize();
		System.out.println("Bootsize: " + this.getBootsize());
	}

}