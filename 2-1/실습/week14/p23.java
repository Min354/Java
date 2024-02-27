package week14;
import java.io.*;

public class p23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fout = new FileWriter("text.txt");
			for(int i = 0; i<10; i++)
				fout.write('0'+i);	//'0' 안 쓰면 깨져서 나옴(i가 문자로 자동 형변환이 되지 않으므로)
			fout.close();
		}
		catch(IOException e) {
			System.out.println("IO error");
		}
	}
}
