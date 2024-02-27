package week10;
//HashMap에서 객체 저장

import java.util.*;
class Student{
	int id;
	String tel;
	public Student(int id, String tel)
	{
		this.id = id; this.tel = tel;
	}
	public int getId() {return id;}
	public String getTel() {return tel;}
}

public class p44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("기태", new Student(1, "1111"));
		map.put("재문", new Student(2, "2222"));
		map.put("남윤", new Student(1, "3333"));
		
		String name = null;
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			System.out.println("검색할 이름: ");
			name = scanner.nextLine();
			if(name.equals("exit"))
				break;
			
			Student student = map.get(name); //타입이다름
			if (student == null)
				System.out.println("없는 학생입니다.");
			else 
				System.out.println("id: " + student.getId() + ", tel: " + student.getTel());
			
		}
		scanner.close();

	}

}
