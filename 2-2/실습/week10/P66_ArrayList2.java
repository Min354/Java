package week10;
import java.util.*;

public class P66_ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = new ArrayList<String>();
		Scanner s = new Scanner(System.in);

		for(int i=0; i<4; i++) {
			System.out.print("name: ");
			a.add(s.next());
		}
		
		int longest=0;
		System.out.print(a.get(0) + " ");
		for(int i=1; i<a.size(); i++) {
			System.out.print(a.get(i) + " ");
			if(a.get(longest).length() < a.get(i).length())
				longest = i;
		}
		
		System.out.println("\nlongest name: " + a.get(longest));
		
		s.close();
		
	}

}
