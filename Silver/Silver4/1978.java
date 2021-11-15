package Level9;

import java.util.Scanner;

public class Level9_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputNum = new int[100]; //테스트할 값들
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 테스트값 갯수
		int count = 0;//소수의 갯수
		
		for(int i=0; i<input; i++) {
			inputNum[i] = sc.nextInt();
		}
		
	
		
		for(int i=0; i<input; i++) {
			boolean Prime = true; //소수인지 아닌지 확인.
			if(inputNum[i] == 1) { //1은 소수가 아니다.
				Prime = false;
			}
			for(int na=2; na<inputNum[i]; na++) {							
				if(inputNum[i] % na == 0) {
					Prime = false;
					break;
				}				
			}
			if(Prime) {
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}
