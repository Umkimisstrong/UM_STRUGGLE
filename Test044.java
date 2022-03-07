/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// switch 문 실습

// 사용자로부터 1 부터 3 까지의 정수 중 하나를 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

// ① switch 문의 일반 모델을 사용한다.
// ② switch 문의 기본 모델을 사용하되,
//		『break』를 딱 한번만 사용할 수 있도록 구성한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나...

// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나...

// 임의의 정수 입력(1~3) : 7
// 입력 오류
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test044
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*--- 나의 풀이
		int a;
		String k;
		
		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		k = "★★★";
		switch(a)
		{

			case 1 : k = "★"; break; 	 
			case 2 : k = "★★";	

		}
		
		System.out.printf("%n>> %s ", k);
		*/
		

		/* --- 나의 풀이
		int a;
		String k;
		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		k = "입력 오류";
		switch(a)
		{

			case 1 : k = "★"; 
			
		}
		switch(a)
		{

			case 2 : k = "★★"; 
		}

		switch(a)
		{
			case 3 : k = "★★★"; 
		}
		System.out.printf("%n>> %s ", k);
		*/



//-----------------------------------------------------------


		int n;

		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());
	


		// ①
		switch (n)
		{
			case 1: System.out.println("★"); break;
			case 2: System.out.println("★★"); break;
			case 3: System.out.println("★★★"); break;
			default : System.out.println("입력오류!@~!@~"); //break;
		}


		// ②
		/*
		switch (n)
		{
			default : System.out.print("입력오류!"); break;
			case 3: System.out.print("★");
			case 2: System.out.print("★");
			case 1: System.out.print("★");
		}
		System.out.println();
		*/

	}
}

// 실행 결과

/*
임의의 정수 입력(1~3) : 1
★
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~3) : 2
★★
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~3) : 3
★★★
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~3) : 4
입력오류!@~!@~
계속하려면 아무 키나 누르십시오 . . .
*/