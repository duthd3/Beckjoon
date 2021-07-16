package Bronze5;

import java.util.Scanner;

public class Bronze5_2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int sum = (a*a)+(b*b)+(c*c)+(d*d)+(e*e);
		int result = sum%10;
		System.out.println(result);
	}

}
