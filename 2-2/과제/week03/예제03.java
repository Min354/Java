package week03;
import java.util.Scanner;

public class 예제03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("초를 입력하시오: ");
		int sec = scanner.nextInt();
		
		System.out.print(sec + "초는 " + sec/60 + "분 "+ sec%60 + "초입니다.");
		
		scanner.close();

	}

}
