package week10;
import java.util.*;

public class P65_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = new ArrayList<>();
		
		a.add("h");
		a.add("e");
		a.add("l");
		a.add("l");
		a.add("o");
		
		System.out.println("size: " + a.size());
		
		a.add(2, "l");
		System.out.println(a);
		
		a.set(2, "e");
		System.out.println(a);
		
		System.out.println(a.get(1));
		
		a.remove(1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
	}

}
