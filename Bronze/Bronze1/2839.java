package Level8;

import java.util.Scanner;

public class Level8_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//N킬로 이하 인데, 5킬로를 최대한 많이 사용하고 그다음 5킬로 안되면 3킬로 쓰면돼
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N킬로그램
		
		if(N==4 || N ==7) {
			System.out.println(-1);
		}
		else if(N%5 == 0) {
			System.out.println(N/5);
		}
		else if(N%5==1 || N%5==3) {
			System.out.println(N/5+1);
		}
		else if(N%5==2 || N%5==4) {
			System.out.println(N/5+2);
		}
		
			
		
	}

}
