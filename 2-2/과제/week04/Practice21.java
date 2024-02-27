package week04;
import java.util.Scanner;

public class Practice21 {
	public static int min(int a, int b) {return (a>b)?b:a;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		int [] n = new int[4];
		/*
		for(int i=0; i<n.length-1; i++) {
			System.out.print(i+1 + "번째 숫자를 입력하세요: ");
			n[i] = scanner.nextInt();
		}
		*/
		
		System.out.print("1번째 숫자를 입력하세요: ");
		n[0] = scanner.nextInt();
		System.out.print("2번째 숫자를 입력하세요: ");
		n[1] = scanner.nextInt();
		
		n[3] = min(n[0], n[1]);
		
		System.out.print("3번째 숫자를 입력하세요: ");
		n[2] = scanner.nextInt();
		n[3] = min(n[3], n[2]);
		
		System.out.print("가장 작은 숫자는 "+ n[3] + "입니다.");
		
		scanner.close();
	}

}
