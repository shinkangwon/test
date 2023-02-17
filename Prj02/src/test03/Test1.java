package test03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		String name = in.nextLine();
		System.out.println("태어난 연도");
		int bY = in.nextInt();
		in.nextLine()	;
		
		//계산
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
		String frmNow = now. format(dtf);
		
		int tY = Integer.parseInt(frmNow);
		int age = tY - bY +1 ;
		
		System.out.println("이름 : " + name);
		System.out.println("태어난 연도 : "+ bY);
		System.out.println("나이 : " + age);
		
		
		
	}
}
