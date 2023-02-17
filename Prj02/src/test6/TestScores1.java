package test6;

import java.util.Scanner;
import java.util.Random;


public class TestScores1 {

	public static void main(String[] args) {

		//입력
	Scanner in = new Scanner(System.in);
	System.out.println("가위바위보를 시작합니다");
	System.out.println("1=바위 2=가위 3=보");
	int com;
	int user= in.nextInt();
	
	Random r =new Random(); 
	com = r.nextInt(3)+1;		
	System.out.println(com);
	if(1 == user) {
		if(1 == com) {
			System.out.println("비겼습니다");
		}else {
			if(2 == com) {
				System.out.println("졌습니다");
			}else{
				if(3 == com) {
					System.out.println("이겼습니다");
				}else {
					
				}
				
			}
		}
			
	}
	if(2 == user) {
		if(2 == com) {
			System.out.println("졌습니다");
		}else {
			if(3 == com) {
				System.out.println("비겼습니다");
			}else{
				if(1 == com) {
					System.out.println("이겼습니다");
				}
				
			}
		}
			
	}
	if(3 == user) {
		if(3 == com) {
			System.out.println("이겼습니다");
		}else {
			if(1 == com) {
				System.out.println("짐겼습니다");
			}else{
				if(2 == com) {
					System.out.println("비겼습니다");
				}
				
			}
		}
			
	}
	//계산
	
	//if(a == a) {
		
	}

	
	
	
	//출력
	
	
}



