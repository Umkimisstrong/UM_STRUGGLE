/* ======================================
    ■ ■ ■ 연산자(Operator) ■ ■ ■
======================================= */

// 비트 단위 연산자
// 비트 쉬프트 연산자

public class Test027
{
	public static void main(String[] args)
	{
		int x = 128;										// 00000000 00000000 00000000 10000000
		
		System.out.printf("X << 3 : %d%n", x<<3);			// 00000000 00000000 00000100 00000000    << 
		System.out.printf("x * 8 : %d%n", x*8);				
		/* --==>>
		X << 3 : 1024
		x * 8 : 1024
		*/

		System.out.printf("x >> 3 : %d%n", x<<3);			// 00000000 00000000 00000000 00010000     >> 
		System.out.printf("x / 8 : %d%n", x/8);
		/* --==>>
		x >> 3 : 1024
		x / 8 : 16
		*/

		System.out.printf("x << 24 : %d%n", x << 24);
		//--==>> x << 24 : -2147483648
		// 10000000 00000000 00000000 00000000  (24칸 좌로 이동)
		
		System.out.printf("x << 24 : %d%n", x << 25);		// 원래 자리로 오기 전까지 0
		System.out.printf("x << 24 : %d%n", x << 26);		//           :
		System.out.printf("x << 24 : %d%n", x << 27);		//           :
		//					:								//           :
		//					:								//           :
		System.out.printf("x << 24 : %d%n", x << 31);		//           :
		System.out.printf("x << 24 : %d%n", x << 32);		// -- 원래자리로 돌아옴
	
		
	}
}