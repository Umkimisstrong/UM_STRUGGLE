/* ======================================
   ■ ■ ■ 자바의 개요 및 특징 ■ ■ ■
======================================= */

// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : boolean

public class Test009
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		boolean a = true;
		boolean b;

		int c = 10, d= 5;

		

		// 연산 및 처리(관계 연산 및 대입 연산)
		// ** 관계연산의 반환은 항상 true / false 로 나옴
		b = c < d;
		// b = 10 < d;
		// b = 10 < 5;
		// b = false;

		// 결과 출력
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		boolean k = true;
		if (30/3 == 10)
		{
			k = false;
			System.out.println("상기의 복습 : " + k);
		}


	}	

}

// 실행 결과

/*
a : true
b : false
계속하려면 아무 키나 누르십시오 . . .
*/