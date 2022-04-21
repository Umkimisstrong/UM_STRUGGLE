/* =======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
======================================== */

// Calendar 클래스


/*
○ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로
   연, 월, 일, 요일, 시, 분, 초 까지의
   시간과 날짜와 관련된 정보를 제공한다.
   그리고, Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며
   실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
   GregorianCalendar 클래스에 정의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때
   getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
   이 객체가 생성되면 갖고있는 시간 정보들은
   get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

   getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여 돌려주기 때문에
   GregorianCalendar 객체를 직접 생성하여 시간정보를 구할 수도 있다.

*/

// ○ 실습 문제
//    사용자로부터 연, 월을 입력받아
//    달력을 그려주는(출력하는) 프로그램을 구현한다.
//    단, 만년달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)

// 연도 입력 : 0
// 연도 입력 : 2022
// 월 입력   : -2
// 월 입력   : 16
// 월 입력   : 7
/*
	[ 2022년 7월 ]
	
   일   월   화   수   목   금   토
====================================
							 1    2
    3    4    5    6    7    8    9
   10   11   12   13   14   15   16
   17   18   19   20   21   22   23
   24   25   26   27   28   29   30
   31
====================================
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test145
{
	public static void main(String[] args)	throws IOException
	{
		Calendar Dal = new GregorianCalendar();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] weekdays = {"일", "월", "화", "수", "목", "금", "토"};
		int [] arr;
		int year;
		int month;
		// 사용자 --------- 입력
		 
		do
		{
			System.out.print("연도 입력(1이상) : ");
			year = Integer.parseInt(br.readLine());
	
			
		}
		while (year<=0);

		do
		{
			System.out.print("월 입력(1~12) : ");
			month = Integer.parseInt(br.readLine());
		}
		while (month > 12 || month < 1);

		// 사용자로부터 입력받은 연, 월을 이용하여 달력의 날짜 셋팅
		Dal.set(year, month-1, 1);
		// -- 월 구성시 입력값(month)을 그대로 사용하는 것이 아니라
		//    입력값에서 1을 뺀 값으로 월을 설정해야 한다.
		// -- 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다.
		
		// 세팅된 달력의 날짜로부터 요일 가져오기
		int weekday = Dal.get(Calendar.DAY_OF_WEEK);	// 해당월의 1일의 요일

		int lastday = Dal.getActualMaximum(Calendar.DATE);
		// Dal.셋팅된 달의 최댓값을 반환한다. getActualMaximum()
		//달력셋팅끝
		
		

		
		// 결과 출력
		System.out.println();
		// 제목
		System.out.printf("\t[ %d년 %d월]\n", year, month);
		System.out.println("===========================");
		// 요일
		for (int i = 0;i < weekdays.length ;i++ )
			System.out.printf("%3s", weekdays[i]);
		System.out.println();



		// 날짜(만년달력과 동일하게, 달력을 그리기 전 첫 요일만큼의 공백 발생)
		// 일요일이면 공백 0으로 시작
		// 월요일이면 공백 1로시작
		// 화요일이면 공백 2로시작
		// 수요일이면 공백 3로시작
		// 목요일이면 공백 4로시작
		//  :
		//  :
		for (int i = 1;i < weekday ;i++ )
		{
			System.out.printf("%4s", " ");		// 첫 요일만큼 공백 발생
		}


		
		for (int i = 1; i <= lastday ; i++ )
		{
			System.out.printf("%4d", i);
			weekday++;					// 반복문수행하면서
										// 날짜가 증가할때마다 요일도 증가하게끔 처리
										// 요일은 일요일이 될때마다 개행하게끔 처리
			if (weekday%7==1 && i != lastday)
			{
				System.out.println();
			}

		}
		System.out.println();
		// 마무리
		System.out.println("===========================");





	}
}

// 실행 결과

/*
   [ 2022년 5월]
===========================
  일  월  화  수  목  금  토
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
===========================
계속하려면 아무 키나 누르십시오 . . .
*/