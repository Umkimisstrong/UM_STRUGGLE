/* =======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
======================================== */

// Calendar 클래스

// ○ 실습 문제
//    오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//    확인하여 결과를 출력하는 프로그램을 구현한다.
//    실행 예)
//    오늘 날짜 : 2022-2-3 목요일
//    몇 일 후의 날짜를 확인하고자 하십니까? : 200
//    ※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드 활용


// ============[확인 결과]============
//     200일 후 : xxxx-xx-xx x요일
// ===================================
// 계속하려면 아무 키나 누르세요. . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

// 혼자했다 띠방!!

public class Test146
{
	public static void main(String[] args)	throws IOException
	{	
		// BufferedReader 클래스 기반 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar 클래스 기반 인스턴스 생성
		Calendar Dal = new GregorianCalendar();

		// 주요 변수 선언 및 초기화
		String [] wdays = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", };
		int y = Dal.get(Calendar.YEAR);
		int m = Dal.get(Calendar.MONTH)+1;
		int d = Dal.get(Calendar.DATE);
		int w = Dal.get(Calendar.DAY_OF_WEEK);

		// 현재의 연 월 일 요일 가져오기
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y, m, d, wdays[w-1]);


		// 사용자로부터 추가된 날 수 에대한 연산
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		int day = Integer.parseInt(br.readLine());


		//
		Calendar Dal2 = new GregorianCalendar();
		Dal2.add(w, day);		// 이것이 핵심... 요일따라 가야됀다..
		// 기존 Dal. 에 입력되어있는 정보에서 day 만큼 더해준 날에 대한 달력을 생성하기



		// 새로운 달력에 대한 정보를 출력
		int y2 = Dal2.get(Calendar.YEAR);
		int m2 = Dal2.get(Calendar.MONTH)+1;
		int d2 = Dal2.get(Calendar.DATE);
		int w2 = Dal2.get(Calendar.DAY_OF_WEEK);


		System.out.println();
		System.out.println("============[확인 결과]==============");
		System.out.printf("%4s %d일 후 : %d-%d-%d-%s", " ", day, y2, m2, d2, wdays[w2-1]);
		System.out.println();
		System.out.println("=====================================");
	
		

	}
}

/*
오늘 날짜 : 2022-2-3 목요일
몇 일 후의 날짜를 확인하고자 하십니까? : 300

============[확인 결과]==============
     300일 후 : 2022-11-30-수요일
=====================================
계속하려면 아무 키나 누르십시오 . . .
*/