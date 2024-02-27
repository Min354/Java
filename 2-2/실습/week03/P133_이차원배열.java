package week03;
import java.util.Scanner;

public class P133_이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		double[][] A = new double[2][3];
		
		for(int i=0; i<A[0].length-1; i++) {
			System.out.println("학생번호" + (i+1));
			System.out.print("국어점수: ");
			A[i][0] = s.nextDouble();
			System.out.print("수학점수: ");
			A[i][1] = s.nextDouble();
			
			A[i][2] = (A[i][0] + A[i][1]) / A[0].length-1;
		}
		
		for(int i=0; i<A[0].length-1; i++) {
			System.out.println("학생번호" + (i+1));
			System.out.print("국어: " + A[i][0]);
			System.out.print(" 수학: " + A[i][1]);
			System.out.printf(" 평균: %.1f" , A[i][2]);
			System.out.println("");
			
		}
		
		s.close();

	}

}
