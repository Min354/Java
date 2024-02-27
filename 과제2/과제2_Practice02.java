package 과제2;
import java.util.Scanner;

public class 과제2_Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		double ave = 0;
		
		while(true)
		{
			System.out.print("숫자를 입력하세요: ");
			int n = scanner.nextInt();
			
			if(n == 0) 
				break;
			
			else if(n <= 0)
				System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
			
			else
				sum += n; i++;
			
		}
		ave = sum/i;
		System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
		System.out.println("입력된 숫자들 중에서 0보다 큰 숫자의 개수는 " + i + "입니다.");
		System.out.println("입력된 숫자들의 평균은 " + ave + "입니다.");
		
		scanner.close();
	}

}