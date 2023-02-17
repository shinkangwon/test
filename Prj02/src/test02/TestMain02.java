package test02;

public class TestMain02 {

	public static void main(String[] args) {
		int num1 = 123;
		System.out.println(num1);
		int num2 = 1234567890; //int -21억~ 21억까지
		System.out.println(num2);
		//int num3 = 123456789012312; 
		// int out of range (범위를 벗어남)
		//System.out.println(num3);
		long num4 = 12341132123123L;
		System.out.println(num4);
		
		// cast : 강제 형변환 (int) 
		int num6 = (int) num4; // data 손신발생 할수있다
		System.out.println(num6);
		
		// 실수 : 소수점 있는 숫자
		double val1 = 0.1;
		double val2 = 0.2;
		double val3;
		val3 = val1 + val2;
		System.out.println(val3);
		
		float f = 0.123456789f;
		System.out.println(f);
		
		boolean b1 = false;
		b1 = 3 > 1;
		System.out.println(b1);
		//           int   double
 		boolean b2 = (4 == 4.0); //자동형변환 int->double변환
		System.out.println(b2);
		
		// 문자 char
		char ch1 = 'A';
		System.out.println(ch1);
		char ch2 = 0x41;
		System.out.println(ch2);
		char ch3 = 65;
		System.out.println(ch3);
		
		String s1 = "Hello \"홍길동\" World";
		System.out.println(s1);	
		
		String path = "D:\\ws\\java\\Prj02\\src\\test02\\number1.txt";
		System.out.println(path);

		String snum1 = "36.65";
		String snum2 = "0.5";
		double result1 = Double.parseDouble(snum1);
	    //문자열 ->Double
		double result2 = Double.parseDouble(snum2);
		System.out.println(snum1 + snum2);
		String result =String.valueOf(result1 + result2);
		System.out.println(result);
		
		
		
		
	}

}
