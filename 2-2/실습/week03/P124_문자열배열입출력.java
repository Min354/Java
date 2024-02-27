package week03;
import java.util.Scanner;

public class P124_문자열배열입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String [] Arr = new String[3];
		
		for(int i=0; i<Arr.length; i++) { //Arr.length를 통해 수정없어도 되는 코드로
			Arr[i] = scanner.nextLine();
		}
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
		
		scanner.close();
	}

}
