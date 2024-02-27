package week09;
import java.util.*;

public class Practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isDone = false;
		int a=0, b=0, sum=0;
		String str = new String();
		Scanner s = new Scanner(System.in);
		while(isDone != true) {
			try {
				System.out.print("1번 피연산자를 입력하세요: ");
				str = s.next();
				a = Integer.parseInt(str);
				isDone = true;
			}
			catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}
		}
		isDone = false;
		while(isDone != true) {
			try {
				System.out.print("2번 피연산자를 입력하세요: ");
				str = s.next();
				b = Integer.parseInt(str);
				
				sum = a+b;
				System.out.println(a + " + " + b + " = " + sum);
				isDone = true;
			}
			catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}
		}
		s.close();
	}

}
