/*==============================================
   ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■■■
==============================================*/

// 물을 자유롭게 컨트롤 하듯 실행 흐름을 컨트롤 해야한다.
// if 문
// if ~ else 문 실습

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if(if문 중첩),
//	  switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우,
//	  특정 문장을 수행하고자 할 때 사용되는 구문이다.

// ○ 과제
//	  → 카페 코딩위드어스(https://cafe.naver.com/codingwithus)
//	  사용자로부터 임의의 연도를 입력받아
//	  입력받은 연도가.. 윤년인지 평년이지 판별하여
//	  그 결과를 출력하는 프로그램을 구현한다.
//	  단, 입력은 BufferedReader의 readLine() 을 활용하고
//	  if 조건문 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2012년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2022
// 2022년 → 평년

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년

// 윤년은 4의 배수이면서 100의 배수가 아니거나, 400의 배수면 윤년
// 그렇지 않으면 평년

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int a;
		String strName;

		// 연산 및 처리
		System.out.print("임의의 연도 입력 : ");		//-- 사용자에게 입력받을 메세지
		a = Integer.parseInt(br.readLine());			//-- 정수형태의 a를 담기
		
		strName = "평년";								//-- 『String strName』초기화

		// 결과 출력 전 if 조건문 작성(a값 변화에 따른 조건 부여)
		if (a%400==0)									//-- 『a』가 400의 배수인경우	
		{
			strName = "윤년";
		}
		else if(a%100!=0 && a%4==0)						//-- 『a』가 100의 배수가 아니거나	
		{
			strName = "윤년";							//    4의 배수인 경우
		}
		
		else
		{
			System.out.println("판별 불가");
		}
		// 최종 결과 출력
		System.out.printf("%d → %s%n", a, strName);	

	}
}

// 실행 결과

/*
임의의 연도 입력 : 2000
2000 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 연도 입력 : 1999
1999 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/