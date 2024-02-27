package week13;

public class p23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
	}
	static void f() {
		g();
	}
	static void g() {
		h();
	}
	static void h() {
		try {
			int i = 100/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
