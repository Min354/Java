package week06;

class car{
	String color = "";
	int gear;
	int speed;
	car(){}
	car(int gear, int speed){
		this.gear = gear; this.speed = speed;
	}
	public void changeGear(int gear){
		this.gear = gear;
	}
	public void speedUp(int sU){
		this.speed += sU;
	}
	public void speedDown(int sD) {
		this.speed -= sD;
	}
	public void printCar() {
		System.out.print("Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]");
	}
}

public class 실습1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car(1, 10);
		c.printCar();
	}

}
