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

public class Test021
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		String bok;

		// 연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(『,』구분) : " );
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				①--------  → 첫번째 처리 ②-----------  → 두번째 처리	
		//			  김상기,90,80,90
		

		// sc = new Scanner("김상기,90,80,90").useDelimiter("\\s*,\\s*");					--> useDelimiter 메소드 ( 딜리미터 : 구분자 )
		//													  \s(tring)*,\s(tring)*			--> 『\\』 → 문자열로 인식하려면 2개필요, 
		//														-----  -    ----- -              『s』 → String, 『*』 → 모두
		//													  문자열 모두, 문자열 모두



		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;


		System.out.println();

		
	


		// 결과 출력
		System.out.println("\n>> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);
		System.out.printf("%n 복습한 Scanner 의 구분자 사용법 : %s\n", bok);
	}

}

// 실행 결과

/*
이름,국어,영어,수학 입력(『,』구분) : 김상기,50,40,30

>> 이름 : 김상기
>> 총점 : 120
계속하려면 아무 키나 누르십시오 . . .
*/