package week11;
import java.util.*;
import java.io.*;

public class P101_Formatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Formatter output = new Formatter("numbers.txt");
			for(int i=0; i<10; i++)
				output.format("%d\n", i);
			output.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("cannot found");
			System.exit(1);
		}

	}

}
