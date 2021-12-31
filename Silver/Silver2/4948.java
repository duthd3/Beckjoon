package Level9;

import java.util.Scanner;

public class Level9_4948 {
	static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		not_prime();
		while(true) {
			
			int count =0;
			int n = sc.nextInt();
			if(n==0)
				break;
			for(int i=n+1; i<=2*n; i++) {
				if(!prime[i])
					count++;
				
			}
			System.out.println(count);
		}
	}
	static void not_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}
