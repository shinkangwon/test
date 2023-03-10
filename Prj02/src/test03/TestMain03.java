package test03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestMain03 {

	public static void main(String[] args) {
		// 키보드로 입력 받는다 : 미리 만들어진 기능(부품)을 가져온다 
		//                        -라이브러리 호출
		// 부품들을 모아서 class 안에 저장해 놓음, 부품 - 함수 형태로 존재
		Scanner in = new Scanner(System.in);
		
		// 입력 : 이름 태어난연도 이메일 
		System.out.println("이름을 입력해주세요");
		String name= in.nextLine();
		System.out.println("태어난 연도:");
		int birthYear = in.nextInt();
		in.nextLine(); // enter 까지 입력받는다
		
		//process 처리
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
		String frmNow = now. format(dtf);
		
		int thisYear = Integer.parseInt (frmNow);
		int age =  thisYear - birthYear + 1;

		System.out.println("Email을 입력해주세요");
		String email = in.nextLine();
		
		// 출력 : 이름 나이 이메일
		System.out.println("이름:" + name);
		System.out.println("태어난 연도: " + birthYear);
		System.out.println("나이 : " + age  );
		System.out.println("email : " + email  );
	
	}

}
