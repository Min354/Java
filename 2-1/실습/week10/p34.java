package week10;
import java.util.*;

public class p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v = new Vector <Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		//iterator를 이용하여 모든 정수 출력
		Iterator <Integer> it = v.iterator();
		while(it.hasNext()) 
		{
			int n = it.next();
			System.out.println(n);
		}
		
		//Iterator 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator();   //iterator  객체는 쓸 때마다 새로 얻어와야 함!!!!!!!!!!
		while(it.hasNext())
		{
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합:" + sum);

	}

}
