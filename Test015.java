/* ======================================
  ■ ■ ■ 자바 기본 프로그래밍 ■ ■ ■
======================================= */

// ○ 퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 :
// - 삼각형의 높이 입력 : 
// >> 밑변이 ○, 높이가 ○ 인 삼각형의 넓이 : xxx
// 계속하려면 아무 키나 누르십시오...

// ※문제 인식 및 분석
//	 삼각형의 넓이 = 밑변 * 높이 / 2

//   사용자로부터 데이터를 입력받아 처리 → BufferedReader 클래스 사용

import java.io.BufferedReader;           // → 필요한것만 쓴다 (버퍼리더, 인풋스트림리더
import java.io.InputStreamReader;        //    IO익셉션
import java.io.IOException;

// import java.io.*;    (io에 들어있는 모든 것들을 참조한다, 메모리 남용)

public class Test015
{
	public static void main(String[] args)  throws IOException
	{
		/*  --------------------------- 나의 풀이 ------------------------------------
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		


		int x, y;                // 밑변 : x, 높이 : y

		double k;

		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");

		x = Integer.parseInt(br.readLine());

		System.out.print("- 삼각형의 높이 입력 : ");
		
		y = Integer.parseInt(br.readLine());

		k = (x * y) /2;


		System.out.println(">> 밑변이 " + x + " 높이가 " + y +" 인 삼각형의 넓이 : " + k);

		--------------------------------------------------------------------------------*/

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int underLength, height;            //-- 밑변과 높이
		double area;						//-- 넓이            check~!!!
		int k = 30;
		String x = "NBA 선수 골든스테이트 워리어스 소속 스테픈 커리의 등번호는 : ";
		int a;

		System.out.print(x);
		a = Integer.parseInt(br.readLine());
		
		if (a > 0)
		{
			System.out.println("등번호는 " + k + "입니다.");
			 
		}
		
		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");
		
		// ② 사용자가 입력한 데이터를 정수형태로 변환한 후
		//	  변수 underLength 에 담아내기
		underLength = Integer.parseInt(br.readLine());  //-- readLine을 쓰는 순간 IOException
										             	//   이 필요함


		// ③ 다시 사용자에게 안내 메세지 출력
		System.out.print("- 삼각형의 높이 입력 : ");

		// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수 height 에 담아내기
		height = Integer.parseInt(br.readLine());
		
		// ⑤ 삼각형의 넓이 구하는 연산 처리
		area = underLength * height / 2.0;
		//      정수형     정수형    / 정수형   → 정수기반연산
		//      즉, 몫을 취하고 나머지 버림!!
		//

		//area = (double)(underLength * height / 2);    -- X
		//area = (double)underLength * height / 2;      -- O
		//area = underLength * (double)height / 2;      -- O
		//area = underLength * height / 2.0;            -- GREAT
		// ※실수 자료형이 결과값으로 나오는 과정에서
		//   실수 기반의 연산이 필요한 상황이다.
		//   정수형 『2』가 아닌, 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
		//   이 연산은 실수 기반으로 처리된다.

        // 결과 출력
		System.out.println();   // 개행

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n)"
		                              ,underLength, height, area);
	}

}

// 실행 결과
/*
■ 삼각형의 넓이 구하기 ■
- 삼각형의 밑변 입력 : 23
- 삼각형의 높이 입력 : 15

>> 밑변이 23, 높이가 15인 삼각형의 넓이 : 172.50
)계속하려면 아무 키나 누르십시오 . . .
*/