package week10;
import java.util.*;

public class P76_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> h = new HashMap<>();
		
		h.put("baby", "아기");
		h.put("love", "사랑");
		h.put("apple", "사과");
		
		Scanner s = new Scanner(System.in);
		String eng, kor;
		while(true) {
			System.out.print("key: ");
			eng = s.next();
			if(eng.equals("exit")) {
				System.out.println("break");
				break;
				}
			
			kor = h.get(eng);
			if(kor ==null)
				System.out.println(eng +" does not exist");
			else
				System.out.println(kor);
			
		}
		
		s.close();
	}

}
