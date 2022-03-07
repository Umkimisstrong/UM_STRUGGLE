/* ================================
  ■■■ 연산자 (Operator) ■■■
================================= */

// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 이 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는 BufferedReader 의 readLine() 을 통해 넘겨받을 수 있도록 한다.
// 또한, 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.


// 실행 예)
// 임의의 정수 입력 : N1
// -N → 음수
// 계속하려면 아무 키나 누르십시오...

// 임의의 정수 입력 : 257
// 257 → 양수
// 계속하려면 아무 키나 누르십시오...

// 임의의 정수 입력 : 257
// 0 → 영
// 계속하려면 아무 키나 누르십시오...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		/* --------------------------------------------------------------------------

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		String strResult;


		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		strResult = (a==0) ? "0" : ((a>0) ? "양수" : "음수");

		System.out.printf("%d → %s\n", a, strResult);

		----------------------------------------------------------------------------- */

		// 주요 변수 선언

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String strResult;

		// 연산 및 처리

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		/*
		n이 0보다 크다 → true	→ n은 양수
					   → false → n이 0보다 작다 → ture → n은 음수
					   							  → false → n은 영
		*/
		
		// (n>0) ? ("양수") : ((n<0) ? ("음수") : ("영") );
		// "양수";
		// "음수";
		strResult = (n>0) ? ("양수") : ((n<0) ? ("음수") : ("영") );
		// strResult = "양수";
		// strResult = "음수";
		// strResult = "영";



		// 최종 결과 출력
		System.out.println(n + " → " + strResult);




	}
}

// 실행 결과

/*
임의의 정수 입력 : 1
1 → 양수
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : -1
-1 → 음수
계속하려면 아무 키나 누르십시오 . . .
*/


/*
임의의 정수 입력 : 0
0 → 0
계속하려면 아무 키나 누르십시오 . . .
*/