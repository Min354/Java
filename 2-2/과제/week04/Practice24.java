package week04;

public class Practice24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
		
		for(int n=1 ; n<101; j++) {
			if(j%5 == 0) {
				System.out.print(n  + "\n");
				n += 3;	
				continue;
			}
			
			System.out.print(n  + "\t");
			n += 3;		
		}
		
		System.out.println("\n");
		int n=1;
		j=1;
		
		while(n<101) {
			if(j%5 == 0) {
				System.out.print(n  + "\n");
				n += 3;	
				j++;
				continue;
			}
			
			System.out.print(n  + "\t");
			n += 3;
			j++;
		}

	}

}
