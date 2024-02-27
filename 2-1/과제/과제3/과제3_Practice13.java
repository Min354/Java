package 과제3;
import java.util.Scanner;


class RCP13
{
	int value;
	String name;
	static Scanner scanner;
	public void scanR(String name)
	{
		this.name = name;
		scanner= new Scanner(System.in);
		String nameValue;
		
		while (true) 
		{
			System.out.print(name + "의 입력: ");
			nameValue = scanner.nextLine();
			
			if(nameValue.equals("바위"))
				{value = 0; break;}
			else if(nameValue.equals("가위"))
				{value = 1; break;}
			else if(nameValue.equals("보"))
				{value = 2; break;}
			else 
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
	}
}

public class 과제3_Practice13 {
	public static void printR(String xs, int x, String ys, int y)
	{
		if((x>y && x-y==2) || (y>x && y-x!=2))
			System.out.print(xs + "가 이겼습니다.");
		else if(y == x)
			System.out.print("비겼습니다.");	
		else
			System.out.print(ys + "가 이겼습니다.");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RCP13 human1 = new RCP13();
		RCP13 human2 = new RCP13();
		
		human1.scanR("철수");
		human2.scanR("영희");
		
		printR(human1.name, human1.value, human2.name, human2.value);
	}
	
}