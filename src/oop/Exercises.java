package oop;

public class Exercises {

	public static void main(String[] args) {
		int num = 0;
		int[] nums = new int[10];

		nums[1] = 10;
		nums[2] = 21;
		nums[3] = 32;
		nums[4] = 43;
		nums[5] = 54;
		nums[6] = 65;
		nums[7] = 76;
		nums[8] = 87;
		nums[9] = 98;

		// create directly into an array

		int[] nums2 = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };

		System.out.println("0: " + nums[0]);
		System.out.println("1: " + nums[1]);
		System.out.println("2: " + nums[2]);
		System.out.println("3: " + nums[3]);
		System.out.println("4: " + nums[4]);
		System.out.println("5: " + nums[5]);
		System.out.println("6: " + nums[6]);
		System.out.println("7: " + nums[7]);
		System.out.println("8: " + nums[8]);
		System.out.println("9: " + nums[9]);

		System.out.println("0: " + nums2[0]);
		System.out.println("1: " + nums2[1]);
		System.out.println("2: " + nums2[2]);
		System.out.println("3: " + nums2[3]);
		System.out.println("4: " + nums2[4]);
		System.out.println("5: " + nums2[5]);
		System.out.println("6: " + nums2[6]);
		System.out.println("7: " + nums2[7]);
		System.out.println("8: " + nums2[8]);
		System.out.println("9: " + nums2[9]);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + "NUM " + nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + "NUM " + nums[i] * nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + "NUM " + nums[i] * 10);
		}

		for (int i = 0; i < nums2.length; i++) {
			System.out.println("I: " + i + "NUM " + nums2[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			System.out.println("I: " + i + "NUM " + nums2[i] * nums2[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + "NUM " + nums2[i] * 10);
		}
	}

}
