/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// 반복문(while문) 실습


// ○ 과제
//	  사용자로부터의 임의의 정수를 입력받아
//	  1부터 입력받은 그 정수까지의
//	  전체 합과, 짝수의 합과, 홀수의 합을
//	  각각 결과값으로 출력하는 프로그램을 구현한다.

//	  실행 예)
//	  임의의 정수 입력 : 280
//	  >> 1 ~ 280 까지 정수의 합 : xxxx
//	  >> 1 ~ 280 까지 짝수의 합 : xxxx
//	  >> 1 ~ 280 까지 홀수의 합 : xxxx
//	  계속하려면 아무 키나 누르세요....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test055
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		int n = 1;
		int sum =0, sum2=0, sum3=0; // 전체 합, 짝수 합, 홀수 합

		// 연산 및 처리

		while(n<=a)
		{
			if(n%2==0)
				sum2 += n; // 짝수의 합
			else
				sum3 += n; //  홀수의 합

			n++;
		}

		sum = sum2 + sum3; //  총합 = 짝수 + 홀수 

		
		// 결과 출력
		
		System.out.printf("1부터 %d 까지 정수의 합 : %d%n", a, sum);
		System.out.printf("1부터 %d 까지 홀수의 합 : %d%n", a, sum3);
		System.out.printf("1부터 %d 까지 짝수의 합 : %d%n", a, sum2);

	}
}

/*
임의의 정수 입력 : 30
1부터 30 까지 정수의 합 : 465
1부터 30 까지 홀수의 합 : 225
1부터 30 까지 짝수의 합 : 240
계속하려면 아무 키나 누르십시오 . . .
*/







