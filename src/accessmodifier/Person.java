package accessmodifier;

public class Person {

	private String name;

	private int age;

	private String job;

	public void greeting() {
		System.out.println("Hello, I'm ");
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
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

}
