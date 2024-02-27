package week06;

abstract class Calc{
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract double average(int [] a);
}


public class P332_GoodCalc extends Calc {

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
		P332_GoodCalc C = new P332_GoodCalc();
		System.out.println(C.add(2, 3));
		System.out.println(C.sub(2, 3));
		System.out.println(C.average(new int [] {2, 3, 4}));
	}

}
