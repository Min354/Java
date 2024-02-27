package week09;
import java.util.*;

public class P11_InputMismatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수 3개");
		int sum=0, n=0;
		
		for(int i=0; i<3;i++) {
			try {
				System.out.print(i + ">>");
				n = s.nextInt();
				sum += n;
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				s.next();
				i--;
			}
		}
		System.out.println("sum: " + sum);
		s.close();
	}

}
