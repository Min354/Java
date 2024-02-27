package week06;

class BankAccount{
	private String owner;
	private int accountNumber;
	private int balance;
	
	BankAccount(){ owner = ""; accountNumber = 0; balance=0; }
	BankAccount(int balance){ this.balance = balance; }
	
	public void deposit(int m) {
		balance += m;
	}
	public void withdraw(int m) {
		balance -= m;
	}
	public void printBalance() {
		System.out.println("현재 잔액은 " + balance + "입니다.");
	}
}

public class 실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount(10000);
		b.printBalance();
		b.withdraw(8000);
		b.printBalance();
	}

}
