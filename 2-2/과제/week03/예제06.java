package week03;
import java.util.Scanner;

public class 예제06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		
		if(scanner.nextInt()%2 == 0)
		{
			System.out.print("입력된 정수는 짝수입니다.");
		}
		
		else 
		{
			System.out.print("입력된 정수는 홀수입니다.");
		}
		
		scanner.close();

	}

}
