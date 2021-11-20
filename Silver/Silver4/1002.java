package Level9;

import java.util.Scanner;

public class Level9_1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] dot = new int[6];
		int num = sc.nextInt(); //반복 횟수
		
		for(int i=0; i<num; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			int result = distance(x1, y1, x2, y2, r1, r2);
			System.out.println(result);
		}

	}
	public static int distance(int x1, int y1, int x2, int y2, int r1, int r2) {
		int distancePow = (int)Math.pow(Math.abs(x1-x2),2) + (int)Math.pow(Math.abs(y1-y2),2);
		if(x1==x2&&y1==y2&&r1==r2)
			return -1;
		else if(distancePow==Math.pow(r1+r2,2)||distancePow==Math.pow(Math.abs(r1-r2),2))
			return 1;
		else if(distancePow>Math.pow(r1+r2, 2)||distancePow<Math.pow(Math.abs(r1-r2),2)) 
			return 0;
		else
			return 2;
			
		
	}
}
