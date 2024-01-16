package Class;

public class Person {

	String name;

	private int age;

	String job;

	void greeting() {
		System.out.println("Hello, I'm ");
	}

	void print() {
		System.out.println(name);
		System.out.println(getAge());
		System.out.println(job);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
