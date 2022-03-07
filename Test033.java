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


// 사용자로부터 이름, 국어점수, 수학점수를 입력받아
// 등급은 평균 점수를 기준으로 처리한다.
// 90점이상 : A
// 80점이상 : B
// 70점이상 : C
// 60점이상 : D
// 60점미만	: F

// 단. BufferedReader 의 readLine()메소드를 통해 입력받을 수 있도록 하며,
// printf()메소드를 통해 출력할 수 있도록 구현한다.

// 실행 예)
// 이름 입력 : 홍은혜
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 홍은혜입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		
		// 1. 사용자로부터 이름을 입력받는다.		
		System.out.print("이름 입력 : ");
		name = br.readLine();


		System.out.print("수학 점수 : ");
		String strMat = br.readLine();
		
		// 3. 문자열 형태로 입력받은 점수를 정수형태로 변환
		
		int nKor = Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		// 2. 사용자로부터 국워, 영어, 수학 점수를 입력받는다.
		System.out.print("국어 점수 : ");
		String strKor = br.readLine();


		System.out.print("영어 점수 : ");
		String strEng= br.readLine();
		

		int nMat = Integer.parseInt(strMat);

		// 4. 산술 연산을 통해 총점과 평균 산출
		int nTot = nKor + nEng + nMat;
		double fAvg = nTot / 3.0;

		// 5. 등급에 대한 조건 검사

		char grade = 'F';				// -- 등급을 담기 위한 변수
										//	  선언 및 초기화

		if(fAvg >= 90)
			grade = 'A';
		else if (fAvg >= 80)	// 평균이 90 미만인 조건이 포함되어있음(fAvg < 90 && fAvg>=80)
			grade = 'B';	
		else if (fAvg >= 70)	// 평균이 80 미만인 조건이 포함되어있음
			grade = 'C';
		else if (fAvg >= 60)	// 평균이 70 미만인 조건이 포함되어있음
			grade = 'D';
		

		// 6. 최종 결과 출력
		System.out.printf(">> 당신의 이름은 %s입니다.%n", name);
		System.out.printf(">> 국어 점수는 %s,%n", strKor);
		System.out.printf(">> 영어 점수는 %s.%n", strEng);
		System.out.printf(">> 수학 점수는 %s,%n", strMat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.%n", nTot, fAvg);
		System.out.printf(">> 등급은 %c입니다.%n", grade);
	}
}

// 실행 결과

/*
이름 입력 : 김상기
국어 점수 : 90
영어 점수 : 89
수학 점수 : 67
>> 당신의 이름은 김상기입니다.
>> 국어 점수는 90,
>> 영어 점수는 89.
>> 수학 점수는 67,
>> 총점은 246이고, 평균은 82.00입니다.
>> 등급은 B입니다.
계속하려면 아무 키나 누르십시오 . . .
*/