package week03;
import java.util.Scanner;

public class 예제12 {
	/*
	public static int factorial(int n) {
		
		if (n<2)
			return 1;
		else
			return n * factorial(n-1);
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long factorial = 1;
		
		System.out.print("정수를 입력하시오: ");
		int n = scanner.nextInt();
		
		for(int i=2; i<=n; i++) {
			factorial *= i;
		}
		
		System.out.print(n + "!은 " + factorial + "입니다.");
		scanner.close();
	}

}
