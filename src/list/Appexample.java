package list;

import java.util.ArrayList;

public class Appexample {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Hellow");
		words.add("World");
		words.add("!");
		System.out.println(words);

		words.remove("!");
		words.remove(1);

		System.out.println(words);

		
		
	}
}
