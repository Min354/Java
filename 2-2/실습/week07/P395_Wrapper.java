package week07;

public class P395_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println(c1 + " is a number");
		if(Character.isAlphabetic(c2))
			System.out.println(c1 + " is a Alphabet");
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		System.out.println(d);
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		System.out.println(b);
		System.out.println(Boolean.parseBoolean("false"));

	}

}
