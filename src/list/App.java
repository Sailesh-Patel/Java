package list;

import java.util.ArrayList;

import garage.Bike;
import garage.Car;
import garage.Plane;
import garage.Vehicle;

public class App {

	public static void main(String[] args) {

		System.out.println("New Vehicles");

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("Ford", "Focus", "Red", "200L"));
		vehicles.add(new Bike("BMZ", "R1250", "Blue", "Small"));
		vehicles.add(new Plane("Boeing", "747", "White", "Dual"));

		System.out.println("Get Class:");
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getClass().getSimpleName());
			vehicle.print();
		}

		System.out.println("Vehicles in my Garage");

		Garage myGarage = new Garage("GTA");

		myGarage.add(new Car("Vauxhall", "Insignia", "Grey", "210L"));
		myGarage.add(new Bike("Honda", "CB125F", "Yellow", "Medium"));
		myGarage.add(new Plane("Comac", "C919", "Purple", "Quad"));

		myGarage.print();

		System.out.println("Array changes of Vehicles to my Garage");

		myGarage.print();

	}
}
