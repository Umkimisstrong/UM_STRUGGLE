/*=====================
   ■■■ 배열 ■■■
=====================*/

// 배열의 배열(2차원 배열)

// ○ 과제
//	  배열의 배열(다차원 배열)을 활용하여
//	  다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//	  그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)

/*
	A	
	B	C	
	D	E	F	
	G	H	I	J	
	K	L	M	N	O

	00 01 02 03 04
	10 11 12 13 14
	20 21 22 23 24
	30 31 32 33 34
	40 41 42 43 44
계속하려면 아무 키나 누르세요...
*/

public class Test095
{
	public static void main(String[] args)
	{
		// 문자형 배열의 배열 선언
		char [][] arr = new char [5][5];

		// 배열에 담을 문자 선언
		char k = 'A';

		// 배열 연산 처리

		for (int i = 0;i < arr.length ; i++)		
		{
			for (int j = 0;j < arr[i].length ;j++ )
			{
				if (j > i)
				{
					arr[i][j] = ' ';	// j항이 i항을 넘어가면 공백처리
				}
				else if (j <= i)		// j항이 i항과 같게되는 경우는 알파벳 출력
				{	
					arr[i][j] = k;
					k++;				// 알파벳 ++~~
				}

			}
		}
	
		for (int i = 0;i < arr.length ;i++ )
		{
			for (int j = 0;j < arr[i].length ;j++ )
			{
				System.out.printf("%3c", arr[i][j]);		// 3칸공백 두고 출력
			}
			System.out.println();
		}
		
	}
}

// 실행 결과

/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/