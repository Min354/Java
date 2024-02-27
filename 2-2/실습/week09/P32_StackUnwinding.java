package week09;

public class P32_StackUnwinding {
	public static void main(String[] args) {
		try {
			f();
		}
		catch(Exception e2) {
			Exception e3 = new Exception();
			System.out.print("main(): ");
			e3.printStackTrace();
		}
	}
	
	static void f() throws Exception{
		try {
			g();
		}
		catch(Exception e) {
			Exception e2 = new Exception();
			System.out.print("f(): ");
			e2.printStackTrace();
			throw e2;
		}
		System.out.print("f()");
	}
	
	static void g() throws Exception{
		Exception e = new Exception();
		System.out.print("g(): ");
		e.printStackTrace();
		throw e;
	}

}
