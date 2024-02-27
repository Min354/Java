package 과제3;
import java.util.Random;
import java.util.Scanner;

class RCP16
{
	int value;
	String name;
	static Scanner scanner;
	public void scanR()
	{
		scanner= new Scanner(System.in);
		String nameValue;
		
		while (true) 
		{
			System.out.print(name + "의 입력(가위/바위/보/그만): ");
			nameValue = scanner.nextLine();
			
			if(nameValue.equals("바위"))
				{value = 0; break;}
			else if(nameValue.equals("가위"))
				{value = 1; break;}
			else if(nameValue.equals("보"))
				{value = 2; break;}
			else if(nameValue.equals("그만"))
				{System.out.print("프로그램을 종료합니다."); value = -1; break;}
			else 
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
	}
}

public class 과제3_Practice16 {

	public static void printR(String xs, int x, String ys, int y, int[] score)
	{
		if((x>y && x-y==2) || (y>x && y-x!=2))
			{
			System.out.println(xs + "가 이겼습니다.");
			score[1]++;
			}
		else if(y == x)
			{
			System.out.println("비겼습니다.");
			score[2]++;
			}
		else
			{
			System.out.println(ys + "이 이겼습니다.");
			score[0]++;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(System.nanoTime());
		int comR;
		int [] score = {0,0,0};
		RCP16 당신 = new RCP16();
		당신.name = "당신";
		
		while(true) {
		
			System.out.println("현재 당신의 전적: " + score[0]+ "승 "+ score[1]+ "패 "+ score[2]+ "무 ");
			comR = random.nextInt(3);
			switch(comR){
			case 0: 
				System.out.printf("컴퓨터의 생성: 바위"); break;
			case 1: 
				System.out.printf("컴퓨터의 생성: 가위");  break;
			case 2: 
				System.out.printf("컴퓨터의 생성: 보");  break;
			default:
				System.out.printf("난수 생성이 되지 않음");  break;
			}
		
			System.out.println();
			
			당신.scanR();
			if(당신.value == -1)
				break;
		
			printR("컴퓨터", comR, 당신.name, 당신.value, score);
		}

	}
}
