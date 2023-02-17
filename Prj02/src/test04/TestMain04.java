package test04;

import java.util.Scanner;

public class TestMain04 {

	public static void main(String[] args) {
		// 입력 : 키보드로 두 수를 입력받아 계산하여 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1:");
		int    num1 =sc.nextInt();
		
		System.out.println("숫자2:");
		int    num2 =sc.nextInt();
		if( num2  == 0 ) {
			System.out.println("숫자2는 0 이 될 수 없습니다");
			System.exit(-1); // 프로그램 강제 종료" 
		}
		
		// 계산
		int result     =  num1 + num2;
		int result1    =  num1 - num2;
		long result2   =  num1 * num2;
		int result3    =  num1 / num2;
		int result4    =  num1 % num2;
		double result5 =  num1 / num2;
		double result6 = (double)  num1 / (double)  num2;
		
		
		// 출력 + 
		System.out.println("결과 더하기:" + result);
		System.out.println("결과 빼기  :" + result1);
		System.out.println("결과 곱하기:" + result2);
		System.out.println("결과 나누기:" + result3);
		System.out.println("결과 나머지:" + result4);
		System.out.println("결과 나누기2:" + result5);
		System.out.println("결과 나누기3:" + result6);

	
	}

}
