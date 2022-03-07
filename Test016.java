/* ======================================
  ■ ■ ■ 자바 기본 프로그래밍 ■ ■ ■
======================================= */

// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 김태형(if)
// 국어 점수 입력 : 90(if)
// 영어 점수 입력 : 80(if)
// 수학 점수 입력 : 70(if)

//====[결과]====
// 이름 : 김태형
// 이름 : 240
// 계속하려면 아무 키나 누르십시오...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args)  throws IOException
	{
		//BufferedReader 인스턴스 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		// 주요 변수 선언		// 문자열 타입으로 생성 → String(str)

		String strName;		//-- 이름 변수
		int nKor, nEng, nMat;	//-- 국어, 영어, 수학 점수 변수
		int nTot;				//-- 총점 변수

		// 연산 및 처리
		// - 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");

		// -사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();
		
		// - 사용자에게 안내 메세지 출력(국어 점수)
		System.out.print("국어 점수 입력 : ");

		// - 사용자가 입력한 값(외부 데이터)을 정수 형태로 변환한 후 변수에 담아내기
		nKor = Integer.parseInt(br.readLine());

		// - 사용자에게 안내 메세지 출력(영어 점수)
		System.out.print("영어 점수 입력 : ");

		// - 사용자가 입력한 값(외부 데이터)을 정수 형태로 변환한 후 변수에 담아내기
		nEng = Integer.parseInt(br.readLine());

		// - 사용자에게 안내 메세지 출력(수학 점수)
		System.out.print("수학 점수 입력 : ");

		// - 사용자에게 입력한 값(외부 데이터)을 정수 형태로 변환한 후 변수에 담아내기
		nMat = Integer.parseInt(br.readLine());

		// - 각 점수 변수에 담겨있는 데이터(사용자가 입력한 데이터)들을
		//   종합하여 총점을 산출하고 결과를 변수에 담아내기

		nTot = nKor + nEng + nMat;

		System.out.print("복습하고싶으면 1을 누르세요 : ");
		int k = Integer.parseInt(br.readLine());


		// 결과 출력
		System.out.println("\n====[결과]====");
		System.out.printf("이름 : %s\n", strName);
		System.out.printf("총점 : %d\n", nTot);

		
	}
}

// 실행 결과

/*
이름을 입력하세요 : 김상기
국어 점수 입력 : 50
영어 점수 입력 : 60
수학 점수 입력 : 70

====[결과]====
이름 : 김상기
총점 : 180
계속하려면 아무 키나 누르십시오 . . .
*/