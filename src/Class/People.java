package Class;

public class People {

	public static void main(String[] args) {
		Person trainer = new Person();
		trainer.name = "Jordan";
		trainer.setAge(25);
		trainer.job = "trainer";
		trainer.print();

		Person trainer2 = new Person();
		trainer2.name = "Andrew";
		trainer2.setAge(21);
		trainer2.job = "trainer";

		trainer2.greeting();
		trainer2.print();

		Person[] trainers = { trainer, trainer2 };

		for (Person person : trainers) {
			person.print();
		}

	}
}
