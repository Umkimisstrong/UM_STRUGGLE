/*========================================
  ■■■ 실행 흐름의 컨트롤(제어문)■■■
=======================================*/

// return 실습

// ※ return 키워드가 지니는 의미
//	  1. 값의 반환
//	  2. 메소드 종료(리턴이 포함된 메소드)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test069
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s;

		System.out.print("임의의 정수 입력(10이상) : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10이상의 정수를 입력해야 합니다.");
			return;
			//-- 메소드 종료 → 종료 1대상 : main()메소드 → 프로그램 종료
			
		}

		s = 0;

		for (int i=1; i<=n ;i++ )
		{
			s += i;
		}

		System.out.println("결과 : " + s);
		

	}
} 
