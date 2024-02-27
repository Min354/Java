package week04;
import java.util.Scanner;
import java.lang.String;

public class Practice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		String ch = scanner.next();
		ch = ch.toLowerCase();
		String str = "aeiou", str1 = "abcdefghijklmnopqrstuvwxyz";
		
		
		if(str1.contains(ch)) {
			switch (str.indexOf(ch)+1) {
			case 0: 
				System.out.print("자음입니다.");  
				break;
			
			default :
				System.out.print("모음입니다."); 
				break;
			}
		}
		else
			System.out.print("영문자가 아닙니다.");
			
		scanner.close();
		

	}

}
