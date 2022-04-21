/* ===================================================
      ■ ■ ■  자바의 주요(중요) 클래스 ■ ■ ■
====================================================*/

// Wrapper 클래스  
import java.math.BigDecimal;

public class Test135
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		BigDecimal b = a.movePointLeft(3);	// 소수점을 왼쪽으로 이동
		System.out.println("처리 결과 : " + b);
		//처리 결과 : 123456.789123456789
		
		// 나눗셈 연산(대체 속성 확인 , 반올림, 안함 절삭 처리한다.)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("처리 결과 : " + c);
		// 처리 결과 : 1000.000000000

		//BigInteger 객체로 변환
		System.out.println(a.toBigInteger());
		// 처리 결과 : 123456789

		
	}
}
/*
처리 결과 : 123456.789123456789
처리 결과 : 1000.000000000
123456789
계속하려면 아무 키나 누르십시오 . . .
*/
