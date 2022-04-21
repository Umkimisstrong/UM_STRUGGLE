/*==========================
   ■■■ 만년달력 ■■■
===========================*/

// 다음과 같은 기능의 프로그램을 구현한다.

// 실행 예)
// 『연도』를 입력하세요 : 2022
// 『월』을 입력하세요   : 6
/*
	[ 2020년 6월 ]
  일  월  화  수  목  금  토
 ===========================
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30
 ===========================
 계속하려면 아무 키나 누르세요...
*/ 


// 상상력 : 1 2 3 4 5 6 7 8 9 10 ~ 31
//          (루프하면서 (공백수 + 1 + i)가 7의 배수가 되면 개행을 해야한다는 상상)

//          (해당 월의 마지막날이 되면 개행을 해야된다는 상상)
import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int year, month;
		int alldays=0;
		int date;  // 무슨요일부터 담을지
		int [] days; // 해당 월에 며칠이 있는지
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n = 1;

		String [] dates = {"일", "월", "화", "수", "목", "금", "토"};


		// 사용자 입력 연, 월
		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			year = sc.nextInt();
		}
		while (year<1);

		do
		{
			System.out.print("『월』을 입력하세요   : ");
			month = sc.nextInt();
		}
		while (month < 1 || month >12);
		

	
		// 연산
		if (year % 4==0 && year % 100 !=0 || year % 400 ==0)
		{
			months[1] = 29;
		}


		// 1년1월1일 ~ 입력받은 년도의 이전년도 12.31 까지의 날 수 연산
		alldays = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;


		// 입력받은 연도(해당연도) 1월 1일 ~ 입력한 월의 이전 월까지의 날 수 누적 연산
		for (int i = 0;i<month-1 ;i++ )
		{
			alldays += months[i];
		}
		
		date = months[month-1];    // 입력한 월에 대한 숫자가 언제끝날지

		days = new int[date];
		


		for (int i = 0;i < days.length ;i++ )
		{
			days[i] = i+1;
		}

		date = alldays%7+1;			// 총 날 수를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일
		                            // ~ 6이면 토요일
	
						
		// 결과 출력
		System.out.println();

		System.out.printf("     [ %d년 %d월 ]%n", year, month);
		for (int i =0;i<dates.length ;i++ )
		{
			System.out.printf("%3s", dates[i]);
		}
		System.out.println();
		System.out.println("===============================");
		for (int i =0;i < date ;i++ )		// 공백4칸발생 date 만큼 == 언제부터 시작할지..
		{
			System.out.print("    ");
		}

		for (int i =0;i<days.length ;i++ )
		{
			System.out.printf("%4d", days[i]);
			if ((date+i+1)%7 == 0 && i != days.length-1)
			{
				System.out.println();
			}
		}
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우(토요일까지 라인 출력)
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리
		System.out.println();	// 마지막 날짜 찍고 개행
		System.out.println("===============================");
	}
}

// 실행 결과

/*
『연도』를 입력하세요 : 2022
『월』을 입력하세요   : 1
      [2022년 1월]
  일  월  화  수  목  금  토
===============================
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28  29
  30  31
===============================
계속하려면 아무 키나 누르십시오 . . .
*/