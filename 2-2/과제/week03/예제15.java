package week03;
import java.util.Scanner;

public class 예제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			n = scanner.nextInt();
			
			if(n > 0 && n<13)
				break;
		}
		System.out.print("사용자가 입력한 월은 " + n);
		scanner.close();
	}

}