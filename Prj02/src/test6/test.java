package test6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		System.out.println("이름  ");
		String name= in.nextLine();
		System.out.println("이름 : " + name);
		System.out.println("출생연도를 입력 ");
		int birthYear = in.nextInt();
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
		String frmNow = now. format(dtf);
		
		int thisYear = Integer.parseInt (frmNow);
		int age = 0;
		age =  thisYear - birthYear + 1;
		System.out.println("나이 : " + age);
		if (age >= 19 ) {
			System.out.println("성인");}
		else{
			System.out.println("미성년자");
		}

	}

	

}
