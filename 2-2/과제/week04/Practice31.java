package week04;
import java.util.Random;

public class Practice31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int arr[] = new int [20];
		
		
		System.out.print("생성된 난수는 다음과 같습니다.");
		for(int i=0; i<20; i++){
			if(i%10 == 0) 
				System.out.println();

			arr[i] = random.nextInt(100);
			System.out.print(arr[i]  + "\t");
	
		}
		
		int max = -1;
		for(int i=0; i<20; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("\n가장 큰 숫자는 " + max  + "입니다.");
	}

}
