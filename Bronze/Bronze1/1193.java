package Level8;

import java.util.Scanner;

public class Level8_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //몇번째 인지?
		//input이 몇번째 조인지?
		int cross_count=1;//대각선의 칸 개수
		int prev_cross_count=0;//이전 대각선의 칸 수의누적 
		while(true) {
			//직전 대각선누적합 + 해당 대각선의 개수
			int count = 0;//해당 대각선에서 몇번째인지?
			int bunja = 0;
			int bunmo = 0;
			if(input<= prev_cross_count + cross_count) {
				if(cross_count%2==1) {//cross_count가 홀수라면(아래>위)
					count = input - prev_cross_count -1;
					bunja = cross_count-count;
					bunmo = 1+count;
					System.out.println(bunja + "/" + bunmo);
					break;
				}
				else {//cross_count가 짝수라면(위>아래)
					count  = input - prev_cross_count -1;
					bunja = 1+count;
					bunmo = cross_count-count;
					System.out.println(bunja + "/" + bunmo);
					break;
					
				}
					
			}
			prev_cross_count += cross_count;
			cross_count++;
		}
	}

}
