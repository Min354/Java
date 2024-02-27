package week03;
import java.util.Scanner;

public class 예제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하시오: ");
		int n1 = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		int n2 = scanner.nextInt();
		
		System.out.print(n1 + n2);
		
		scanner.close();
		
	}

}
