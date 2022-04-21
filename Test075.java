/* ==================================
    ■■■ 클래스와 인스턴스 ■■■
================================= */

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : a b
// 임의의 연산자 입력(+ - * /)    : +
// >> 10 +  5 = 15
// 계속하려면 아무키나누르세요...

import java.util.Scanner;		// Scanner 는 공백 구분이 디폴트임
import java.io.IOException;


// 계산 객체
class Calculate
{
	// 계산을 위한 변수 선언
	int a, b;     // -- 사용자가 입력할 두 정수
	char k;	      // -- 사용자가 입력할 연산자
	Scanner sc;   // -- 입력메소드가 두 개 여서 sc 선언만 전역변수



	// 사용자가 입력하는 정수 메소드
	void input()			//→ Scanner Int 타입의 메소드, IOException 처리 안해도됨
	{
		sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : "); 
		a = sc.nextInt();
		b = sc.nextInt();

	}
	// 사용자가 입력하는 연산자 메소드
	int calP()	throws IOException	 // → System.in.read() 타입 메소드, IOException처리
	{
		int i = k;				// 문자를 숫자로 치환하여 k에 대입하는 과정
		sc = new Scanner(System.in);
		System.out.print("임의의 연산자 입력(+ - * /) : ");
		k = (char)System.in.read();
		return i;


	}
	/*====================== 선생님 방법
	  결과를 연산에 담아 한번에 출력해버리는 방법 
	int cal()
	{
		int result = 0;
			switch(k)
			{
				case '+': result = su1 + su2; break;
				case '-': result = su1 - su2; break;
				case '*': result = su1 * su2; break;
				case '/': result = su1 / su2; break;
			
			}
		return result;

	}


	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d%n", a, k, b, s)
	}
	main(String[] args)
	//	Calculate 인스턴스 생성
	Calculat~ = new Calcul
	//cal 메소드 생성

	//int 형 결과값 반환

	int = cal.cal();
	
	// 결과 출력
	cal.print(x);
	*/


	void output()	// 결과 출력용 메소드 형성
	{
		if (k == '+')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a+b));
		}
		else if (k == '-')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a-b));
		}
		else if (k == '*')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a*b));
		}
		else if (k == '/')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a/b));
		}
		else
			System.out.println("오류입니다.");
	}


		


}


public class Test075
{
	public static void main(String[] args)	throws IOException
	{
		Calculate cl = new Calculate();

		// 사용자의 정수 입력메소드 호출
		cl.input();

		// 사용자의 연산자 입력메소드 호출
		cl.calP();

		// 사용자의 입력결과를 토대로 연산 및 결과 처리 호출
		cl.output();

	}
}

// 실행 결과

/*
임의의 두 정수 입력(공백 구분) : 10 20
임의의 연산자 입력(+ - * /) : +

 >> 10 + 20 = 30
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 20
10
임의의 연산자 입력(+ - * /) : -

 >> 20 - 10 = 10
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 30
40
임의의 연산자 입력(+ - * /) : *

 >> 30 * 40 = 1200
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 1000

10
임의의 연산자 입력(+ - * /) : /

 >> 1000 / 10 = 100
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 100
2
임의의 연산자 입력(+ - * /) : as
오류입니다.
계속하려면 아무 키나 누르십시오 . . .
*/