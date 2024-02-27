package week07;

public class P406_stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = new String(" C#");
		String B = new String(",C++");
		
		System.out.println(A + "의 길이는 " + A.length());
		System.out.println(A.contains("#"));
		
		A = A.concat(B);
		System.out.println(A);
		
		A = A.trim();
		System.out.println(A);
		
		A = A.replaceAll("C#", "JAVA");
		System.out.println(A);
		
		String s[] = A.split(",");
		for(int i=0; i<s.length; i++) {
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		}
		
		A = A.substring(5);
		System.out.println(A);
		
		char c = A.charAt(2);
		System.out.println(c);
		

	}

}
