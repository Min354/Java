package week10;
import java.util.*;

public class P83_Collections {
	public static void printList(LinkedList<String> l) {
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String e = it.next();
			String seperator;
			if(it.hasNext())
				seperator = "->";
			else
				seperator = "\n";
			System.out.print(e+seperator);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<>();
		
		l.add("트랜스포머");
		l.add("스타워즈");
		l.add("매트릭스");
		l.add(0, "터미네이터");
		l.add(2, "아바타");
		
		Collections.sort(l);
		printList(l);
		
		Collections.reverse(l);
		printList(l);
		
		int index = Collections.binarySearch(l, "아바타")+1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");

	}

}
