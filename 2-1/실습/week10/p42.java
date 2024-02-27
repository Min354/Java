package week10;
//HashMap 을 이용하여 단어장 만들기

import java.util.*;

public class p42 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner scanner = new Scanner(System.in);
		String eng = null;
		
		while (true)
		{
			System.out.println("찾고 싶은 단어: ");
			 eng = scanner.next();
			if(eng.equals("exit"))
			{
				System.out.println("종료");
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println("없는 단어");
			else
				System.out.println(kor);
		}
		
		scanner.close();


	}
}
