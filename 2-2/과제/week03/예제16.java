package week03;
import java.util.Scanner;

public class 예제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum=0, n, i=0;
		while(true) {
			System.out.print("정수를 입력하시오: ");
			n = scanner.nextInt();
			
			if(n < 0)
				break;
		
			sum += n;
			i++;
		}
		System.out.print("평균은 " + sum/i);
		scanner.close();
	}

}