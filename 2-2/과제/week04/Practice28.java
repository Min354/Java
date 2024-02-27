package week04;
import java.util.Scanner;

public class Practice28 {
	public static int printArr(int [] arr, int SIZE) {
		int n = 0; 
		
		System.out.println("입력된 숫자는 다음과 같습니다.");
		
		for(int i=0; i<SIZE; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n역순 출력입니다. \n");
		
		for(int i=SIZE-1; i>-1; i--) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0; i<SIZE; i++) {
			if(n < arr[i])
				n = arr[i];
		}
		
		return n;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] arr = new int [5];
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요: ");
			arr[i] = scanner.nextInt(); 
		}
		
		System.out.print("\n가장 큰 수는 " + printArr(arr, 5) + "입니다.");	
		
		scanner.close();
	}

}
