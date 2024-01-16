package Constructors;

public class Person {

	public Person(String name, int age, String job, String location) {
		setName(name);
		setAge(age);
		setJob(job);
		setLocation(location);

	}

	private String name;

	private int age;

	private String job;

	private String location;

	public Person() {
		location = "Unknown";
	}

	public void greeting() {
		System.out.println("Hello, I'm ");
	}

	public void defaulttest() {
		System.out.println("Default Test");
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
		System.out.println(location);
	}

	public void setAge(int age) {
		if (age >= 0 && age < 100) {
			this.age = age;
		} else {
			System.out.println("Please provide an age between 0 and 100");
		}
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location = "FR";
	}

}
