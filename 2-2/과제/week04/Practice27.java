package week04;

public class Practice27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			for(int j=2; j<6; j++) {
				System.out.printf("%d * %d = %d\t" , j, i, i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<10; i++) {
			for(int j=6; j<10; j++) {
				System.out.printf("%d * %d = %d\t" , j, i, i*j);
			}
			System.out.println();
		}
		

	}

}
