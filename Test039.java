/* ==============================================
   ■ ■ ■ 실행 흐름의 컨트롤 (제어문) ■ ■ ■
 ============================================= */

// if 문
// if ~ else 문 실습

// 사용자로부터 임의의 정수 세개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70
// 계속 하려면 아무 키나 누르세요......

// 7   70    42				123      87      65
// ------					----------
// -         --				87	    123      65 
//							---				-----
// 7   42    70				65				87



//	① 첫 번째 정수 vs 두 번째 정수 크기 비교 및 자리바꿈
//		→ 첫 정수가 두 정수보다 클경우 자리바꿈
//  ② 첫 번째 정수 vs 세 번째 정수 크기 비교 및 자리바꿈
//		→ 첫 정수가 세 정수보다 클 경우 자리바꿈
//  ③ 두 번째 정수 vs 세 번째 정수 크기 비교 및 자리바꿈
//		→ 두 정수가 세 정수보다 클경우 자리바꿈



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;		//-- 사용자가 입력하는 임의의 정수를 담아둘 변수

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		if (a>b)	//	① 첫 번째 정수(a)가 두 번째 정수(b) 보다 크다면
		{
					//		→ 자리바꿈(a와 b)
				a=a^b;
				b=b^a;
				a=a^b;
		}

		if (a>c)	//  ② 첫 번째 정수(a)가 vs 세 번째 정수(c) 보다 크다면
		{
					//		→ 자리바꿈
				a=a^c;
				c=c^a;
				a=a^c;
		}

		if (b>c)	//  ③ 두 번째 정수(b)가 vs 세 번째 정수(c) 보다 크다면
		{
					//		→ 자리바꿈
				b=b^c;
				c=c^b;
				b=b^c;
		}

		

		
		System.out.printf("\n>>정렬 결과 : %d, %d, %d", a, b, c);
	}
}

// 실행 결과

/*
첫 번째 정수 입력 : 17
두 번째 정수 입력 : 23
세 번째 정수 입력 : 7

>>정렬 결과 : 7, 17, 23계속하려면 아무 키나 누르십시오 . . .
*/