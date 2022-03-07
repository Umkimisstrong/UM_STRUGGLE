/* ================================
  ■■■ 연산자 (Operator) ■■■
================================= */

// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가.. 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader의 readLine() 을 활용하고
// 조건 연산자를 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2012년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2022
// 2022년 → 평년

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년

// 윤년은 4의 배수이면서 100의 배수가 아니거나, 400의 배수면 윤년
// 그렇지 않으면 평년



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int a;					// -- 입력한 연도를 담아둘 변수
		String strYear;			// -- 판별 결과를 담아둘 변수

		// 연산 및 처리

		System.out.print("임의의 연도 입력 : ");
		a = Integer.parseInt(br.readLine());

		strYear = (a % 400 == 0 ) ? "윤년" : ((a % 100 == 0) ? "평년" : ((a % 4 == 0) ? "윤년" : "평년"));
		 
		// strResult = a%4==0 && year%100!=0 || year%400==0 ? "윤년" : "평년"; 
		// System.out.printf("%d년 → %s%n", a, strResult);

		// 결과 출력
		// =연산자와 ==연산자의 차이를 다시금 깨닫는다
		// 『a % 400 = 』 대입 , 『 a % 400 == 』관계연산자  따라서 관계연산자 == 는
		// 좌측항과 우측항이 같음을 의미하기때문에, true or false를 반환하는데쓰임.
		// 최초에는 =로 에러가 났지만, ==로 해결
		System.out.println(a+"년 →" + strYear);
		
	}
}