/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// switch 문 실습

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 3
// 두 번째 정수 입력 : 17
// 연산자 입력[+ - * /] : -

// >> 3 - 17 = -14
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test045
{
	public static void main(String[] args)  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		// ①
		int a, b, result;
		int op;


		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /]");
		op = System.in.read();

		// + → op:43, → op :45, * → op :42, / → op:47

		switch (op)
		{
			case 43 : result = a+b; break;
			case 45 : result = a-b; break;
			case 42 : result = a*b; break;
			case 47 : result = a/b; break;
			default: return;	// 1. 값의 반환
								// 2. 메소드 종료 : main()메소드 종료를 의미함 : 프로그램종료
								//  
		}

		System.out.printf("%n>>%d %c %d = %d",a, op, b, result);
											//   --    int 로 변수선언햇지만,
											//    	   자동형변환 char형태로
		*/

		// ② 연산자를 문자타입으로 설정하고 시작
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번재 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		switch(op)													// jdk1.6부터는 
																	// 문자와 문자열도 받음
		{
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/b; break;
			default : return;
		}

		System.out.printf("%n>> %d %c %d = %d%n", a, op, b, result);


		



		

		
	}
}

// 실행 결과
/*
첫 번째 정수 입력 : 3
두 번째 정수 입력 : 4
연산자 입력[+ - * /]+

3 + 4 = 7계속하려면 아무 키나 누르십시오 . . .
*/