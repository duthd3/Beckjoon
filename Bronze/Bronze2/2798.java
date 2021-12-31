package Level11;

import java.util.Scanner;

public class Level11_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //카드의 개수
		int M = sc.nextInt(); //딜러가 외치는 숫자
		int[] card = new int[N];
		
		for(int i=0; i<N; i++) {
			card[i] = sc.nextInt();
			
		}
		int max = 1;
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k = j+1; k<N; k++) {
					int sum = card[i] + card[j] + card[k];
					if(sum<=M && sum>max )
						max=sum;
				}
			}
		}
		System.out.println(max);
		
	}

}
