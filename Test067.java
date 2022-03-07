/* ===============================================
	■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■	
=================================================*/

// break 실습

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.

// 단, 입력받은 정수는 1 ~ 100 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력 :  -10

// 임의의 정수 입력 :  0

// 임의의 정수 입력 : 2022

// 입의의 정수 입력 : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까(Y/N)? : y

// 임의의 정수 입력 : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까(Y/N)? : N
// 계속하려면 아무 키나 누르세요... → 프로그램 종료


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		int num;
		int sum;
		char k;

		while (true)
		{


		do
		{


				System.out.print("임의의 정수 입력 : ");
				a = Integer.parseInt(br.readLine());


					
		}
		while (a>=1 ^ a<=100);								// 무한루프 생성

									// ↓↓↓↓↓↓ do~while문 밖에 존재한다.
									// 이후의 시퀀스 이기 때문에


			sum = 0;
			for (num=1; num<=a; num++)
				{
					sum += num;
				}
			System.out.printf("%n>> 1 ~ %d 까지의 합 : %d%n", a, sum);  // 정수합

			System.out.print("계속하시겠습니까(Y/N)? : ");				// Y
			k = (char)System.in.read();
											// NumberFormatException: 문자를 반환못해요
			if(k!='Y' && k!='y')
			{
			// 그만할래 의사표현
			// 반복문을 멈추고 빠져나갈 수 있는 처리 
					// → n 또는 N 입력한거 맞음?
					// → y 또는 Y 입력한거 아닌게 확실??

				// 반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사 표현을 했다면
				// 그 동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				//-- 멈춘다.(그리고 빠져나간다) check!!!!!!!!!!!!!

			}// end of if

			System.in.skip(2);
			System.out.println();



		}// end of while
		









		
	}// end of main()
}// end of class


// 실행 결과

/*
임의의 정수 입력 : 10

>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 10

>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 10

>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 20

>> 1 ~ 20 까지의 합 : 210
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 25

>> 1 ~ 25 까지의 합 : 325
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 100

>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르십시오 . . .
*/