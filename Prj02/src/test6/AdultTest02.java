package test6;

import java.util.Scanner;

public class AdultTest02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("연도를 입력하세요");	
		
		int      year = 2022;
		int      na   = year % 12;
		String ddi    = "";
		
		if (na == 0) {
			ddi = "원숭이";
		}else{
			if(na == 1) {
				ddi = "닭";
		}else{
			if(na == 2) {
				ddi = "개";	
			}else {
				if(na ==3) {
					ddi = "돼지";				
			}else {
				if(na==4) {
					ddi = "쥐";
				}else {
					if(na==5) {
						ddi = "소";
					}else {
						if(na==6) {
							ddi = "호랑이";
						}else {
							if(na==7) {
								ddi = "토끼";
							}else {
								if(na==8) {
									ddi = "용";
								}else {
									if(na==9) {
										ddi = "뱀";
									}else {
										if(na==10) {
											ddi = "말";
										}else {
											if(na==11) {
												ddi = "양";
											
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
		}
		}
		System.out.println(ddi);
	}

	
}

					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					