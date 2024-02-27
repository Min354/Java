package 과제4;
import java.util.Random;
import java.util.Scanner;

interface Movable52{void move();}
interface Drawable52{void draw();}

class Shape52 implements Movable52{
	int x, y;
	static Scanner scanner = new Scanner(System.in);
	
	//생성자
	public Shape52() {}
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

class Rectangle52 extends Shape52 implements Drawable52{
	double length, width, area;
	
	//생성자
	public Rectangle52() {}
	public Rectangle52(int x, int y, double length, double width) {
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

class Triangle52 extends Shape52 implements Drawable52{
	double base, height, area;
	
	//생성자
	public Triangle52() {}
	public Triangle52(int x, int y, double base, double heigth) {
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
public class 과제4_Practice52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable52[] rArray = new Movable52[2];
		
		rArray[0] = new Rectangle52(); 	//업캐스팅
		rArray[1] = new Triangle52();	//업캐스팅
		
		System.out.println(rArray[0] instanceof Rectangle52);	//true
		System.out.println(rArray[0] instanceof Triangle52);	//false  
		//-->Rectangle52 타입이 Movable52 타입으로 업캐스팅 되었음
		//-->Triangle52 타입은 Movable52 타입 기준 형변환이 불가능하므로 false 출력
		System.out.println(rArray[0] instanceof Movable52); 	//true
		System.out.println(rArray[0] instanceof Drawable52); 	//true
		
		System.out.println(rArray[1] instanceof Rectangle52);  	//false
		//-->Triangle52 타입이 Movable52 타입으로 업캐스팅 되었음
		//-->Rectangle52 타입은 Movable52 타입 기준 형변환이 불가능하므로 false 출력
		System.out.println(rArray[1] instanceof Triangle52); 	//true
		System.out.println(rArray[1] instanceof Movable52); 	//true
		System.out.println(rArray[1] instanceof Drawable52); 	//true
		
	}

}
