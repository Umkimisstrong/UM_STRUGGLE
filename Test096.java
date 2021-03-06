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
	C	B	
	D	E	F	
	J	I	H	G	
	K	L	M	N	O

	00 
	10 11
	20 21 22
	30 31 32 33
	40 41 42 43 44

계속하려면 아무 키나 누르세요...
*/

public class Test096
{
	public static void main(String[] args)
	{
		char [][] arr = new char[5][5];

		char k = 'A';


		for (int i = 0;i < arr.length ;i++ )
		{
			for (int j = 0;j < arr[i].length ;j++ )
			{
				if (j>i)
				{
					arr[i][j] = ' ';
				}
				else
				{
					if (i%2!=0)				
					{
						arr[i][i-j] = k;		// 역순으로 알파벳채우기

					}
					else
					arr[i][j] = k;			
				k++;
				}
		
			}
		}

		for (int i = 0;i < arr.length ;i++ )
		{
			for (int j = 0;j < arr[i].length ;j++ )
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}

	}
}

// 실행 결과

/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/