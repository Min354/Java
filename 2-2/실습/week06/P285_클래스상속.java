package week06;

class Point {
	private int x, y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showpoint() {
		System.out.print("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorpoint() {
		System.out.print(color);
		showpoint();
	}
	
}

public class P285_클래스상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.set(1, 2);
		p.showpoint();
		System.out.println();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorpoint();
	}

}
