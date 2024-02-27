package week03;
import java.util.Scanner;

public class 예제09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("피자 종류를 입력하시오: ");
		
		switch(scanner.next()) {	
		case "콤비네이션": System.out.print("피자 콤비네이션의 가격=" + 20000); 
			break;
			
		case "슈퍼슈프림": System.out.print("피자 슈퍼슈프림의 가격=" + 20000);
			break;
			
		case "포테이토": System.out.print("피자 포테이토의 가격=" + 15000);
			break;
		
		case "쉬림프": System.out.print("피자 쉬림프의 가격=" + 25000);
			break;
			
		default:  System.out.print("그 외의 가격=" + 0);
			break;
		}
		
		scanner.close();
	}

}