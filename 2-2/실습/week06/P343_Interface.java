package week06;

interface PhoneInterface{
	int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** PHONE **");
	}
}

class SSPhone implements PhoneInterface{
	public void sendCall() {
		System.out.println("******");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다");
	}
	public void flash() {
		System.out.println("불이 켜졌습니다");
	}
}

public class P343_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSPhone ssp = new SSPhone();
		ssp.printLogo();
		ssp.sendCall();
		ssp.receiveCall();
		ssp.flash();

	}

}
