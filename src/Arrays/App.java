package Arrays;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {
		int num = 0;
//		creates a blank array 10 long
		int [] nums = new int[10];
		
		System.out.println("9: " + nums[9]);
		// can't really print out 
		System.out.println("Nums: " + nums);
		// to print the array using a FOR LOOP
		 for (int i = 0; i < nums.length; i++) {
			 System.out.println("I: " + i + "NUM " + nums[i]);
		 }
			// put the forth in the array with a value of 17
		 nums[3]= 17;
		 for (int i = 0; i < nums.length; i++) {
			 System.out.println("I: " + i + "NUM " + nums[i]);
		 }
		 
		 //String array
		 String[] words = new String[5];
		 for (int i = 0; i < words.length; i++) {
			 System.out.println("I: " + i + "WORD " + words[i]);
		 }
		 
		 
//		 String[] words = {"Jordan", "Cameron", "Adam"};
//		 for (int i = 0; i < words.length; i++) {
//			 System.out.println("I: " + i + "WORD " + words[i]);
//		 }
		 
		 
	}
	
}
