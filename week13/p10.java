package week13;
import java.util.Formatter;
import java.io.FileNotFoundException;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				Formatter output = new Formatter("numbers.txt"); //파일 이름을 빼면 catch해서 cannot open 출력
				for(int i=0; i<10; i++) 
				{
					output.format("%d\r\n", i);
				}
				output.close();
			}
		catch(FileNotFoundException e){
			System.err.println("cannot open");
			System.exit(1);
		}

	}

}
