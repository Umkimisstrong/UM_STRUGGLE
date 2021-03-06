/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// 반복문(while문) 실습

// 1 * 2 * 3 * 4 * 5 * ... * 10

// 실행 예)
// 연산 결과 : xxxx
// 계속하려면 아무 키나 누르세요...
public class Test052
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int n=0, result=1;

		// 연산 및 처리

		while (n<10)
		{
			n++;
			result *= n;
		}

		System.out.println("연산 결과 : " + result);
	}
}

// 실행 결과

/*
연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/