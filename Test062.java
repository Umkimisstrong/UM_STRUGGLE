/* ===============================================
	■ ■ ■ 실행 흐름의 컨트롤(제어문) ■ ■ ■	
=================================================*/

// 반복문(for 문) 실습
// 다중 for 문 (반복문의 중첩)을 활용한 구구단 출력 실습

// ① 2중첩을 두번쓰는 방법
// ② 3중첩을 한번쓰는 방법

// 실행 예)
/*
2 * 1 =  2 3 * 1 = 3  4 * 1 = 4   5 * 1 = 5
2 * 2 =  4
2 * 3 =  6
2 * 4 =  8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

6 * 1 =  6 7 * 1 = 7  8 * 1 = 8   9 * 1 = 9




*/

public class Test062
{
	public static void main(String[] args)
	{
		int a, b, c;

		// 2중첩

		/*
		for (a=1; a<=9; a++)
		{

			
			for (b=2;b<=5 ;b++ )
			{
			
				
				System.out.printf("%2d * %2d = %2d", b, a, (a*b));
				if (b==5)
				{
					System.out.println();
				}

			}
		}

		System.out.println();

		for (a=1; a<=9; a++)
		{

			
			for (c=6;c<=9 ;c++ )
			{
			
				
				System.out.printf("%2d * %2d = %2d", c, a, (a*c));
				if (c==9)
				{
					System.out.println();
				}

			}
		}		
		
		*/
		

		// 3중첩

		
		for (int k=0; k<2 ;k++)
		{
		
			for (a=1; a<=9; a++)
			{

				for (b=2;b<=5 ;b++ )
				{
			
				
					System.out.printf("%2d * %2d = %2d", (b+k*4), a, (a*b));
					if (b==5)
					{
					System.out.println();
					}
					

				}
			
			}
			

			System.out.println();
		}

		
	}
}


// 실행 결과

/*
 2 *  1 =  2 3 *  1 =  3 4 *  1 =  4 5 *  1 =  5
 2 *  2 =  4 3 *  2 =  6 4 *  2 =  8 5 *  2 = 10
 2 *  3 =  6 3 *  3 =  9 4 *  3 = 12 5 *  3 = 15
 2 *  4 =  8 3 *  4 = 12 4 *  4 = 16 5 *  4 = 20
 2 *  5 = 10 3 *  5 = 15 4 *  5 = 20 5 *  5 = 25
 2 *  6 = 12 3 *  6 = 18 4 *  6 = 24 5 *  6 = 30
 2 *  7 = 14 3 *  7 = 21 4 *  7 = 28 5 *  7 = 35
 2 *  8 = 16 3 *  8 = 24 4 *  8 = 32 5 *  8 = 40
 2 *  9 = 18 3 *  9 = 27 4 *  9 = 36 5 *  9 = 45

 6 *  1 =  6 7 *  1 =  7 8 *  1 =  8 9 *  1 =  9
 6 *  2 = 12 7 *  2 = 14 8 *  2 = 16 9 *  2 = 18
 6 *  3 = 18 7 *  3 = 21 8 *  3 = 24 9 *  3 = 27
 6 *  4 = 24 7 *  4 = 28 8 *  4 = 32 9 *  4 = 36
 6 *  5 = 30 7 *  5 = 35 8 *  5 = 40 9 *  5 = 45
 6 *  6 = 36 7 *  6 = 42 8 *  6 = 48 9 *  6 = 54
 6 *  7 = 42 7 *  7 = 49 8 *  7 = 56 9 *  7 = 63
 6 *  8 = 48 7 *  8 = 56 8 *  8 = 64 9 *  8 = 72
 6 *  9 = 54 7 *  9 = 63 8 *  9 = 72 9 *  9 = 81
계속하려면 아무 키나 누르십시오 . . .

*/

			// ■■■ Type A ■■■


// ① Test061과 비교하여
//    출력의 방향이 다르기 때문에
//	  반복문의 제어 흐름도 달라져야 한다.
//	  (콘솔 기반의 출력 환경이기 때문에...)

// ② (1)에 따라...
//	  단과 곱해지는 수의 위치가
//	  달라진 상태에서의 반복문 구성
/*
for(int i =1; i<=9; i++)		// 웅 → 곱해지는 수
{
		for (int j=2; j<=5; j++)	// 쑝 → 단
		{
			System.out.printf("%4d * %d = %2d", j, i, (j*i));
			

		}
		System.out.println();	// 개행
}
*/

// ③ 2에서 처리한 결과를
//	  두 문단으로 반복하는 반복문 구성
//	  (check~!!!!!!! 반복문에 (2)의 결과를 삽입)


/*
for(int h=0; h<2; h++)
{
	for(int i =1; i<=9; i++)		// 웅 → 곱해지는 수
	{
			for (int j=2; j<=5; j++)	// 쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (j*i));
			}
			System.out.println();	// 개행
	}
	System.out.println();	// 개행
}

*/

// ④ 같은 구문을 두 문단으로 나누어 처리하는 과정에서
//	  문단에 따라 주어진 환경(h의 값)을 활용하는 방법으로
//	  최종 반복문 3중첩
/*
for(int h=0; h<2; h++)				// 문단 구성 → 0 1 → 두번 반복
{
	for(int i =1; i<=9; i++)		// 곱해지는 수 구성 → 1 2 3 4 5 6 7 8 9
	{	
			for (int j=2; j<=5; j++)	// 단 구성 → 2 3 4 5 6 7 8 9
			{
				System.out.printf("%4d * %d = %2d", h*4+j, i, ((h*4+j)*i));
			}
			System.out.println();	// 개행
	}
	System.out.println();	// 개행
}
*/



/*
int a, b, c;
for(a=2; a<=6; a+=4)				// 2  6
{
	for(b=1; b<=9; b++)				// 1 2 3 4 5 6 7 8 9
	{
		for(c=a; c<=(a+3); c++)		// a가 2일때, → 2 3 4 5 까지 쓩쓩
									// a가 6일때. → 6 7 8 9 까지 쓩쓩
		{
			System.out.printf("%4d * %d = %2d", c, b, (c*b));
		}
		System.out.println();
	}
	System.out.println();
}
*/