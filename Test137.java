/* ===================================================
      ■ ■ ■  자바의 주요(중요) 클래스 ■ ■ ■
====================================================*/

// Wrapper 클래스  

public class Test137
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		/*
		2147483647
		-2147483648
		계속하려면 아무 키나 누르십시오 . . .
		*/


		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		/*
		9223372036854775807
		-9223372036854775808
		*/


		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		/*
		1.7976931348623157E308
		4.9E-324
		*/

		System.out.println();

		System.out.println("1 : " + 3.0/0);
		// 1 : Infinity
		System.out.println("2 : " + -3.0/0);
		// 2 : -Infinity
		
		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		/*
		3 : true
		4 : false ( 양의 무한과 음의 무한은 다르다)
		*/

		// 『Double.isInfinite()』 무한인지 아닌지 확인하는 메소드
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		// 5 : true ( 양의 무한도 무한이다 )
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		// 6 : true ( 음의 무한도 무한이다 )

		System.out.println("7 : " + (3.0/0 + -3.0/0));
		// 7 : NaN     (→ Not a Number)
		System.out.println("8 : " + (0.0/0));
		// 8 : NaN

		System.out.println("9 : " + (0.0/0 == 0.0/0));
		// 9 : false
		// ※ NaN(Not a Number) 값과 임의의 수를
		//    『 == 』 비교 연산자를 통해 비교 연산을 수행하게 되면
		//    결과는 언제나 『 false 』를 반환..
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		// 10 : true


		// 『Double.isNaN()』 NaN인지 아닌지 확인하는 메소드
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1+2.2));
		/*
		11 : true
		12 : false		
		*/


	}
}