package week03;
import java.util.Scanner;

public class 예제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String name = scanner.nextLine();
		
		System.out.print("나이를 입력하시오: ");
		int age = scanner.nextInt();
		
		System.out.print(name + "님 안녕하세요! " + age + "살이시네요.");
		
		scanner.close();
	}

}
