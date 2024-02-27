package week13;

public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100/0;
		}
		catch(ArithmeticException e) {
			//getMessage를 쓰지않으면 자동으로 toString()호출
			System.out.println(e.getMessage()); 
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("End of main");
	}

}
