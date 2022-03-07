/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// 반복문(do~ while문) 실습

// 사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합을 계산하여 출력하는 프로그램을 작성한다.
// 단, -1이 입력되는 순간
// 입력 행위중지하고
// 그 동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
//, 즉 ,『-1』을 입력중지 커맨드로 활용한다.

// 실행 예)
// 정수1 입력 : 3
// 정수2 입력 : 5
// 정수3 입력 : 8
// 정수4 입력 : 9
//		:
// 정수5 입력 : -1

// >> 현재까지 입력된 정수의 합 : xxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test058
{
	public static void main(String[] args)  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int a;	//사용자
		int m = 1; //순환변수
		int sum = 0;	//누적합
		

		do
		{
			
			System.out.printf("정수%d 입력 : ", m);				// 사용자 입력칸
			a= Integer.parseInt(br.readLine());			// 사용자가 입력할꺼에요~커서 깜빡
			sum += a;
			m++;
		}
		while (a != -1);		// a가 -1이 아닌경우 계속 반복해라

		System.out.printf("%n>>> 현재까지 입력된 정수의 합 : %d%n", (sum+1)); 
																// -1 포함없이
		
	}
}

//  실행 결과

/*
정수1 입력 : 2
정수2 입력 : 3
정수3 입력 : 4
정수4 입력 : 100000
정수5 입력 : 1231
정수6 입력 : -1

>>> 현재까지 입력된 정수의 합 : 101239
계속하려면 아무 키나 누르십시오 . . .
*/