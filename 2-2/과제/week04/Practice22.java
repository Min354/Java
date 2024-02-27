package week04;
import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요: ");
		double x = s.nextDouble();
		double fx;
		
		if(x>0)
			fx = 7*x + 2;
		else if(x<0)
			fx = x*x*x - 9*x + 2;
		else
			fx = 2;
			
		System.out.print("f(x) = " + fx);
		
		s.close();
	}

}
