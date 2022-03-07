/* ================================
  ■■■ 연산자 (Operator) ■■■
================================= */

// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 문자를 하나 입력받아
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르십시오...

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르십시오...

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르세요...


/*
ch

알파벳 대문자니 ? (맞을경우)소문자로 변환 : (아닐경우)(알파벳 소문자니 ? 대문자로변환 : 그대로);
											           ---------------   ------------   ------
													          1                2           3
---------------   -----------------------    --------------------------------------------------
        1                     2                                              3

result = 최종결과;
		          

*/


// 한 문자만 입력받는 것이기 때문에 System.in.read 입출력을 써보자 ----여기까진 맞음

import java.io.IOException;

public class Test031
{
	public static void main(String[] args)   throws IOException
	{
		/*
		//int temp;
		char temp;
		
		System.out.print("한 문자 입력 : ");

		temp = (char)System.in.read();

		//System.out.println("입력받은값 확인 : "+ temp);
		
								   // 현실에서는 65<= temp <= 90가능한데, JAVA 에서는 불가
								   // JAVA 에서는 temp >= 와 temp<= 로 구성한다
								   // **또한 2개이상의 조건이 붙으면 무조건 논리연산자 사용**
		
		//String result =	temp >= 65 && temp <= 90 ? "대문자" : "대문자 아님";
		//System.out.println("결과 : " + result);
		

		String result =	temp >= 'A' && temp <= 'Z' ? "대문자" : "대문자 아님";
		System.out.println("결과 : " + result);
		*/


		// 주요 변수 선언
		char ch, result;
		
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

        result = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         //--------------------      -------------  

         // result = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);

		 // if Q를 넣으면
		 // result = (true && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
		 // result = (true && true) ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)(ch + 32)
         // result = (char)(Q + 32)
		 // result = (char)(81 + 32)
		 // result = (char)(113)
		 // result = q

		 // if m을 넣으면
		 // result = (true && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
		 // result = (true && false) ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)((true && true) ? (char)(ch-32) : ch);
         // result = (char)(ch-32)
		 // result = (char)(109 + 32)
		 // result = (char)(77)
		 // result = M

		 // if 8를 넣으면
		 // result = (false && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
		 // result = (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)((false && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)(ch)
		 // result = (char)(8)
		 // result = 8



	
		          
		

		// 결과 출력
		 System.out.println(ch + " → " + result);

	}
}

/*
한 문자 입력 : A
A → a
계속하려면 아무 키나 누르십시오 . . .


한 문자 입력 : k
k → K
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 7
7 → 7
계속하려면 아무 키나 누르십시오 . . .
*/