package abstraction;

public class App {

	public static void main(String[] args) {

		Garage myGarage = new Garage("GTA");

		myGarage.add(new Car("Vauxhall", "Insignia", "Grey", "210L"));
		myGarage.add(new Bike("Honda", "CB125F", "Yellow", "Medium"));
		myGarage.add(new Plane("Comac", "C919", "Purple", "Quad"));

		System.out.println(myGarage.toString());
		System.out.println("Bill: " + myGarage.calcBill());

		myGarage.add(new Plane("Comac", "C919", "Purple", "Quad"));
		myGarage.add(new Bike("Honda", "CB125F", "Yellow", "Medium"));

		System.out.println(myGarage.calcBill());

		System.out.println("Remove Vehicles from Garage");

		myGarage.remove(new Car("Vauxhall", "Insignia", "Grey", "210L"));
		myGarage.remove(new Bike("Honda", "CB125F", "Yellow", "Medium"));
		myGarage.remove(new Bike("Honda", "CB125F", "Yellow", "Medium"));
		System.out.println(myGarage.toString());

		System.out.println(myGarage.calcBill());

		myGarage.remove(new Plane("Comac", "C919", "Purple", "Quad"));
		myGarage.remove(new Plane("Comac", "C919", "Purple", "Quad"));
		System.out.println(myGarage.toString());

		System.out.println(myGarage.calcBill());

	}

}
