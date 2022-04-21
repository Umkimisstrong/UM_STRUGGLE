/* =================================
   ■■■ 클래스와 인스턴스■■■
=================================*/

// 클래스 설계
// 배열 활용
// 접근제어지시자와 정보은닉

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력클래스(Calendar)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.(→ WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로 WeekDay 클래스 설계를 통해
// Test101 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// ※ 1년 1월 1일 → "월요일"

// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 1 19
// 2022년 1월 19일 → 수요일
// 계속하려면 아무 키나 누르세요...

// 2000년 5월 4일 → ?요일
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

class WeekDay
{	

	int year, month, day;
	int sum = 0;
	int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String [] dates = {"일", "월", "화", "수", "목", "금", "토"};

	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 월 일 입력(공백 구분) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		
	}

	String calDate()
	{
		String k = "date";
		
		if (year%4==0 && year%100!=0 || year%400==0)
		{
			sum += 1;
		}

		// 전년도 일수 총합
		sum = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; // year 전년도 까지의 총 일수
		
		// 전월 일수 총합

		for (int i =0;i<month-1 ; i++)
		{
			sum += months[i];
		}
		
		// 일수 총합
		sum += day;

		int x = sum % 7;

		k = dates[x];	

		
		return k;

	}

	void output()
	{
		System.out.printf("%d년 %d월 %d일 : %s요일%n", year, month, day, calDate());
	}
	

}



public class Test101
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();

		wd.input();
		wd.calDate();
		wd.output();
	}
}
// 실행 결과

/*
년 월 일 입력(공백 구분) : 2022 1 20
2022년 1월 20일 : 목요일
계속하려면 아무 키나 누르십시오 . . .
*/