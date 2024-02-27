package 과제4;
import java.util.Random;
import java.util.Scanner;

interface Movable53{void move();}
interface Drawable53{void draw();}

class Shape53 implements Movable53{
	int x, y;

	//생성자
	public Shape53() {}
	public Shape53(int x, int y) {this.x=x; this.y=y;}
	public String toString() {
		return "도형, 중심좌표: (" + this.x + "," + this.y +")";
	}

	//이동
	public void move() {
		Random random = new Random();
		this.x = random.nextInt(101);
		this.y = random.nextInt(101);
	}

}

class Rectangle53 extends Shape53 implements Drawable53{
	double length, width, area;
	
	//생성자
	public Rectangle53() {}
	public Rectangle53(int x, int y, double length, double width) {
		this.x = super.x;
		this.y = super.y;
		this.length = length;
		this.width = width;
	}
	public String toString() {
		area = length*width;
		return "사각형, 중심좌표: (" + x + "," + y +"), 가로: " + length + ", 세로: " + width + ", 면적: " + area;
	}
	
	//정보 출력
	public void draw() {
		move();
		System.out.println(toString());
	}
}

class Triangle53 extends Shape53 implements Drawable53{
	double base, height, area;
	
	//생성자
	public Triangle53() {}
	public Triangle53(int x, int y, double base, double heigth) {
		this.x = super.x;
		this.y = super.y;
		this.base = base;
		this.height = heigth;
	}
	public String toString() {
		area = base*height*0.5;
		return "삼각형, 중심좌표: (" + x + "," + y +"), 밑변: " + base + ", 높이: " + height + ", 면적: " + area;
	}
	
	//정보 출력
	public void draw() {
		move();
		System.out.println(toString());
	}
}

//---------------------------------도형 클래스
public class 과제4_Practice53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//객체 선언
		Shape53[] shape = new Shape53[3];
		shape[0] = new Shape53();
		shape[1] = new Rectangle53();
		shape[2] = new Triangle53();
		
		//shape[0] 정보 입력, 객체 생성
		System.out.print("도형의 X좌표를 입력하세요: ");
		shape[0].x = scanner.nextInt();
		System.out.print("도형의 Y좌표를 입력하세요: ");
		shape[0].y = scanner.nextInt();
		System.out.println();
		shape[0] = new Shape53(shape[0].x, shape[0].y);
		
		//shape[1] 정보 입력, 객체 생성
		Rectangle53 r = (Rectangle53)shape[1];
		System.out.print("사각형의 X좌표를 입력하세요: ");
		r.x = scanner.nextInt();
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		r.y = scanner.nextInt();
		System.out.print("사각형의 가로를 입력하세요: ");
		r.length = scanner.nextDouble();
		System.out.print("사각형의 세로를 입력하세요: ");
		r.width = scanner.nextDouble();
		System.out.println();
		shape[1] = new Rectangle53(r.x, r.y, r.length, r.width);
		
		
		//shape[2] 정보 입력, 객체 생성
		Triangle53 t = (Triangle53)shape[2]; 
		System.out.print("삼각형의 X좌표를 입력하세요: ");
		t.x = scanner.nextInt();
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		t.y = scanner.nextInt();
		System.out.print("삼각형의 가로를 입력하세요: ");
		t.base = scanner.nextDouble();
		System.out.print("삼각형의 세로를 입력하세요: ");
		t.height = scanner.nextDouble();
		System.out.println();
		shape[2] = new Triangle53(t.x, t.y, t.base, t.height);
		
		
		//toString() 호출
		System.out.printf("입력된 정보입니다.\n");
		System.out.println("1: " + shape[0].toString());
		System.out.println("2: " + r.toString());
		System.out.println("3: " + t.toString());
		
		System.out.printf("\n-- 도형들을 이동합니다 --\n");
		
		shape[0].move();
		System.out.println(shape[0].toString());
		r.draw();
		t.draw();
				
		scanner.close();
	}

}
