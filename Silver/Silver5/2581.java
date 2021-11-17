package Level9;

import java.util.Scanner;

public class Level9_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int finish = sc.nextInt();
		
		
		int sum = 0; //소수들의 합
		int min = 100001; //소수들중 최솟값
		
		for(int i=start; i<=finish; i++) {
			boolean prime = true; //소수인지 확인
			if(i==1) {
				prime=false;//1은 소수가 아니다.
			}
			for(int divide=2; divide<i; divide++) {
				if(i%divide==0) {
					prime = false;
				}
			}
			if(prime) {
				sum+=i;
				if(i<min)
					min=i;
			}
			
		}
		if(sum==0) {
			System.out.println(-1);
		}else {
		System.out.println(sum);
		System.out.println(min);
		}
	}

}
