package test6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test2 {


	//함수 : function
	public static void line(){
		System.out.println("=================");
	}
	
	public static void main (String [] args) {
	Scanner in  = new Scanner(System.in);
	
	line();
	System.out.println("이름:");
	String name          = in.nextLine();
	System.out.println("태어난연도:");
	int birthYear        = in.nextInt();
	// 처리
	
	
	Date now             = Calendar.getInstance().getTime();
	//SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	String		  fmtNow = sdf.format(now);
	//System.out.println(fmtNow);
	int  thisYear        = Integer.parseInt(fmtNow);  
	int age              = thisYear - birthYear + 1;
	
	boolean isAdult = false;
	if (age >=19 ) {
		isAdult = true;
	}
	else {
		isAdult = false;
	}
			
			
	// 출력
	line();
	System.out.println("이름 :" +       name);
	System.out.println("태어난 연도:" + birthYear);
	System.out.println("나이 :" +       age);
	System.out.println("성년 :" +       isAdult );
	
	

	
	}
}
