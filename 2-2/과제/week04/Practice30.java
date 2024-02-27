package week04;
import java.util.Scanner;

public class Practice30 {
	public static int SIZE = 10;
	public static void displayArray(int[] Array) {
		
		for(int i=0; i<SIZE; i++) {
			System.out.print(Array[i] + " ");
		}
	}
	public static int findMax(int[] Array) {
		int max = -1;
		for(int i=0; i<SIZE; i++) {
			if(max < Array[i])
				max = Array[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] arr = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요: ");
			arr[i] = s.nextInt(); 
		}
		System.out.println("입력된 숫자는 다음과 같습니다.");
		displayArray(arr);
		System.out.print("\n가장 큰 수는 " + findMax(arr) + "입니다.");	
		
		
		s.close();
	}

}
