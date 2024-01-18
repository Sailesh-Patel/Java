package abstraction;

import java.util.ArrayList;
import java.util.Objects;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Garage(String name) {
		super();
	}

//	public ArrayList<Vehicle> getVehicles() {
//		return vehicles;
//	}
//	
//	public void setVehicles(ArrayList<Vehicle> vehicles) {
//		this.vehicles = vehicles;
//	}

	// Getters and setters changed to add and remove

	public void add(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void remove(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	// object equals

	@Override
	public int hashCode() {
		return Objects.hash(vehicles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garage other = (Garage) obj;
		return Objects.equals(vehicles, other.vehicles);
	}

	// loop through to print out

//	public void print() {
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}
//	}

	// Replace print() with toString

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

	// total cost

	public int calcBill() {
		int totalBill = 0;
		for (Vehicle vehicle : vehicles) {
			totalBill += vehicle.calcBill();
		}
		return totalBill;
	}

}
