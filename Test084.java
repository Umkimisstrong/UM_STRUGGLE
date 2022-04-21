/*==========================
  ■ ■ ■ 배 열  ■ ■ ■
===========================*/

// 배열의 선언과 초기화
// 배열의 기본적 활용


// 사용자로부터 인원수를 입력받고
// 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고
// 이를 이름 배열과 전화번호 배열로 구성하여
// 결과를 출력할 수 있는 프로그램을 구현한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 27 
// 입력 처리할 학생 수 입력(명, 1~10) :	-5
// 입력 처리할 학생 수 입력(명, 1~10) :	3
// 이름 전화번호 입력[1](공백 구분) : 박현수 010 ------
// 이름 전화번호 입력[2](공백 구분) : 신시은 !!
// 이름 전화번호 입력[3](공백 구분) : 오이삭 !!

// -------------------
// 전체 학생 수 : 3명
// 이름     전화번호
// 박현수   010 ---
// 신시은   010 ----
// 오이삭   0000
// -------------------
// 계속하려면 아무 키 누르세요....



import java.util.Scanner;
import java.io.IOException;


	
public class Test084
{
	public static void main(String[] args)	throws IOException
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생 수를 담아낼 변수
		int a=0;

	

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			a = sc.nextInt();
		}
		while (a<=10 ^ a>=1);

		// 인원 수 만큼의 이름 저장 배열 구성

		String[] names = new String[a];

		// 인원 수 만큼의 전화번호 저장 배열 구성

		//		String[] tells = new String[a];
		String[] tels = new String[names.length];

		// 인원 수 만큼의 안내 메세지 출력 및 입력값 담아내기

		// for (int i = 0; i<names.length; i++)
		// for (int i = 0; i<tels.length; i++)

		for (int i = 0; i<a ;i++ )
			{
				System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
				// 김상기 010-0000-0000
				// ----- --------------
					names[i] = sc.next();
					tels[i] = sc.next();
			}
		
		// 최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("--------------------");
		System.out.printf("전체 학생 수 : %d명%n", a);
		System.out.println("--------------------");
		System.out.println(" 이름      전화번호");
		
		// 학생 리스트 반복 출력
		for (int i=0;i<a ;i++)
		{
			System.out.printf("%4s %14s%n", names[i], tels[i]);
		}
		
		System.out.println("--------------------");


	
	}

}

// 실행 결과

/*
입력 처리할 학생 수 입력(명, 1~10) : 2
이름 전화번호 입력[1](공백 구분) : 김상기 010-5693-4223
이름 전화번호 입력[2](공백 구분) : 김상기 010-5693-4223

--------------------
전체 학생 수 : 2명
--------------------
이름      전화번호
 김상기  010-5693-4223
 김상기  010-5693-4223
--------------------
*/