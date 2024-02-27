package week10;
import java.util.*;

public class P68_VectorIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,  100);
		
		System.out.println("v.size() = " + v.size());
		System.out.println("v.capacity() = " + v.capacity());
		
		Iterator <Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());}
		
		int sum=0;
		it = v.iterator();
		
		while(it.hasNext()) {
			sum+=it.next();}
		
		System.out.println("sum: " + sum);
	}

}
