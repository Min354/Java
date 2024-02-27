package week09;
import java.util.Scanner;

public class P08_ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("DIVIDEND: ");
			int dividend = s.nextInt();
			System.out.print("DIVISOR: ");
			int divisor = s.nextInt();
			
			try {
				System.out.print(dividend + " / " + divisor + " = " + dividend/divisor + " + reminder"); 
				break;
			}
			catch(ArithmeticException e) {System.out.println("DIVISOR can not be 0");}
		}
		s.close();
	}

}
