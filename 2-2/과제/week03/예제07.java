package week03;
import java.util.Scanner;

public class 예제07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성적을 입력하시오: ");
		int grade = scanner.nextInt();
		
		if(grade > 69 && grade < 80)
			System.out.print("학점 C");
		else if(grade > 79 && grade < 90)
			System.out.print("학점 B");
		else if(grade > 89)
			System.out.print("학점 A");
		
		
		
		scanner.close();
	}

}
