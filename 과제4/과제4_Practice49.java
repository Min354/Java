package 과제4;
import java.util.*;

interface Movable{void move();}

class Shape implements Movable{
	int x, y;
	
	public Shape() {}
	public String toString() {
		return "중심좌표: (" + x + "," + y +")";
	}
	
	public int calcArea(int x, int y){
		return -1;
	}
	public void move() {
		Random random = new Random();
		this.x = random.nextInt(101);
		this.y = random.nextInt(101);
		System.out.println("--이동 후--");
	}
	static Scanner scanner = new Scanner(System.in);
	
	public void get() {
		System.out.print("도형의 X좌표를 입력하세요: ");
		this.x = scanner.nextInt();
		System.out.print("도형의 Y좌표를 입력하세요: ");
		this.y = scanner.nextInt();
	}
}

class Rectangle extends Shape implements Movable{
	double length, width, area;
	
	public Rectangle() {}
	public Rectangle(int x, int y, double length, double width) {
		this.x = super.x;
		this.y = super.y;
		this.length = length;
		this.width = width;
	}
	public String toString() {
		area = length*width;
		return "중심좌표: (" + x + "," + y +"), 가로: " + length + ", 세로: " + width + ", 면적: " + area;
	}
	
	public double calcArea(double length, double width) {
		return length*width;
	}
	public void get() {
		System.out.print("사각형의 X좌표를 입력하세요: ");
		this.x = scanner.nextInt();
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		this.y = scanner.nextInt();
		System.out.print("사각형의 가로를 입력하세요: ");
		this.length = scanner.nextDouble();
		System.out.print("사각형의 세로를 입력하세요: ");
		this.width = scanner.nextDouble();
	}
}

class Triangle extends Shape implements Movable{
	double base, height, area;
	
	public Triangle() {}
	public Triangle(int x, int y, double base, double heigth) {
		this.x = super.x;
		this.y = super.y;
		this.base = base;
		this.height = heigth;
	}
	public String toString() {
		area = base*height*0.5;
		return "중심좌표: (" + x + "," + y +"), 밑변: " + base + ", 높이: " + height + ", 면적: " + area;
	}
	
	public double calcArea(double base, double heigth) {
		return base*heigth*0.5;
	}
	public void get() {
		System.out.print("삼각형의 X좌표를 입력하세요: ");
		this.x = scanner.nextInt();
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		this.y = scanner.nextInt();
		System.out.print("삼각형의 가로를 입력하세요: ");
		this.base = scanner.nextDouble();
		System.out.print("삼각형의 세로를 입력하세요: ");
		this.height = scanner.nextDouble();
	}
}

//---------------------------------도형 클래스


public class 과제4_Practice49 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		shape.get();
		System.out.println();
		
		Rectangle rect = new Rectangle();
		rect.get();
		System.out.println();
		
		Triangle tri = new Triangle();
		tri.get();
		System.out.println();
		
		System.out.println("입력된 도형의 정보입니다");
		System.out.println(shape.toString());
		shape.move();
		System.out.println(shape.toString());
		System.out.println();
		
		System.out.println("입력된 사각형의 정보입니다");
		System.out.println(rect.toString());
		rect.move();
		System.out.println(rect.toString());
		System.out.println();
		
		System.out.println("입력된 삼각형의 정보입니다");
		System.out.println(tri.toString());
		tri.move();
		System.out.println(tri.toString());
		System.out.println();
		
	}

}
