/*==============================================
  ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■
==============================================*/

// 반복문(do~ while문) 실습

/*
○ 개요

	『do~while』 문은 『while』문과 마찬가지로
	특정한 영역을 반복 수행하는 반복문이다.
	다만 『while』문과 다른 점은
	조건식에 대한 검사를 반복문을 수행한 이후에 한다는 것이다.
	이와 같은 성격으로 인해 반드시 한번은 수행하게 되는 특징을 갖는데...

○ 형식 및 구조

	do
	{
			실행문;
	}
	while(조건식);

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test057
{
	public static void main(String[] args)		throws IOException
	{
		// ※ while 반복문을 통해 구현했던 내용들을
		//	  do~while 문을  통해서도 구현할 수 있다.
		
		/*
		int n = 1;
		
		do
		{
			System.out.println("n " + n);
			n++;
		}
		while (n<=10);
		*/


		/*
		int n = 1;
		
		do
		{
			n++;
			System.out.println("n " + n);
		}
		while (n<=10);
		*/


		/*
		int n = 0;
		
		do
		{
			n++;
			System.out.println("n " + n);
		}
		while (n<10);	
		*/

		/*
		int n = 0;
		
		do
		{
			System.out.println("n " + ++n);

		}
		while (n<=10);
		*/

		// do~while 문의 활용 모델
		// 예를 들어... 사용자로부터 특정 범위의 정수가 입력될 때 까지
		// 입력받는 행위 자체를 반복해서 수행해야 하는 상황이라 가정한다.
		
		/* EX


		100 이상의 정수를 입력하세요 : 30
		↓
		100 이상의 정수를 입력하세요 : 40
		↓
		100 이상의 정수를 입력하세요 : 101
		100 이상의 정수 입력 완료

		System.out.print("~~"); 구문을 do '~'while  '~'의 제일 윗줄에 넣어주면
		출력을 계속 할 수 있다.

		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k;

		do
		{
			System.out.print("마음속으로 3초를 세고, 컴퓨터가 원하는 숫자(정수)를 입력하세요.. (1~9)");
			k = Integer.parseInt(br.readLine());
		}
		while (k!=4);

		System.out.println();
		System.out.println("정답입니다. 잘하셨어요.");

	}
}