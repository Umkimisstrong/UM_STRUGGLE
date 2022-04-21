/*===================================
  ■■■ 지역변수와 전역변수 ■■■
===================================*/

// 전역 변수의 초기화 테스트

//  ******* Test070과 비교해볼것 *******

public class Test071
{

	// 클래스의 영역(클래스변수라고 부르면 멍청이)
	// -- 전역변수라고 부르기  → 전역변수 a 선언한것
	int a;
	//-- 자동으로 0으로 초기화 지원

	boolean b;
	//-- 자동 false 초기화

	char c;
	//-- 자동 공백 초기화

	double d;
	//-- 자동 0.0 초기화

	public static void main(String[] args)
	{
		// 메소드의 영역	

		//System.out.println("a : " + a);
		//--==>> 에러발생(컴파일에러)
		//non-static variable a cannot be referenced from a static context
		
		// Test071 클래스를 기반으로 인스턴스 생성
		Test071 ob = new Test071();

		System.out.println("ob.a : " + ob.a);
		//--==>> ob.a : 0

		System.out.println("ob.b : " + ob.b);
		//--==>> ob.b : false
		
		System.out.println("ob.c : " + ob.c);
		//--==>> ob.c :

		System.out.println("ob.d : " + ob.d);
		//--==>> ob.d : 0.0



		

	}
	
	/*
	다른 메소드1()
	{
		
	}
	*/

	/*
	다른메소드2()
	{
		
	}
	*/

}