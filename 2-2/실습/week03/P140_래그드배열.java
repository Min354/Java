package week03;

public class P140_래그드배열 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] ragged = new int[3][];
		
		for(int i=0; i<ragged.length; i++) {
			ragged[i] = new int [i+1];
		}
		
		for(int i=0; i<ragged.length; i++) {
			for(int j=0; j<ragged[i].length; j++) {
				ragged[i][j] = j;
				System.out.print(ragged[i][j] + " ");
			}
			System.out.println();
		}

	}

}
