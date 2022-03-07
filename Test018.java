/* ======================================
  ■ ■ ■ 자바 기본 프로그래밍 ■ ■ ■
======================================= */

// 자바의 기본 입출력 : System.out.printf()

public class Test018
{
	public static void main(String[] args)
		{
			System.out.print("AAA");
			System.out.print("BBB");
			System.out.print("CCC\n");     // -- 『\n』 개행

			System.out.println();			// -- 개행
			// System.out.print();
			//--==>> 에러 발생(컴파일 에러)

			System.out.printf("1234567890");
			System.out.printf("1234567890\n");  //--   
			System.out.printf("1234567890%n");  //

			// System.out.printf();
			//--==>> 에러 발생(컴파일 에러)


			System.out.printf("%d + %d = %d%n", 10, 20, 30);

			System.out.printf("%d\n", 123);
			System.out.printf("%10d\n", 123);
			System.out.printf("%8d\n", 1234);
			System.out.printf("%010d\n", 123);
			//--==>>  123
			//				123
			//			1234
			//		0000000123


			System.out.printf("%+d\n", 365);
			System.out.printf("+%d\n", 365);
			//--==>> +365
			//		 +365

			System.out.printf("%d\n", +365);
			//--==>> 365

			//System.out.printf("%-d\n", 365);
			//--==>> 에러 발생(런타임 에러)
			System.out.printf("-%d\n", 365);
			System.out.printf("%d\n", -365);
			//--==>> -365
			//		 -365

			//System.out.printf("%d\n", 'A');
			//--==>> 에러 발생(런타임 에러)
			System.out.printf("%c\n", 'C');
			//System.out.printf("%c\n", "ABCD");
			//--==>> 에러 발생(런타임 에러)
			System.out.printf("%s\n", "ABCD");
			//--==>> ABCD

			System.out.printf("%h\n", 365);    //-- 진법 변환
			//--==>> 16d
			System.out.printf("%o\n", 24);
			//--==>> 30
			System.out.printf("%b\n", true);
			System.out.printf("%b\n", false);
			//--==>> true
			//		 false
			System.out.printf("%f\n", 123.23);
			//--==>> 123.230000
			System.out.printf("%.2f\n", 123.23);
			//--==>> 123.23

			System.out.printf("%.2f\n", 123.231);
			//--==>> 123.23			// → 소숫점 이하 세번째 자리 절삭
			System.out.printf("%.2f\n", 123.235);
			//--==>> 123.24			// → 소숫점 이하 세번째 자리 올림

			System.out.printf("%8.2f\n", 123.236);
			//--==>>   123.24       // → '소숫점 포함' 총 자릿수가 8자릿수
									//    따라서 실행 시 앞2칸 공백

			System.out.printf("%.2f\n", 123.236);
			//--==>>123.24

			System.out.printf("%2.2f\n", 123.236);
			//--==>>123.24     표현하고자하는 수가 앞서 설정한 자릿수보다 많으면
							 //무시된다




		}
}

// 실행 결과

/*
AAABBBCCC

12345678901234567890
1234567890
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
C
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
123.24
계속하려면 아무 키나 누르십시오 . . .
*/