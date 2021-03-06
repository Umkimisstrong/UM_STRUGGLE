/*==========================
	  ■■■ 배 열 ■■■
===========================*/
// 배열의 배열(2차원 배열)

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.


// 실행 예)
/*
1 2 3 4 5		i = 0      0 부터 출발		/ 5가되면 0으로시작해
5 1 2 3 4		i = 1      1 부터 출발		/ 5가되면 0으로시작해
4 5 1 2 3		i = 2      2 부터 출발		/ 5가되면 0으로시작해
3 4 5 1 2		i = 3      3 부터 출발		/ 5가되면 0으로시작해
2 3 4 5 1		i = 4      4 부터 출발		/ 5가되면 0으로시작해

 0 1 2 3 4 5 6 7 8      배열
-----------------
				 입력
 1 2 3 4 5
   1 2 3 4 5	'5번째 배열'가 나오면 '0번째 배열'으로 이동시켜서시작해
     1 2 3 4 5
	   1 2 3 4 5 
	     1 2 3 4 5

// 펼쳐놓은 모습 :     
// 1 2 3 4 5(출력시 개행) 5 1 2 3 4(출력시 개행) 4 5 1 2 3(출력시 개행) 3 4 5 1 2 (출력시 개행)2 3 4 5 1 
//
  실행        배열좌표[i][j]
1 2 3 4 5  00 01 02 03 04
5 1 2 3 4     11 12 13 14 15(10)
4 5 1 2 3        22 23 24 25(20, 다음 21)
3 4 5 1 2           33 34 35(30, 다음 31 다음 32) 	
2 3 4 5 1              44 45(40, 다음 41 다음 42 다음 43)
*/

// 대구빡을 잘써야되는게,
// 배열에 입력하는 실제 숫자와
// 배열 순서를 의미하는 숫자 중에 어떤 것을 루프로 삼을지
// 어떤 변수로 삼고 연산을 넣을지를 동시에 고민해야한다.
public class Test090
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		for (int i =0 ;i<arr.length ;i++ )		//  0	     1	       2	    3    	  4 
		{
			for (int j=i, n=1 ;n<=5 ;n++ )		// 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 51 2 3 4 5
			{

				arr[i][j] = n;

				j++;
				
				if (j==5)
				{
					j=0;
				}

			}
				
		}
		

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr.length ;j++ )
			{
			System.out.printf("%3d", arr[i][j]);
			}

			System.out.println();
		}
	}
}

/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/