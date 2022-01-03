package Level11;

import java.util.Scanner;

public class Level11_1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int count = 1;
		int num = 666;
		
		while(count != input) {
			num++;
			
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
	

}
