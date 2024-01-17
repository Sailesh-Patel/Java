package oop;

public class App {
// to access anywhere, add public to the start
	public String name;

	private int age;

	public String job;

	public void greeting() {
		System.out.println("Hello, I'm ");
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
	}

}
