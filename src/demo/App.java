package demo;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	
//		type name = value
		byte byt = 25;
		short shrt = 255;
		int i = 2_100_000_000;
//		without the L java thinks it's an int
		long l = 99999999999999L;
//      need to add an f to the end of the float value, or java thinks its a double 
		float f = 44.94f;
		double d = 44.94;
		
		boolean b = true;
		
//		need to use ' for a single character 
		char c = 'j'; 
//		need to use " for strings which are sequence of characters 
//		
		String s = "Jordan";
//		
		s.toLowerCase();
		
//		string without a value is null 
		s = null;
		
	}
	
}
