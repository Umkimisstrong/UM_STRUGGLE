/* ======================================
  ■ ■ ■ 자바 기본 프로그래밍 ■ ■ ■
======================================= */

// 자바의 기본 입출력 : java.util.Scanner

// ※ java.util.Scanner
//	  단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	  디폴트(default)로 사용되는 단락문자는 공백이다.
//	  작성된 다음 토큰은 『next()』 메소드를 사용
//    다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner;


public class Test019
{
	public static void main(String[] args)    // throws IOException 필요없음

	{
		// Scanner  클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);      //--> BufferedReader 보다 간편하나, 성능이 낮다.


		// 주요 변수 선언
		String name;				//-- 이름

		int kor, eng, mat;			//-- 국어, 영어, 수학



		// 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();

		System.out.print("국어 점수 입력 : ");
		//kor = Integer.parseInt(sc.next());   -->> 필요가 없다
		//Scanner 상에   sc.nextInt. sc.nextBoolean, sc.nextDouble, sc.next~! 가 존재

		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();


		// 결과 출력
		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + (kor + eng + mat));


	
	}
}

// 실행 결과

/*
이름을 입력하세요 : 김상기
국어 점수 입력 : 30
영어 점수 입력 : 40
수학 점수 입력 : 50

>> 이름 : 김상기
>> 총점 : 120
계속하려면 아무 키나 누르십시오 . . .
*/