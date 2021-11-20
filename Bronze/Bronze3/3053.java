package Level9;

import java.util.Scanner;

public class Level9_3053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		double circle = r*r*Math.PI;
		double Tcircle = (2*r)*(r);
		
		System.out.println(Math.round(circle*1000000)/1000000.00000);
		System.out.println(Math.round(Tcircle*1000000)/1000000.00000);
	}

}
