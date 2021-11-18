package Level9;

import java.util.Scanner;

public class Level9_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		if(input == 1) {
			
		}else {
		for(int j=2; j<10000000; j++) {	
			for(int i=2; i<10000000; i++) {
			
				if(input % i == 0) {
					input = input / i;
					System.out.println(i);
					break;
					
					}
				}
			if(input == 1) {
				break;
			}
			}
		}
		
		
		
		
		
	}
}
