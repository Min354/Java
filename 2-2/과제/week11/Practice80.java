package week11;
import java.io.*;
import java.util.*;

public class Practice80 {

	public static Integer[] ran(int n, int bound) {
		Integer [] random = new Integer [n];
		int line=0;
		
		for(int i=0; i<n; i++) {
			random[i] = ((int)(Math.random() * (bound+1)));
			System.out.print(random[i] + "\t");
			if(++line%10==0) 
				System.out.println();
		}
		
		return random;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		int n = s.nextInt();
		
		System.out.print("난수 값의 범위를 설정하세요: ");
		int bound = s.nextInt();
		
		System.out.println("생성된 난수는 다음과 같습니다. ");
		Integer [] random = ran(n, bound);
		System.out.println();
		
		s.nextLine();
		System.out.print("난수 값을 저장할 파일 이름을 입력하세요: ");
		String str = new String(s.nextLine());
		try {
			FileWriter fout = new FileWriter(str);
			
			for(int i=0; i<n; i++) {
				fout.write(random[i].toString(), 0, random[i].toString().length()); //깨짐
				fout.write("\r\n", 0, 2);
			}
			
			System.out.print("파일 " + str + "에 난수값이 저장되었습니다.");
			
			fout.close();
			s.close();
		}
		catch(IOException e) {
			System.err.println("cannot found");
			System.exit(1);
		}
		
		
		
	}

}
