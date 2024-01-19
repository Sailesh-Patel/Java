package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("Vauxhall", "Insignia", "Grey", "210L"));
		vehicles.add(new Bike("Honda", "CB125F", "Yellow", "Medium"));
		vehicles.add(new Plane("Comac", "C919", "Purple", "Quad"));
		vehicles.add(new Car("Ford", "Focus", "Red", "200L"));
		vehicles.add(new Car("Volkswagen", "Golf", "Black", "185L"));
		vehicles.add(new Bike("BMZ", "R1250", "Blue", "Small"));
		vehicles.add(new Bike("Kawasaki", "Ninja650", "Green", "Large"));
		vehicles.add(new Plane("Boeing", "747", "White", "Dual"));
		vehicles.add(new Plane("Airbus", "A340", "Orange", "Oct"));

		System.out.println("Vehicles: " + vehicles);

		Collections.sort(vehicles);

		System.out.println("Vehicles: " + vehicles);

	}
}