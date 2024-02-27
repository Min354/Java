package week03;
import java.util.Scanner;

public class 예제05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double F, C;
		
		System.out.println("========================================");
		System.out.println("1. 화씨 -> 섭씨");
		System.out.println("2. 섭씨 -> 화씨");
		System.out.println("========================================");
		System.out.print("번호를 선택하시오: ");
		
		if(scanner.nextInt()==1)
		{
			System.out.print("화씨온도를 입력하시오: ");
			F = scanner.nextDouble();
			C = (F - 32) / 1.8;
			System.out.println("섭씨온도는 " + C);
			
		}
		
		else 
		{
			System.out.print("섭씨온도를 입력하시오: ");
			C = scanner.nextDouble();
			F = (C * 1.8) + 32;
			System.out.println("화씨온도는 " + F);
		}
		
		scanner.close();

	}

}
