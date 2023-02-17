package test6;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("연도를 입력해주세요(0~12)");
		int year = in.nextInt(); 
		int p = year % 12 ;
		String x = "";	
		if(p == 5) {
			x = "소" ;
		}else 
			if(p == 6) {
				x = "호랑이";
			}else {
				if(p == 7) {
					x = "토끼";
				}else {
					if(p == 8) {
						x = "용";
					}else {
						if(p == 9) {
							x = "뱀";
						}else {
							if(p == 10) {
								x = "말";
							}else {
								if(p == 11) {
									x = "양";
								}else {
									if(p == 1) {
										x = "원숭이";
									}else {
										if(p == 2){
											x = "개";
										}else {
											if(p == 3) {
												x = "돼지";
											}else {
												if(p == 4) {
													x = "쥐";
												}else { 
													x = "다시입력해주세요" ; 
												}
												}
											}
											}
										}
										}
									}
									}
								}
								}
		System.out.println(x);
                              }
							
						
					
					
				
				
				
		
	
	
	}


