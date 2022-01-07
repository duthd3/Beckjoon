package Level11;

import java.util.Scanner;

public class Level11_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i=1; i<input; i++) {
			int sum = 0;
			int backman = 0;
			int sipman = 0;
			int man = 0;
			int chun = 0;
			int back = 0;
			int sip = 0;
			int il = 0;
			backman = i/1000000;
			sipman = (i%1000000)/100000;
			man = (i%100000)/10000;
			chun = (i%10000)/1000;
			back = (i%1000)/100;
			sip = (i%100)/10;
			il = (i%10);
			sum = i+backman+sipman+man+chun+back+sip+il;		
			if(sum == input) {
				System.out.println(i);
				return;
			}
			
		}
		System.out.println(0);
		
		
		
		
		
		
		
	}

}
