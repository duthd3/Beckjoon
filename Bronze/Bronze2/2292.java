package Level7;

import java.util.Scanner;

public class Level7_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 1;
		int range = 2;
		
		if(n==1) {
			System.out.println(1);
		}
		
		else {
			while(range<=n) {
				range = range +(6*count);
				count++;
			}
			System.out.println(count);
		}
		
	}

}
