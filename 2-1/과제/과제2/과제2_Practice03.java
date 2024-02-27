package 과제2;
import java.util.Scanner;

public class 과제2_Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n, PrimeC = 0; //boolean 으로도
		
		while(true)
		{
			System.out.print("숫자를 입력하세요.: ");
			n = scanner.nextInt();
			
			if(n>0) 
				break;
			else 
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				PrimeC++; 
			}
		}
		if(PrimeC == 2)
			System.out.print("입력된 숫자 " + n + "은 소수입니다.");
		else
			System.out.print("입력된 숫자 " + n + "은 소수가 아니다.");
		
		scanner.close();
	}

}
