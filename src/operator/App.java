package operator;

public class App {
	public static void main(String[] args) {
		
		System.out.println(add(2,10));
		
		System.out.println(subtract(10,2));
		
		System.out.println(multiply(2,10));
		
		System.out.println(divide(10,2));
		
		}
	
			
		public static int add(int a, int b) {
			return a + b;
		}

		public static int subtract(int a , int b) {
			return a - b;
		}
		
		public static int multiply(int a , int b) {
			return a * b;
		}
		
		public static int divide(int a , int b) {
			return a / b;
		}
			
		
}
