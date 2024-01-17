package list;

import java.util.ArrayList;

import garage.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Garage(String name) {
		super();
	}

	public void add(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void remove(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}

	}
}
