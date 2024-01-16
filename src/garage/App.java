package garage;

public class App {

	public static void main(String[] args) {

		Car car1 = new Car("Ford", "Focus", "Red", "200L");
//		car1.print();

		Car car2 = new Car("Vauxhall", "Insignia", "Grey", "210L");
//		car2.print();

		Car car3 = new Car("Volkswagen", "Golf", "Black", "185L");
//		car3.print();

		Car[] cars = { car1, car2, car3 };

		for (Car car : cars) {
			car.print();
		}

		Bike bike1 = new Bike("BMZ", "R1250", "Blue", "Small");
//		bike1.print();

		Bike bike2 = new Bike("Honda", "CB125F", "Yellow", "Medium");
//		bike2.print();

		Bike bike3 = new Bike("Kawasaki", "Ninja650", "Green", "Large");
//		bike3.print();

		Bike[] bikes = { bike1, bike2, bike3 };

		for (Bike bike : bikes) {
			bike.print();
		}

		Plane plane1 = new Plane("Boeing", "747", "White", "Dual");
//		plane1.print();

		Plane plane2 = new Plane("Comac", "C919", "Purple", "Quad");
//		plane2.print();

		Plane plane3 = new Plane("Airbus", "A340", "Orange", "Oct");
//		plane3.print();

		Plane[] planes = { plane1, plane2, plane3 };

		for (Plane plane : planes) {
			plane.print();
		}

	}

}
