package garage;

public class App {

	public static void main(String[] args) {

		System.out.println("CARS");

		Car car1 = new Car("Ford", "Focus", "Red", "200L");
		car1.print();

		Car car1a = new Car();
		car1a.setMake("Nissan");
		car1a.setModel("Qashqai");
		car1a.setColour("Silver");
		car1a.setBootsize("285L");
		car1a.print();

		Car car2 = new Car("Vauxhall", "Insignia", "Grey", "210L");
		car2.print();

		Car car2a = new Car();
		car2a.setMake("Tesla");
		car2a.setModel("S");
		car2a.setColour("Orange");
		car2a.setBootsize("100L");
		car2a.print();

		Car car3 = new Car("Volkswagen", "Golf", "Black", "185L");
		car3.print();

		Car car3a = new Car();
		car3a.setMake("Fiat");
		car3a.setModel("Punto");
		car3a.setColour("Yellow");
		car3a.setBootsize("80L");
		car3a.print();

		Car[] cars = { car1, car2, car3 };

		for (Car car : cars) {
			car.print();
		}

		System.out.println("BIKES");

		Bike bike1 = new Bike("BMZ", "R1250", "Blue", "Small");
		bike1.print();

		Bike bike1a = new Bike();
		bike1a.setMake("Yamaha");
		bike1a.setModel("MT-03");
		bike1a.setColour("Blue");
		bike1a.setSidecar("Large");
		bike1a.print();

		Bike bike2 = new Bike("Honda", "CB125F", "Yellow", "Medium");
		bike2.print();

		Bike bike2a = new Bike();
		bike2a.setMake("Ducati");
		bike2a.setModel("V4S");
		bike2a.setColour("Red");
		bike2a.setSidecar("Small");
		bike2a.print();

		Bike bike3 = new Bike("Kawasaki", "Ninja650", "Green", "Large");
		bike3.print();

		Bike bike3a = new Bike();
		bike3a.setMake("Moto Guzzi");
		bike3a.setModel("Eagle");
		bike3a.setColour("Black");
		bike3a.setSidecar("Medium");
		bike3a.print();

		Bike[] bikes = { bike1, bike2, bike3 };

		for (Bike bike : bikes) {
			bike.print();
		}

		System.out.println("PLANES");

		Plane plane1 = new Plane("Boeing", "747", "White", "Dual");
		plane1.print();

		Plane plane1a = new Plane();
		plane1a.setMake("Supermarine");
		plane1a.setModel("Spitfire");
		plane1a.setColour("White");
		plane1a.setProps("Oct");
		plane1a.print();

		Plane plane2 = new Plane("Comac", "C919", "Purple", "Quad");
		plane2.print();

		Plane plane2a = new Plane();
		plane2a.setMake("Antonov");
		plane2a.setModel("An");
		plane2a.setColour("Red and White");
		plane2a.setProps("Dual");
		plane2a.print();

		Plane plane3 = new Plane("Airbus", "A340", "Orange", "Oct");
		plane3.print();

		Plane plane3a = new Plane();
		plane3a.setMake("Cessna");
		plane3a.setModel("172");
		plane3a.setColour("Orange and White");
		plane3a.setProps("Quad");
		plane3a.print();

		Plane[] planes = { plane1, plane2, plane3 };

		for (Plane plane : planes) {
			plane.print();
		}

		System.out.println("Automobiles as Vehicles");

		Vehicle v1 = new Car("Ford", "Focus", "Red", "200L");
		v1.print();

		Vehicle v2 = new Bike("BMZ", "R1250", "Blue", "Small");
		v2.print();

		Vehicle v3 = new Plane("Boeing", "747", "White", "Dual");
		v3.print();

		Vehicle[] vehicles = { v1, v2, v3 };

		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}

	}

}