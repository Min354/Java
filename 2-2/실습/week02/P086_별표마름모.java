package week02;
import java.util.Scanner;

public class P086_별표마름모 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("length: ");
		int length = scanner.nextInt();
		int len = length/2+1;
		
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<(2*len)-1-(2*len-i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//top
		
		if(length%2!=0)
		{
			for(int j=0; j<len*2-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//mid
		
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<(2*len)-3-(i*2); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//bot
		
		scanner.close();

	}

}
