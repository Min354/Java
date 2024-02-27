package week03;

import java.util.Arrays;

public class 예제18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ex = {{0,0,0,1,1,0,0,0,0,0},{0,0,1,1,0,0,0,0,0,0},{0,0,0,0,0,0,1,1,1,0,0}};
		int sum=0;
		
		for(int i=0; i<3; i++) {	//q배열 C랑 헷갈리는부분(주소값)있는데 확인해보기
			for(int j=0; j<10; j++) {
				if(ex[i][j] == 1)
					sum+=1;
			}
		}
		
		System.out.print("현재 관객 수는 " + sum + "명입니다.");
		

	}

}
