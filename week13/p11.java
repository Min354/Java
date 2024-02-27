package week13;
import java.util.Scanner;
import java.util.InputMismatchException;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n = 0;
		for(int i=0; i<3; i++) {
			try {
				System.out.print(i + ">> ");
				n = scanner.nextInt();
				sum += n;
			}
			catch(InputMismatchException e){
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				scanner.next();
				i--;
			}
		}
		System.out.println("합은 " + sum);
		scanner.close();

	}

}
