package week09;

public class P26_ThrowException {
	public static void main(String[] args) {
		f();
		System.out.println("main");
	}
	
	static void f() {
		
		Exception e;
		
		e = new Exception();
		e.printStackTrace();
		
		e = new Exception("test");
		e.printStackTrace();
		
		e = new ArithmeticException();
		e.printStackTrace();
		
		e = new ArithmeticException("+-*/");
		e.printStackTrace();
	}

}
