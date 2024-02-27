package week09;
import java.util.*;

public class Practice56 {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice56A.main(args);
		Practice56B.main(args);
		Practice56C.main(args);
		Practice56D.main(args);
	}
}

class Practice56A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = getInput();

		for(int i=0; i<iArray.length; i++) 
			iArray[i] = i*20;
		
		for(int x: iArray)
			System.out.print(x + "\t");
		System.out.println();
		
	}
	public static int[] getInput() {
		int num=0;
		
		System.out.print("A 배열의 크기를 입력하세요: ");
		String str = Practice56.s.next();
		
		try {
			num = Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		}
		int[]rslt = makeArray(num);
		return rslt;
	}
	public static int[] makeArray(int size){
		int[]rslt= new int[0];
		try {
			rslt = new int[size];
		}
		catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
		}
		return rslt;
	} 
}

class Practice56B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = getInput();

		
		for(int i=0; i<iArray.length; i++) 
			iArray[i] = i*20;
		
		for(int x: iArray)
			System.out.print(x + "\t");
		System.out.println();
		
	}
	public static int[] getInput() {
		int num=0;
		int[]rslt= new int[0];
		
		System.out.print("B 배열의 크기를 입력하세요: ");
		String str = Practice56.s.next();
		
		try {
			num = Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		}
		try {
			rslt = makeArray(num);
		}
		catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
		}
		
		return rslt;
	}
	public static int[] makeArray(int size) throws NegativeArraySizeException{
		int[] rslt = new int[size];
		return rslt;
	} 
}

class Practice56C {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]iArray= new int[0];
		try{
			iArray = getInput();
		}
		catch(NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		}

		for(int i=0; i<iArray.length; i++) 
			iArray[i] = i*20;
		
		for(int x: iArray)
			System.out.print(x + "\t");
		System.out.println();
		
	}
	public static int[] getInput() throws NumberFormatException{		
		System.out.print("C 배열의 크기를 입력하세요: ");
		String str = Practice56.s.next();
		
		int num = Integer.parseInt(str);
		int[] rslt = makeArray(num);
		return rslt;
	}
	public static int[] makeArray(int size) {
		int[]rslt= new int[0];
		try {
			rslt = new int[size];
		}
		catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
		}
		return rslt;
	} 
}


class Practice56D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]iArray= new int[0];
		try{
			iArray = getInput();
		}
		catch(NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
		}

		
		for(int i=0; i<iArray.length; i++) 
			iArray[i] = i*20;
		
		for(int x: iArray)
			System.out.print(x + "\t");
		System.out.println();
		
	}
	public static int[] getInput() throws NumberFormatException, NegativeArraySizeException {
		
		
		System.out.print("D 배열의 크기를 입력하세요: ");
		String str = Practice56.s.next();
		
		int num = Integer.parseInt(str);
		int []rslt = makeArray(num);
		return rslt;
	}
	public static int[] makeArray(int size) throws NegativeArraySizeException{
		int[] rslt = new int[size];
		return rslt;
	} 
}


