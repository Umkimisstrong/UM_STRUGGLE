/*==========================
	  ■■■ 배 열 ■■■
===========================*/

// 배열의 기본적 활용

// ○ 과제
//	  사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//	  입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//	  단, 배열을 활용하여 구현할 수 있도록 한다.

//	  실행 예)
//	  입력할 데이터의 갯수   : 12
//	  데이터 입력(공백 구분) :  1 2 3 4 5 6 7 8 9 10 11 12
//	  >> 가장 큰 수 → 12
//	  계속하려면 아무 키나 누르세요....

import java.util.Scanner;
import java.io.IOException;

public class Test085
{
	public static void main(String[] args)	throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a; // 사용자 입력 데이터 갯수
		int temp = 0;	// 가장 큰 수를 담을 변수

		
		
		// 사용자에게 안내메세지 출력
		System.out.print("입력할 데이터의 갯수 : ");

		a = sc.nextInt();

		// 데이터의 갯수만큼의 배열 생성
		int[] arr = new int [a];
		
		// 사용자에게 안내메세지 출력
		System.out.printf("데이터 입력(공백 구분) : ");
		
		// 사용자가 입력한 데이터의 배열
		for (int i = 0; i<arr.length ;i++ )
		{
			arr[i] = sc.nextInt();
		}





		// 최종 결과 출력
		
		for (int i = 0; i < arr.length ;i++ )		// 줄세우기 무한루프
						
		{
			if (arr[i] > temp)
			{
				temp = arr[i];						// 마지막 루프 arr[i]를 temp로 대입연산
			}
		}
		
		System.out.println("가장 큰 수 : " + temp);		// 배열의 제일 큰수 = temp


	}

}

// 실행 결과

/*
입력할 데이터의 갯수 : 4
데이터 입력(공백 구분) : 10 100 1000 22222
가장 큰 수 : 22222
계속하려면 아무 키나 누르십시오 . . .
*/