package 과제3;
import java.util.Random;
import java.util.Scanner;

public class 과제3_Practice15 {
	public static int whoswin(String com, String you)
	{
		int win = -3; //com: -1, you: 1, X: 0
		if(com.equals(you))
			win = 0;
		else if((com.equals("가위")&&you.equals("보")) || (com.equals("바위")&&you.equals("가위")) || (com.equals("보")&&you.equals("바위")))
			win = -1;
		else
			win = 1;
		return win;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(System.nanoTime());
		Scanner scanner = new Scanner(System.in);
		String comR = "";
		String youR;
		
		switch(random.nextInt(3)){
		case 0: 
			comR = "바위"; System.out.printf("컴퓨터의 생성: " + comR); break;
		case 1: 
			comR = "가위"; System.out.printf("컴퓨터의 생성: " + comR); break;
		case 2: 
			comR = "보"; System.out.printf("컴퓨터의 생성: " + comR); break;
		default:
			System.out.printf("난수 생성이 되지 않음");  break;
		}
		
		System.out.println();
		
		System.out.print("당신의 입력: ");
		youR = scanner.nextLine();
		
		switch(whoswin(comR, youR))
		{
		case -1: System.out.printf("컴퓨터가 이겼습니다."); break;
		case 0: System.out.printf("비겼습니다."); break;
		case 1: System.out.printf("당신이 이겼습니다."); break;
		default: System.out.printf("제대로 실행되지 않음"); break;
		}
		
		scanner.close();

	}

}
