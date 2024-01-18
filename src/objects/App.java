package objects;

public class App {

	public static void main(String[] args) {

		System.out.println("New Vehicles");

		Car car1 = new Car("Ford", "Focus", "Red", "200L");
		Car car1a = new Car("Ford", "Focus", "Red", "200L");
		Car car2 = new Car("Vauxhall", "Insignia", "Grey", "210L");
		Car car3 = new Car("Volkswagen", "Golf", "Black", "185L");
		Bike bike1 = new Bike("BMZ", "R1250", "Blue", "Small");
		Bike bike2 = new Bike("Honda", "CB125F", "Yellow", "Medium");
		Bike bike3 = new Bike("Kawasaki", "Ninja650", "Green", "Large");
		Plane plane1 = new Plane("Boeing", "747", "White", "Dual");
		Plane plane2 = new Plane("Comac", "C919", "Purple", "Quad");
		Plane plane3 = new Plane("Airbus", "A340", "Orange", "Oct");

		System.out.println(car1 == car2);
		System.out.println(car1 == car1a);

		System.out.println("car1 == car2: " + (car1 == car2));
		System.out.println("car1 == car1a: " + (car1 == car1a));

		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car1a));

		System.out.println("car.equals (car2): " + car1.equals(car2));
		System.out.println("car1.equals (car1a): " + car1.equals(car1a));

		System.out.println("Vehicles in my Garage");

		Garage myGarage = new Garage("GTA");

		myGarage.add(new Car("Vauxhall", "Insignia", "Grey", "210L"));
		myGarage.add(new Bike("Honda", "CB125F", "Yellow", "Medium"));
		myGarage.add(new Plane("Comac", "C919", "Purple", "Quad"));

//		myGarage.print();

		System.out.println("Remove Vehicles from my Garage");

		myGarage.remove(new Car("Vauxhall", "Insignia", "Grey", "210L"));

//		myGarage.print();

		// toString print out

		System.out.println(car1.toString());
		System.out.println(bike1.toString());
		System.out.println(plane1.toString());
		System.out.println(myGarage.toString());

	}

}
