/* ===================================================
      ■ ■ ■  자바의 주요(중요) 클래스 ■ ■ ■
====================================================*/

// Wrapper 클래스

public class Test133
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;		// 오토박싱  객체타입 = 자료형 바로직진 자동으로

		int n = 300;
		Integer wrapN = new Integer(n);	
		int n2 = wrapN;			// 오토언박싱   자료형 = 객체타입 바로 직진

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		/*
		true
		300
		300.3
		*/

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		/*
		true
		300
		300.3
		*/

		// Integer 클래스

		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		// ==> ni :  12

		ni = Integer.parseInt("0101", 2);     // 오버로딩
		System.out.printf("ni : %3d\n", ni);
		// ==> ni :   5
		
		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		// ==> ni :  10

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		// ==> ni :  10
		




		sn = Integer.toBinaryString(20);		// 2진수
		System.out.printf("sn : %s\n", sn);
		// ==> sn : 10100
		
		sn = Integer.toOctalString(31);			// 8진수
		System.out.printf("sn : %s\n", sn);
		// ==> sn : 37

		sn = Integer.toHexString(31);			// 16진수
		System.out.printf("sn : %s\n", sn);
		// ==> sn : 1f

		Integer num = new Integer(50);
		System.out.println(num.toString());
		// ==> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		// ==> 345
}