package Level9;

import java.util.Scanner;

public class Level9_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //현재 위치의 x좌표
		int y = sc.nextInt(); //현재 위치의 y좌표
		int w = sc.nextInt(); //직사각형 오른쪽 끝 x좌표
		int h = sc.nextInt(); //직사각형 오른쪽 끝 y좌표
		int[] len = new int[4]; //동서남북 방향의 거리 저장
		
		//**가로로 짧은지 세로로 짧은지 알아낸다음 더 짧은 거리 출력(4가지경우 동서남북) **
		//1.동쪽방향의 거리
		 len[0] = w-x;
		//2.서쪽방향의 거리
		 len[1] = x;
		//3.북쪽방향의 거리
		 len[2] = h-y;
		//4.남쪽방향의 거리
		 len[3] = y;
		 
		 int min = 1000;
		 for(int i=0; i<4; i++) {
			 if(len[i]<min)
				 min = len[i];
		 }
		 System.out.println(min);
		
		
		
	}

}
