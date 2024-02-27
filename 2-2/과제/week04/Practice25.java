package week04;
import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int j=1;
		System.out.print("정수를 하나 입력하세요: ");
		int limit = s.nextInt()+1;
		
		for(int n=0 ; n<limit; j++) {
			if(n%3>0) 
				continue;
			if(j%5 == 0) {
				System.out.print(n  + "\n");
				n += 3;	
				continue;
			}
			
			System.out.print(n  + "\t");
			n += 3;		
		}
		s.close();

	}

}
