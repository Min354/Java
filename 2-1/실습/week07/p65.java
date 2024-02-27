package week07;
//Math Class

public class p65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a= Math.PI;
		System.out.println(a);
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(a));
		
		System.out.println("행운의 번호: ");
		for(int i = 0; i <5 ; i++)
			{System.out.print((int)(Math.random()*45 + 1) +" ");}

	}

}
