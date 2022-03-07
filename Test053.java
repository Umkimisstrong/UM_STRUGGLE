/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// 반복문(while문) 실습
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수.
//			단, 1은 소수 아님.

// 1부터 자기자신까지 조져보고 나누어떨어지는게 1이랑 자기자신이면 소수로출력하자
// 나머지는 소수 아님

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 11 → 소수


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int a;
		int n=1, temp = 0;
		System.out.print("임의의 정수 입력 : ");

		a = Integer.parseInt(br.readLine());



		while (n <= a)

		{

			n++; // n은 2부터 시작해야 모듈러에서 안걸러진다



			if (a==1)

			{

				System.out.println(a + " → 소수 아님");

				break;

			}

			if (a==n)

			{

				System.out.println(a + " → 소수");

				break;

			}

			if (a%n==0)

			{

				System.out.println(a + " → 소수아님");

				break;

			}

		}
		*/

		// 주요 변수 선언 및 초기화

		int num;	// 사용자의 입력값을 담아낼 변수
		int n = 2;	// 입력앖을 대상으로 나눗셈 연산을 수행할 변수
					// 2부터 시작해서 1씩 증가
					// ex) 입력값 27 → n : 2 3 4 5 6 7 8 ... 26
					// 

		System.out.print("임의의 정수 입력 : ");

		num = Integer.parseInt(br.readLine());

		boolean flag = true;		// num(사용자 입력값)은 소수일 것이다.

		while(n < num)	// 선생님의 계산은 1과 자기자신을 제외한 나머지 수로 나누어 떨어
						// 지면 일단은 소수가 아닌 것으로 판정이 나는 것임
		{
			// n으로 num이 나누어 떨어지는지 확인 (ex. 2로 4가 나누어떨어지는)
			if (n%num==0)
			{
				// 소수 아니다~!!! 
				flag = false;		// num 은 소수 아니다!
				break;				// break 를 감싸는 가장 가까운 반복문
			}


			n++;
		}

		

		// 결과 출력 전에 수행해야 할 추가 확인 !!!! 예외에 대한 판별
		// if 소수다 와 num!=1
		if (flag && num != 1)
		{
			//최종적으로 num은 소수다.
				System.out.printf("%d → 소수%n", num);
		}
		else 
		{
			//최종적으로 num 은 소수 아니다.
			System.out.printf("%d → 소수 아님%n", num);
		}


	}
	
}

// 실행 결과

/*
임의의 정수 입력 : 13
13 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 7
7 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/
