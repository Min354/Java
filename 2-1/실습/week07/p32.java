package week07;
//toString()을 오버라이딩하는 실습 - Point 클래스에 작성

class Point{
	private int x, y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	//toString()을 오버라이딩
	public boolean equals(Object obj)
	{
		Point p = (Point) obj;
		if(x==p.x && y == p.y) return true;
		else return false;
	}
	//equals()을 오버라이딩
}

public class p32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p); //p.toString()으로 자동변환
		System.out.println(p + "입니다.");  //p.toString()으로 자동변환
	}
}