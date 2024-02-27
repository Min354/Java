package 과제2;
import java.util.Scanner;
public class 과제2_Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = 0, newln = 0;
		
		while(true)
		{
			System.out.print("정수를 입력하세요.: ");
			N = scanner.nextInt();
			
			if(N>0) 
				break;
			else
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
		
		for(int i=1; i<N; i++)
		{
			if(i%5 != 0)
			{
				System.out.printf(i + "\t");
				newln++;
			}
			if(newln == 7)
			{
				System.out.println(); 
				newln =0;
			}
		}

		scanner.close();
	}

}
