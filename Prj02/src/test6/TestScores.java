package test6;

import java.util.Scanner;

public class TestScores {
/*
사나,70,80,90
모모,0,70,100
쯔위,70,90,90
정연,80,90,70
*/	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		// 입력 : 이름 국어 영어 수학
		
		System.out.println("입력:이름,국어,영어,수학");
		String  line  =  in.nextLine();
		String [] s  = line.split(","); //s[0]="사나", s[1]="70",s[2]="80",s[3]="90"
		String name          = s[0];  
		int    kor			 = Integer.parseInt(s[1].trim());
		int    eng			 = Integer.parseInt(s[2].trim());
		int    mat		     = Integer.parseInt(s[3].trim());

		//계산
		// 총점 : 국어 + 영어 + 수학
		// 평균 : 총점 / 3
		// 평균 소수이하 2자리로 반올림하여
		
		int    tot = 0;
		tot                  = kor+eng+mat;
		System.out.println(tot);
		double avg = (double) tot / 3.0;
		
		char   grade = ' ';
		
		if(avg>=90 && avg<=100) {
			grade = 'A';
		}else {
			if(avg>=80 && avg<90) {
				grade = 'B';
			}else {
				if(avg>=70 && avg<80) {
					grade = 'C';
				}else {
					if(avg>=60 && avg<70) {
						grade = 'D';
					}else {
						if(avg>=0 && avg<60) {
							grade = 'F';
						}else {
							grade = ' ';
						}
					}
						
				}
			}
		}
			
		
		// 출력 : 이름 총점 평균 학점
		System.out.println("이름 총점 평균 학점");
		String fmt = "%s %d %.2f %c\n" ;
		String msg = String.format (fmt, name, tot, avg, grade);
		System.out.print(msg);
	}

}
