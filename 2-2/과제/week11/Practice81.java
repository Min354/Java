package week11;
import java.io.*;
import java.util.*;

public class Practice81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("난수값이 저장된 파일 이름을 입력하세요: ");
		String name = s.next();
		
		FileReader fin = null;
		
		try {
			System.out.println("파일에서 난수를 읽어 들입니다.");
			fin = new FileReader(name);
			int c, line=0, n=0, i=0;
			
			while((c=fin.read())!=-1) {
				if(c=='\n') {
					n++;
					continue;
				}
			}
			System.out.println("난수의 개수는 모두 "+n+"개입니다.");
			
			fin.close();
			fin = new FileReader(name);
			System.out.println("입력된 난수는 다음과 같습니다.");
			while((c=fin.read())!=-1) {
				if(c=='\n' ) {
					System.out.print("\t"); i++; line++; 
					if(line %10 ==0)
						System.out.println();
					continue;
				}
				if(c=='\r') {	continue;	}
				
				int random = (int)(c-'0');
				System.out.print(random);
				i++;	
			}
				
			fin.close();
			s.close();
		}
		catch(IOException e) {
			System.err.println("cannot found");
			System.exit(1);
		}

	}

}
