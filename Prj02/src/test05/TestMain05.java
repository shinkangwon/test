package test05;

class TestMain05 {

	public static void main(String[] args) {
		
		int  v1, v2;	 //변수 : variable == instance
		 v1 = 7; v2 = 2; 
		int v;
		
		v = v1 + v2; 
		System.out.println("v1 + v2 = " + v);
		v = v1 - v2; 
		System.out.println("v1 - v2 = " + v);
		v = v1 * v2; 
		System.out.println("v1 * v2 = " + v);
		v = v1 / v2; 
		System.out.println("v1 / v2 = " + v);
		
		double result = 0.0;
		result = (double)v1 / (double)v2;
		System.out.println("v1 / v2 = " + result );
		
		int result2 = v1 * v1 * v1;
		System.out.println("v1 의 3승 = " + result2);
		
		// x의 y승 :double Math.pow(double x, double y) 
		double result3 = Math.pow((double)v2, 3.0);
		System.out.println("v2 의 3승 = " + (int) result3);
		
		// sin 30도        : 0.5 단위 : degree
		// sin 30 radian         단위 : redian () 
		double result4 =  Math.sin(30 * Math.PI / 180);
		System.out.println("sin 30 도 = " + result4);
		
		System.out.printf("%30.3f", result4); 
		//전체 10자리에 소수이하 3자리로 반올림하여 출력
		// %d     : decimal         - 10진수 출력
		// %o     : ocat decimal    - 8진수  출력
		// %x, %X : hexa decimal	- 16진수 출력
		// %f     : float, duble
		// %e     : 지수 exponent	- 10의3승 ==  e
		// %c     : char 
		// %s     : String
		
		int num1 = 0x3cf;
		System.out.printf("\n%d %o %x", num1,  num1, num1);
		
		int num2 = 65;
		System.out.printf("\n%d %c %s", num2, num2, num2);
		
		char ch1 = '신';
		System.out.printf("\n%#x %c ", (int) ch1, ch1);		
	
		char ch2 = ch1;
		System.out.printf("\n%X %c ", (int) ch2, ch2);		
		
		double result5 = 0.345e+20; // 0.345 * 10의 20승
		System.out.printf("\n%f %e", result5, result5);
		
	}

}
