package week12;
import java.io.*;

//BufferedReader 사용하여 줄 단위로 읽는 것도 가능
public class P155_CountLetter {
	public static int getCount(char c, File file) throws IOException{
		int count = 0;
		
		InputStream in = new FileInputStream(file);
		int n;
		while((n = in.read()) != -1) {
			if (n==(int)c)
				count ++;
		}
		
		return count;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		int count = getCount('a', file);
		System.out.println(count);
	}
	

}
