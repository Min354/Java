package week13;
//예외 처리 실습
import java.util.Scanner;

public class p08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("나뉨수를 입력하시오: ");
			int dividend = scanner.nextInt();
			System.out.println("나눗수를 입력하시오: ");
			int divisor = scanner.nextInt();
			
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor);
				break;
			}
			catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요");
			}
		}
		
		scanner.close();

	}

}
