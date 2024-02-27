package week10;
import java.util.*;

public class P77_HashMapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h = new HashMap<>();
		
		h.put("Kim", 97);
		h.put("Hwang", 88);
		h.put("Lee", 70);
		h.put("Han", 99);
		
		System.out.println("HashMap size: " + h.size());
		
		Set<String> keys =h.keySet();
		Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.print("name: " + str);
			System.out.println("\tscore: " + h.get(str));
			
		}

	}

}
