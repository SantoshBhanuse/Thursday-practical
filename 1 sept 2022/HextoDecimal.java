
public class HextoDecimal {
	private static int hextoDecimal(String example) {
		// TODO Auto-generated method stub
		String A ="0123456789ABCDEF";
		example=example.toUpperCase();
		System.out.println(example);
		int newno= 0;  
		for (int i = 0; i <example.length(); i++)  
		{  
			char ch = example.charAt(i);  
			int n = A.indexOf(ch);  
			newno = 16*newno + n;  
		}  
		return newno;  
	}
	public static void main(String[]args) {
		System.out.println("Decimal Equivalent of 7A is:"+hextoDecimal("7A"));
	}
}
