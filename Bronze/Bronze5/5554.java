package Bronze5;

import java.util.Scanner;

public class Bronze5_5554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1+num2+num3+num4;
		
		int result = sum/60;
		int sec = sum%60;
		
		System.out.println(result);
		System.out.println(sec);
	}

}

