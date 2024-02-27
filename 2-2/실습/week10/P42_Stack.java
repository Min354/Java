package week10;
import java.util.*;

public class P42_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<>();
		
		System.out.println("s.empty() => " + s.empty());
		System.out.println();
		
		s.push("1st");System.out.println("s=> " + s);
		s.push("2nd");System.out.println("s=> " + s);
		s.push("3rd");System.out.println("s=> " + s);
		System.out.println();
		
		System.out.println("s.peek=> " + s.peek());
		System.out.println("s=> " + s);
		System.out.println();
		
		System.out.println("s.pop=> " + s.pop());
		System.out.println("s=> " + s);
		System.out.println();
		
		s.push("5th");System.out.println("s=> " + s);

	}

}
