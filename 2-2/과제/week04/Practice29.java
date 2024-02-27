package week04;
import java.util.Random;
import java.util.Scanner;


public class Practice29 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int [] arr = new int [5];
		int [] num = new int [10];
		int max = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요: ");
			arr[i] = scanner.nextInt();
			num[arr[i]]++;
		}
		
		System.out.println("입력된 숫자는 다음과 같습니다.");
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n역순 출력입니다. \n");
		for(int i=4; i>-1; i--) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0; i<5; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		System.out.print("\n가장 큰 수는 " + max + "입니다.");	
		
		System.out.print("\n숫자 별로 입력된 횟수는 다음과 같습니다.");	
		for(int i=1; i<10; i++) {
			System.out.print("\n숫자" + i + ":" + num[i] + "번");
		}
		
		System.out.print("\n\n가장 큰 수는 " + max + "이고 배열 내에 " + num[max] + "번 나타납니다.");
		
		
		scanner.close();

	}

}
