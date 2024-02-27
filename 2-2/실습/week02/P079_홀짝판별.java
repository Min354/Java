package week02;
import java.util.*;

public class P079_홀짝판별 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice = 1;
		int a;
		
		while (choice == 1) {
			System.out.println("숫자를 입력하세요 : ");
			a = scanner.nextInt();
			
			if(a%2 == 0) 
				System.out.println("even");
			else
				System.out.println("odd");
			System.out.println("continue: press 1");
			choice = scanner.nextInt();
		}
		System.out.println("모든 숫자를 확인");
		
		scanner.close();
	}

}
