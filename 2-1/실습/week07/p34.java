package week07;
//equals()을 오버라이딩하는 실습 - Point 클래스에 작성
//Point 클래스는 p32에 있다

public class p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3, 4);
		
		if(a==b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equals b");
		if(a.equals(c))
			System.out.println("a is equals c");

	}

}
