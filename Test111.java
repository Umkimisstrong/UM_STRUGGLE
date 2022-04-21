/*==================================
  ■■■ 정렬(sort) 알고리즘 ■■■
==================================*/

// 향상된 버블 정렬(Bubble Sort)

// ※ 앞에서 본 Selection Sort(Test109) Bubble Sort(Test110)
//    더 효율적인건 뭔가요?!   (→ 반복의 횟수로 추정)
//    결론 : 같다...... 반복의 횟수가 더 많아서
//    하지만, 향상된 Bubble Sort 는 대상 데이터의 구조에 따라서
//    일반 Bubble Sort 나 Selection Sort 보다 성능이 좋을 수 있다.(아닌경우도 있다는말임)

//    원본 데이터 : 61 15 20 22 30
//                  15 20 22 30 61 - 1회전(스왑 발생 점검 : true) → 다음 회전 진행 ○
//                  15 20 22 30 61 - 2회전(스왑 발생 점검 : false) → 다음 회전 진행 X

//==>> 1회전 수행.. 2회전 수행.. 을 해보았더니..
//	   2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
//     불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
//     수행하지 않는다.

// 실행 예)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50

// 조건부가 붙으면 1차적으로 if를 활용(트루 폴스 / 특정 수 / .. 활용도 높음)
//                 2차적으로 do ~ while 문을 활용(트루 / 폴스만을 볼거면)
//

public class Test111
{
	public static void main(String[] args)
	{
		int [] arr = {10, 50, 20, 30, 40};

		final int [] akk = {arr[0], arr[1], arr[2], arr[3], arr[4]};


		System.out.print("Source Data :");
		for (int n : akk)
			System.out.printf("%4d", n);
		System.out.println();
		/*
		10, 50, 20, 30, 40
		==  --
		10, 20, 50, 30, 40
		    ==  --
		10, 20, 30, 50, 40
			    ==  --
		10, 20, 30, 40, 50
				    ==  --
	    ------------------------ 1회전 → 스왑 발생  ( 최초 arr[i] == )
		10, 20, 30, 40, 50
        ==  --
		10, 20, 30, 40, 50
		    ==  --
		10, 20, 30, 40, 50
				==  --
	    ------------------------ 2회전 → 스왑 발생하지 않음
				
				
				X

				X

	    ------------------------ 3회전 → X
				X
	    ------------------------ 4회전 → X
		*/
		// 향상된 Bubble Sort 구현

		int k = 0;
		boolean x;


		do
		{	
			k++;								
			x = false;		// 조건부로 들어가서 검증해봤는데 자리바꿈이 안일어나면 false로 유지
							// x가 true 가 되는순간 종료하고 빠져나간다.
			for (int i = 0 ;i<arr.length-k ;i++ )   // 
			{
				// 테스트				System.out.println("회전확인용");
				if (arr[i]>arr[i+1])
				{
					arr[i] = arr[i]^arr[i+1];
					arr[i+1] = arr[i+1]^arr[i];
					arr[i] = arr[i]^arr[i+1];

					x = true;
				}
			
			}	
		}
		while (x);
		// -- x 변수가 false 라는 것은
		//    회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		//    더 이상의 반복문 수행은 무의미한 것으로 판단 가능~!!


			


		System.out.print("Sorted Data :");
		for (int n : arr)
			System.out.printf("%4d", n);
		System.out.println();


		

		
	}
}

// 실행 결과

/*
Source Data :  10  50  20  30  40
Sorted Data :  10  20  30  40  50
계속하려면 아무 키나 누르십시오 . . .
*/