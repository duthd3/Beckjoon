package Bronze4;

import java.util.Scanner;

public class Bronze4_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt(); //고정비용
		long b = sc.nextInt(); //가변비용(한대기준)
		long c = sc.nextInt(); //노트북 가격
	
		if(b>=c)
			System.out.println(-1);
		else {
			System.out.println(a/(c-b)+1);
		}
	}
}
