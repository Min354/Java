package week03;
import java.util.Scanner;

public class 예제19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int user , num =0, comp = (int)(Math.random());
		System.out.print("정답을 추측하여 보시오: ");
		user = s.nextInt();
		while(user != comp) {	
			if(user>comp)
				System.out.println("제시한 정수가 높습니다.");
			else
				System.out.println("제시한 정수가 낮습니다.");
			
			System.out.print("정답을 추측하여 보시오: ");
			user = s.nextInt();
			num++;
		}

		System.out.print("축하합니다. 시도횟수: " + num);

	}

}
