package week10;
//Collections 클래스

import java.util.*;


public class p49 {
	static void printList(LinkedList<String> l) {
		Iterator <String> iterator = l.iterator();
		
		while(iterator.hasNext())
		{
			String e = iterator.next();
			String seperator;
			if(iterator.hasNext())
				seperator = "-->";
			else
				seperator = "\n";
			System.out.print(e + seperator);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		
		//하다말았따
		

	}

}
