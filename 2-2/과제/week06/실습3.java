package week06;
import java.util.Random;

class Dice{
	int face, dicenum;
	Random random = new Random();
	
	Dice(){	face = 0; }
	Dice(int dicenum){ face = 0; this.dicenum = dicenum; }
	
	public void roll(){
		face = random.nextInt(6)+1;
	}
	public int getValue() {
		return face;
	}
	public void setValue(int face) {
		this.face = face;																																												
	}
	public void showFace() {
		System.out.print("주사위" + dicenum + "= " + face + " ");
	}
}

public class 실습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice1 = new Dice(1);
		Dice dice2 = new Dice(2);
		int [] targetNum = new int [2];
		targetNum[0]=1; targetNum[1]=1;	
		int i=0;
		
		while(dice1.getValue() != targetNum[0] || dice2.getValue() != targetNum[1]) {
			dice1.roll(); dice1.showFace();
			dice2.roll(); dice2.showFace();
			System.out.println();
			i++;
		}
		System.out.println("(" + targetNum[0] + ", " + targetNum[1] + ")이 나오는데 걸린 횟수= " + i);
	}

}
