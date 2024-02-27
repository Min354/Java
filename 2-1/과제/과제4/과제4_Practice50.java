package 과제4;
import java.util.*;

interface Movable50{void move();}
interface Drawable50{void draw();}

class Shape50 implements Movable50{
	int x, y;
	static Scanner scanner = new Scanner(System.in);
	
	//생성자
	public Shape50() {}
	public String toString() {
		return "중심좌표: (" + x + "," + y +")";
	}

	//이동, 정보 입력, 정보 출력
	public void move() {
		Random random = new Random();
		this.x = random.nextInt(101);
		this.y = random.nextInt(101);
		System.out.println("--이동 후--");
	}
	public void get() {
		System.out.print("도형의 X좌표를 입력하세요: ");
		this.x = scanner.nextInt();
		System.out.print("도형의 Y좌표를 입력하세요: ");
		this.y = scanner.nextInt();
	}
}

class Rectangle50 extends Shape50 implements Drawable50{
	double length, width, area;
	
	//생성자
	public Rectangle50() {}
	public Rectangle50(int x, int y, double length, double width) {
		this.x = super.x;
		this.y = super.y;
		this.length = length;
		this.width = width;
	}
	public String toString() {
		area = length*width;
		return "중심좌표: (" + x + "," + y +"), 가로: " + length + ", 세로: " + width + ", 면적: " + area;
	}
	
	//정보 입력, 정보 출력
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
	public void draw() {
		System.out.println("사각형, " + toString());
		move();
		System.out.println("사각형, " + toString());
		System.out.println();
	}
}

class Triangle50 extends Shape50 implements Drawable50{
	double base, height, area;
	
	//생성자
	public Triangle50() {}
	public Triangle50(int x, int y, double base, double heigth) {
		this.x = super.x;
		this.y = super.y;
		this.base = base;
		this.height = heigth;
	}
	public String toString() {
		area = base*height*0.5;
		return "중심좌표: (" + x + "," + y +"), 밑변: " + base + ", 높이: " + height + ", 면적: " + area;
	}
	
	//정보 입력, 정보 출력
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
	public void draw() {
		System.out.println("삼각형, " + toString());
		move();
		System.out.println("삼각형, " + toString());
		System.out.println();
	}
}

//---------------------------------도형 클래스


public class 과제4_Practice50 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성, 정보 입력
		Shape50 shape = new Shape50();
		shape.get();
		System.out.println();
		
		Rectangle50 rect = new Rectangle50();
		rect.get();
		System.out.println();
		
		Triangle50 tri = new Triangle50();
		tri.get();
		System.out.println();
		
		//정보 출력
		System.out.println(shape.toString());
		shape.move();
		System.out.println(shape.toString());
		System.out.println();
		
		rect.draw();
		System.out.println();
		
		tri.draw();
		System.out.println();		
	}

}


/*
 * <ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ과제4_Practice51ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ>
 * 1. 실행 결과
 * true, false, false, true, false
 * true, true, compile error, true, true
 * true, compile error, true, true, true
 * 
 * 2. 컴파일 오류가 발생하는 이유
 * Rectangle <-> Triangle은 형 변환이 불가능한 별개의 것이기 때문에 비교가 불가능하다
 */ 


