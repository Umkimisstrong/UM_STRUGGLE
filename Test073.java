/*=============================
■■■ 클래스와 인스턴스 ■■■ 
=============================*/

// CircleTest.java 와 세트
// public class 를 두개 생성

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java
// BufferedReader 의 readLine()

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx

// >> 반지름이 xx 인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요..

import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{	
		// CircleTest 인스턴스 생성
		// 혹은 CircleTest 객체 생성
		CircleTest ct = new CircleTest();
		
		// 입력메소드 호출
		ct.input();

		// 넓이와 둘레 담기
		double a = ct.calArea();
		double l = ct.calLength();
		

		// 최종 결과 출력메소드 호출

		ct.print(a, l);

	}
}