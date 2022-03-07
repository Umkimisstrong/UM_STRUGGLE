// 홀수, 짝수, 영
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args)  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		int n;

		System.out.print("임의의 정수 입력 : ");

		n = Integer.parseInt(br.readLine());

		/*
		if(n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else if(n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else
		{
			System.out.println(n + " → 영");
		}
		*/

		/*
		if(n%2!=0)
		{
			System.out.println(n + " → 홀수 ");
		}
		else if(n==0)
		{
			System.out.println(n + " → 영");	
		}
		else
		{
			System.out.println(n + " → 짝수");
		}
		*/
		/*
		if(n%2!=0)
		{
			System.out.println(n + " → 홀수 ");
		}
		else if(n==0)
		{
			System.out.println(n + " → 영");	
		}
		else if(n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		*/

		
		String result = "판정 불가";

		if(n==0)
		{
			result = "영";
		}
		else if(n%2==0)
		{
			result = "짝수";
		}
		else if(n%2!=0)
		{
			result = "홀수";
		}
		/*
		else
		{
			result = "판정 불가";
		}
		*/

		System.out.println(n + " → " + result);

	}
}

// ※ 조건문을 구성할 대에는 항상 조건의 구성 순서에 유의해야 한다.
//    ex) 홀수 짝수 0을 구분한다면 짝수조건보다 0조건을 만족하는 구문을 먼저 작성하자

// ※ if~else 구문의 중첩 구문은
//	  반드시 else로 끝나야 하는 것이 아니다.
//	  다만, 출력해야 할 구문을 처리하는 과정에서
//	  문제가 발생하지 않는 구문으로 작성해야 한다.

// ※ 조건문 구성 과정에서 이외의 영역(else)을
//	  업무에 포함된 내용으로 처리하는 것은 바람직하지 않을 경우가 있다.
//	  불가능한 경우는 어쩔 수 없더라도
//	  가급적이면 업무에 포함되지 않는 내용을
//	  이외의 영역(else)에서 처리할 수 있도록 하자.

/*
 011 016 019 017 + 010
 if(휴대폰 앞자리가 '011' 이라면)
 {
 }
 else if(휴대폰 앞자리가 '016' 이라면)
 {
 }
 else if(휴대폰 앞자리가 '019' 이라면)
 {
 }
 
 else // 017
 {
 }
 else if(휴대폰 앞자리가'017' 이라면)
 {
 }
 else
 {
	 System.out.println("확인 필요");
 }



 if(주민번호7번째자리 1개가 1이라면)
 {
	성별이 남성
 }
 else if(주민번호7번째자리 1개가 2이라면)
 {
	 성별이 여성
 }
 else 
 {
	System.out.println("성별 확인 불가");
 }
 */

 // 실행 결과

 /*
임의의 정수 입력 : 123123
123123 → 홀수
계속하려면 아무 키나 누르십시오 . . .
 */