package week10;

import java.util.Vector;

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


public class p21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		System.out.println("contains (-5, 10)? : " + v.contains(new Point(-5, 20)));

	}

}
