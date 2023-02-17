package test6;

import java.util.Random;
import java.util.Scanner;

public class Rock2 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		// 가위, 바위, 보 
		//컴이 입력한경우
		//System.out.println("A. 컴퓨터 (1.가위, 2.바위, 3.보):");
		//int  val1 = in.nextInt();
		//컴퓨터가 자동선택하게 (1,2,3)
		Random  rnd  = new Random();
		int     val1 = rnd.nextInt(3)+1;
		System.out.println("컴퓨터의 선택:" + val1);
		
		System.out.println("B. 유저   (1.가위, 2.바위, 3.보):");
		int  val2 = in.nextInt();
		
		
		String result = "";
		switch ( val1 ) {
		case 1:
			switch(val2) {
			case 1: result = "비김"; break;
			case 2: result = "이김"; break;
			case 3: result = "짐"; break;
			}
			break;
		case 2: 
			switch(val2) {
			case 1: result = "짐"; break;
			case 2: result = "비김"; break;
			case 3: result = "이김"; break;
			}
			break;
		case 3:
			switch(val2) {
			case 1: result = "이김"; break;
			case 2: result = "짐"; break;
			case 3: result = "비김"; break;
			}
			break;
		}// A 1. 가위
		
		System.out.println(result);
	}
}