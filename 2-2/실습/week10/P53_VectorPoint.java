package week10;
import java.util.*;

class Point{
	int x, y;
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}

public class P53_VectorPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> p = new Vector<>();
		
		p.add(new Point(1,2));
		p.add(new Point(3,4));
		p.add(new Point(5,6));
		
		p.remove(1);
		
		for(int i=0; i<p.size(); i++)
			System.out.println(p.elementAt(i));
		

	}

}
