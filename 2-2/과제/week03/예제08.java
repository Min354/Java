package week03;
import java.util.Scanner;

public class 예제08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성적을 입력하시오: ");
		int grade = scanner.nextInt();
		
		switch((grade/10)%4) {	//100점은 2, 90점대는 1, 80점대는 0, 70점대는 3
		case 2: System.out.print("학점 A"); 
			break;
			
		case 1: System.out.print("학점 A"); 
			break;
			
		case 0: System.out.print("학점 B"); 
			break;
		
		case 3: System.out.print("학점 C"); 
			break;
		}
		
		scanner.close();
	}

}