package test01;

public class TestMain01 {

	public static void main(String[] args) {
		//Comment, remark 한글주석
		/* 여러줄 주석 */
		// 입력 : 이름, 출생연도, 전화번호
		String nam1 = "신강"; // 문자열 : String
		int birthYear = 1991;  // 정수 : Integer
		String tel = "123-5678-9010";
		
	    // 처리 : 나이 계산
	    int age =  2022 - birthYear + 1;
		// 출력 : 이름, 나이,       전화
		
	    System.out.println("이름:" + nam1);
	    System.out.println("태어난연도:" + birthYear);
	    System.out.println("나이:" + age) ;
	    System.out.println("전화번호:" + tel) ;

	
	} 
}

