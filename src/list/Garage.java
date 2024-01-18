package list;

import java.util.ArrayList;

import garage.Vehicle;

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

	// loop through to print out

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}

	}
}
