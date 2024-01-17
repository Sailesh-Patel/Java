package accessmodifier;

public class People {

	public static void main(String[] args) {
		Person trainer = new Person();
		trainer.setName("Jordan");
		trainer.setAge(25);
		trainer.setJob("trainer");
		trainer.print();

		Person trainer2 = new Person();
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
		}

	}
}
