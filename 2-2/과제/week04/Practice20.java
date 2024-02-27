package week04;
import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double height, weight, norm;
		
		System.out.print("키를 입력하세요: ");
		height = scanner.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		weight = scanner.nextDouble();
		
		norm = (height-100) * 0.9;
		System.out.println("표준체중은 " + norm + "입니다.");
		
		if(norm<weight) 
			System.out.print("과체중입니다.");
		else if(norm > weight)
			System.out.print("저체중입니다.");
		else
			System.out.print("정상체중입니다.");
		
		
		scanner.close();
	}

}
