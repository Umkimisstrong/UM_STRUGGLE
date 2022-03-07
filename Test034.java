/*==============================================
   ■ ■ ■ 실행 흐름의 컨트롤(제어문) ■■■
==============================================*/

// 물을 자유롭게 컨트롤 하듯 실행 흐름을 컨트롤 해야한다.
// if 문
// if ~ else 문 실습

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if(if문 중첩),
//	  switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우,
//	  특정 문장을 수행하고자 할 때 사용되는 구문이다.


// ○ 정수를 입력받아 홀수/짝수 판별하는 프로그램을 구현한다.
//	  단, 단일 if 구문을 사용한다.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String res;
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(br.readLine());

		if(num%2==0 && num !=0)
		{
			res = "짝수";
		}
		else if (num%2!=0)
		{
			res = "홀수";
		}
		else if (num == 0)
		{
			res = "0이자나.. 복습하자";
		}
		else
			res = "왜그러니대체";

		System.out.println(">> 결과.. : " + num + " → " + res);


		
		


	}
}