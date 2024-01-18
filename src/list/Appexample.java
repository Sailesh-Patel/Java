package list;

import java.util.ArrayList;

public class Appexample {
	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("World");
		words.add("!");
		System.out.println(words);

		words.remove("!");
		words.remove(1);

		words.set(0, "New Word SET");
		System.out.println(words);

		for (int i = 0; i < 5; i++) {
			words.add("barry");
		}
		System.out.println(words);

		while (words.contains("barry")) {
			words.remove("barry");
		}
		System.out.println(words);

		for (int i = 0; 1 < words.size(); i++) {
			System.out.println("i: " + i + " Word: " + words.get(i));
		}

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			nums.add(i * 2);
		}

		System.out.println(nums);

		for (Integer num : nums) {
			System.out.println("Num: " + num);
		}

	}
}
