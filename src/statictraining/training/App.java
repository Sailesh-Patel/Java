package statictraining.training;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("Jordan", 26, "Trainer");
//		p1.latinName = "Homo Superior";
//		System.out.println(p1.latinName);

		Person p2 = new Person("Andrew", 21, "Trainer2");
//		System.out.println(p2.latinName);

		System.out.println(Person.latinName);
	}

}
