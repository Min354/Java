package week11;
import java.util.*;
import java.io.*;

class BankAccount{
	private String owner;
	private int balance;
	
	BankAccount(){
		this.owner = "모름";
		this.balance = -1;
	}
	BankAccount(String owner, int balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	void setOwner(String o) {owner = o;}
	void setBal(int b) {balance = b;}
	
	String getOwner() {return owner;}
	int getBal() {return balance;}
	
	
	@Override
	public String toString() {
		return owner + "\t" + balance;
	}
	public void deposit(int i) {
		this.balance += i;
	}
	public void withdraw(int i) {
		this.balance -= i;
	}

	
}

public class Practice82 {
	public static Scanner s = new Scanner(System.in);
	public static ArrayList<BankAccount> bank = new ArrayList<>();
	public static String filename = null;

	public static void load() {
		filename = s.next();
		try {
			FileReader fin = new FileReader(filename);
			StringBuffer sb = new StringBuffer();
			String name="";
			Integer balance=0;
			boolean num=true;
			
			int c;
			while((c=fin.read()) != -1) {
				if(c=='\t') {
					name = sb.toString();
					sb.delete(0, sb.length());
					num = !num;
					continue;
				}
				if(c=='\n') {
					balance = Integer.parseInt(sb.toString());
					sb.delete(0, sb.length());
					bank.add(new BankAccount(name, balance));
					continue;
				}
				if(c=='\r')
					continue;
				
				if(num)
					sb.append((int)(c-'0'));
				if(!num)
					sb.append((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.err.println("File load failed");
			System.exit(1);
		}
	}
	public static void save() {
		filename = s.next();
		try {
			FileWriter fout = new FileWriter(filename);
			int i=0;
			while(i<bank.size()) {
				String line = ++i + "\t" + bank.get(i-1).toString();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}
		catch(IOException e) {
			System.err.println("File save failed");
			System.exit(1);
		}
	}
	public static void printBank() {
		System.out.println("\n현재 잔고현황입니다.");
		
		int i=0;
		System.out.println("계좌번호\t계좌주\t잔고");
		for(BankAccount ba : bank) {
			System.out.println(++i + "\t" + ba);
		}
	}
	
	public static void m1(){
		System.out.print("파일 이름을 입력하세요: ");
		load();
		
		printBank();
	}
	public static void m2() {
		System.out.print("파일 이름을 입력하세요: ");
		save();
		System.out.println("잔고현황이 성공적으로 저장되었습니다.");
	}
	public static void m3() {
		System.out.print("업데이트할 계좌번호를 입력하세요: ");
		int index = s.nextInt()-1;
		
		System.out.print("원하는 계좌 작업을 선택하세요 (1-입금/2-출금): ");
		int menu = s.nextInt();
		
		if(menu==1) {
			System.out.print("입금액을 입력하세요: ");
			int i = s.nextInt();
			bank.get(index).deposit(i);
			System.out.println("입금이 완료되었습니다.\n");
			printBank();
			return;
		}
		if(menu==2) {
			System.out.print("출금액을 입력하세요: ");
			int i = s.nextInt();
			
			if(i > bank.get(index).getBal()) {
				System.out.println("잔고 부족");
				return;
			}
			
			bank.get(index).withdraw(i);
			System.out.println("출금이 완료되었습니다.\n");
			printBank();
			return;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = -1;
		
		while(menu!=0) {
			System.out.print("원하는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무): ");
			
			menu = s.nextInt();
			switch(menu) {
			case 0:
				System.out.print("프로그램을 종료합니다.");
				break;
			case 1:
				m1();
				System.out.println();
				break;
			case 2:
				m2();
				System.out.println();
				break;
			case 3:
				m3();
				System.out.println();
				break;
				
			}
		}
		
		s.close();
	}

}

