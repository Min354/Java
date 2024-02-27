package week14;
//Scanner 클래스 파일 불러오기 실습

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class p12 {

	public static void main(String[] args) {
		int n;
		try {
			//Formatter 클래스와 다르게 파일 객체를 생성해서 불러와야 한다.
			Scanner input = new Scanner(new File("numbers.txt"));
			while(input.hasNext()) {
				n = input.nextInt();
				System.out.println(n);
			}
		}
		catch(FileNotFoundException e) {
			System.err.println("cannot open");
			System.exit(1);
		}
	}

}
