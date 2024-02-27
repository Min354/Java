package week10;
import java.util.*;

public class P52_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,  100);
		
		System.out.println("v.size() = " + v.size());
		System.out.println("v.capacity() = " + v.capacity());
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		int sum=0;
		
		for(int i=0; i<v.size(); i++) {
			sum+=v.elementAt(i);
		}
		System.out.println("sum: " + sum);
	}

}
