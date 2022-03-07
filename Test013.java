/* ======================================
   ■ ■ ■ 자바의 개요 및 특징 ■ ■ ■
======================================= */

// ○ 퀴즈
// 직사각형의 넒이와 둘레를 구하는 프로그램을 작성한다
// → 가로 : 10. 세로 : 20

// 실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...


public class Test013
{
	public static void main(String[] args)
	{

		/* ------- 나의 풀이 ---------------------
		double hor = 10;
		double ver = 20;

		double s;
		double d;

		s = hor * ver;
		d = (hor + ver) * 2;
	
		System.out.println("넓이 : " + s);
		System.out.println("둘레 : " + d);

		System.out.printf("넓이 : %.2f\n", s);
		System.out.printf("둘레 : %.3f\n", d); 
		------------- 나의 풀이  -------------- */ 

		// 변수 선언 및 초기화
		int a =10, b=20;			//-- 가로, 세로
		int x, y;					//-- 넓이, 둘레

		// 연산 및 처리
		x = a * b;
		y = (a + b) * 2;

		// 결과 출력
		System.out.println("넓이 : " + x);
		System.out.println("둘레 : " + y);
		
		System.out.println("넓이 : " + (a*b));
		System.out.println("둘레 : " + (a+b)*2);

		int k = b;
		int n = b-30;
		k = n;
	
		
		System.out.println(k);


	}
}