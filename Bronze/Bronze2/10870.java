import java.util.Scanner;

public class Level10_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int answer = fibo(input);
		System.out.println(answer);
	}
	static int fibo(int input) {
		if(input == 0 )
			return 0;
		else if(input == 1)
			return 1;
		else
			return fibo(input-1) + fibo(input-2);
	}
	

}
