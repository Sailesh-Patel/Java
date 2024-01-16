package Constructors;

public class People {

	public static void main(String[] args) {

		Person trainer3 = new Person("Adam", 24, "trainer", "UK");
		trainer3.defaulttest();
		trainer3.print();

		Person trainer = new Person(null, 0, null, null);
		trainer.setName("Jordan");
		trainer.setAge(25);
		trainer.setJob("trainer");
		trainer.setLocation("GBR");
		trainer.print();

		Person trainer2 = new Person(null, 0, null, null);
		trainer2.setName("Andrew");
		trainer2.setAge(21);
		trainer2.setJob("trainer");

		trainer2.greeting();
		trainer2.print();

		Person[] trainers = { trainer, trainer2 };

		for (Person person : trainers) {
			person.print();
			person.getAge();
			person.getName();
			person.getJob();
			person.getLocation();
		}

		trainer2.setAge(trainer2.getAge() + 10);
		trainer2.print();
	}
}
