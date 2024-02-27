package week13;

public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
		System.out.println("This is main");
	}
	static void f() throws Exception{
		Exception e = new Exception();
		throw e;
	}

}
