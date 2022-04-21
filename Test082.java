/*	==============================
      ■■■ 배열 ■■■
==============================	*/

// 배열의 기본적 활용
//

// 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
// 프로그램을 구현한다.

// 배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8
// 3의 배수 선택적 출력
// 9 3 6
// 계속하려면 아무 키나 누르세요.....
public class Test082
{
	public static void main(String[] args)
	{
		int[] arr1;
		arr1 = new int[9];

		arr1[0] = 4;
		arr1[1] = 7;
		arr1[2] = 9;
		arr1[3] = 1;
		arr1[4] = 3;
		arr1[5] = 2;
		arr1[6] = 5;
		arr1[7] = 6;
		arr1[8] = 8;


		/*
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2};
		System.out.println(arr2.length);  배열의 길이
		// --==>> 21
		System.out.println(arr1.length);  배열의 길이
		// --==>> 9
		*/
		System.out.println("배열 요소 전체 출력");
		
		for (int i=0;i<arr1.length ;i++ )			// 루프시켜주는 변수는 배열의 길이에 맞춰야함.
		{	
			
			System.out.printf("%4d", arr1[i]);


		}
		System.out.println();


		System.out.println("짝수 선택적 출력");
		for (int i = 0;i<arr1.length ;i++ )
		{
			if (arr1[i]%2==0)			// 배열의 i번째 요소가 짝수라면
			{
				System.out.printf("%4d", arr1[i]);
			}
		}

	
		System.out.println();
			

		System.out.println("3의 배수 선택적 출력");
		for (int i=0;i<arr1.length ;i++ )
		{
			if (arr1[i]%3==0)			// 배열의 i번째 요소가 3의 배수라면
			{
				System.out.printf("%4d", arr1[i]);
			}
		}
		System.out.println();
	}
}

// 실행 결과
/*
배열 요소 전체 출력
   4   7   9   1   3   2   5   6   8
짝수 선택적 출력
   4   2   6   8
3의 배수 선택적 출력
   9   3   6
계속하려면 아무 키나 누르십시오 . . .
*/