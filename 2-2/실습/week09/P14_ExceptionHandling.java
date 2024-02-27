package week09;
import java.util.*;

public class P14_ExceptionHandling {
	public static int quotient (int dividend, int divisor)throws ArithmeticException {
		return dividend/divisor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Enter Dividend: ");
				int dividend = s.nextInt();
				System.out.print("Enter Divisor: ");
				int divisor = s.nextInt();
				System.out.print("Quotient is " + quotient(dividend, divisor));
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("Cannot divide by 0.Try again.");
			}
			catch(InputMismatchException e) {
				System.out.println("You must enter integers. Try again. ");
				s.next();
			}
		}
		
		s.close();
	}

}
