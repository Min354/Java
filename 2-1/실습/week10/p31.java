package week10;

import java.util.*;
public class p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("hi");
		a.add("hello");
		a.add("Java");
		
		System.out.println("Size: " + a.size());
		
		a.add(2, "Sahni");
		System.out.println(a);
		
		a.set(2, "James");
		System.out.println(a);
		
		
		String str = a.get(1);
		System.out.println(str);
		
		a.remove(1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);

	}

}
