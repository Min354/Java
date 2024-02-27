package week07;
import week06.abstractClass;

public class P361_pakageImport extends abstractClass{
	public int add(int a, int b) { return a+b;}
	public int sub(int a, int b) { return a-b; }
	public double average(int [] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P361_pakageImport C = new P361_pakageImport();
		System.out.println(C);
	}
	@Override
	public String toString() {
		return "연산 결과: \n" + add(2, 3) + "\n" + sub(2, 3) + "\n" + average(new int [] {2, 3, 4}) ;
	}

}
