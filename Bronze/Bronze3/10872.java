package Level10;

import java.util.Scanner;

public class Level10_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(factorial(input));
		}
	static int factorial(int input) {
		if(input==0)
			return 1;
		else
			return input*factorial(input-1);
	}
}


