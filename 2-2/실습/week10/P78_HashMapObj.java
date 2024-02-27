package week10;
import java.util.*;
class Student{
	public int id;
	public String tel;
	Student(int id, String tel){
		this.id = id;
		this.tel = tel;
	}
}

public class P78_HashMapObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> h = new HashMap<>();
		
		h.put("Kim", new Student(1, "010"));
		h.put("Hwang", new Student(2, "012"));
		h.put("Lee", new Student(3, "013"));
		
		System.out.println("HashMap size: " + h.size());
		
		Scanner s = new Scanner(System.in);
		
		Set<String> keys =h.keySet();

		
		while(true) {
			System.out.print("name?: ");
			String str = s.next();
			
			if(str.equals("exit"))
				break;
			
			Student student = h.get(str);
			if(student==null)
				System.out.println(str + " does not exist");
			else
				System.out.println("num: "+ h.get(str).id + ", tel: " + h.get(str).tel);
			
		}
		s.close();
	}

}
