package types;

public class App {
	public static void main(String[] args) {
		byte byt = 25;
		short shrt = 255;
		int i = 2_100_000_000;
		long l = 99999999999999L;
		float f = 44.94f;
		double d = 44.94;
		boolean b = true;
		char c = 'j'; 
	
		
		System.out.println(byt);
		System.out.println(shrt);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
		
		String s = "Sailesh";
		System.out.println(s);
		
		String s1 = "Patel";
		System.out.println(s + ' ' + s1); 
		
		String s2 = null;
		System.out.println(s2);
		
		char c2 = 'h';
		System.out.println(c + c2);
		
		char c3 = 'a';
		System.out.println(c3);
		System.out.println(c3 / c3);
		System.out.println(c3 * c3);
		System.out.println(c3 - c3);
		
//		int i2 = 1.4;
//		System.out.println(i2);
		
		char c4 = 'b';
		System.out.println(c4);
		
		System.out.println(c3 + c4);
	}

}
