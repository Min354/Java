package week10;
import java.util.*;

class Point2{
	int x, y;
	Point2 (int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		
		Point2 p = (Point2) obj;
		return (x == p.x && y == p.y);
	}
	
}

public class P54_VectorPointEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point2> p = new Vector<>();
		
		p.add(new Point2(1,2));
		p.add(new Point2(3,4));
		p.add(new Point2(5,6));
		
		System.out.println("contains (1, 2)? : " + p.contains(new Point2(1,2)));
		

	}

}
