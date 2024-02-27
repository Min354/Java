package week03;
import java.util.Scanner;

public class 예제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum=0, n;
		while(true) {
			System.out.print("정수를 입력하시오: ");
			n = scanner.nextInt();
			
			if(n == -1)
				break;
		
			sum += n;
		}
		System.out.print("정수의 합은 " + sum + "입니다.");
		scanner.close();
	}

}