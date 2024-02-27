package week03;
import java.math.*;
import java.util.Scanner;

public class 예제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int user = -1, comp = -1;
		System.out.print("가위(0), 바위(1), 보(2): ");
		user = s.nextInt();
		comp = (int)(Math.random()*3)%3;
		
		System.out.print("인간: " + user + " 컴퓨터: " + comp);
		switch(user-comp) {
		
		case -1: System.out.printf("  컴퓨터 승리");
		break;
		
		case -2: System.out.printf("  인간 승리");
		break;
		
		case 1: System.out.printf("  인간 승리");
		break;
		
		case 2: System.out.printf("  컴퓨터 승리");
		break;
		
		case 0: System.out.printf("  비김");
		break;
		
		default: System.out.printf("  잘못된 입력");
		break;
		}
		
		s.close();
	}

}
