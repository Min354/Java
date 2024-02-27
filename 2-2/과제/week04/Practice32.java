package week04;
import java.util.Random;

public class Practice32 {
	public static int[] getData(int num) {
		int[] rslt = new int[num];
		Random r = new Random();
		
		for(int i=0; i<num; i++){
			rslt[i] = r.nextInt(100);
		}
		return rslt;
	}
	
	public static void displayArray(int[] Array) {
		
		for(int i=0; i<20; i++) {
			if(i==10)
				System.out.println();
			System.out.print(Array[i] + " ");
		}
	}
	public static int findMax(int[] Array) {
		int max = -1;
		for(int i=0; i<20; i++) {
			if(max < Array[i])
				max = Array[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice30 p30 = new Practice30();
		int [] data = getData(20);
		System.out.println("생성된 난수는 다음과 같습니다.");
		displayArray(data);
		System.out.print("\n가장 큰 수는 " + findMax(data) + "입니다.");

	}

}
