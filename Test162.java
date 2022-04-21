/* ========================================================================
	    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=========================================================================*/

// Vector

import java.util.Vector;
import java.util.Collections;

public class Test162
{

	private static final String[] colors
		= {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();

		for (String color : colors)
		{
			v.add(color);
		}
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("마지막 요소  : " + v.lastElement());
		System.out.println("요소의 갯수  : " + v.size());
		/*
		첫 번째 요소 : 검정
		두 번째 요소 : 노랑
		마지막 요소  : 연두
		요소의 갯수  : 6
		계속하려면 아무 키나 누르십시오 . . .
		*/



		// 첫번째 요소를 하양으로 변경 : set() → 덮어쓰기, 요소의 갯수 변화 X
		v.set(0, "하양");
		System.out.println("첫 번째 요소 : " + v.firstElement());
		// 첫 번째 요소 : 하양
		System.out.println("두 번째 요소 : " + v.get(1));
		// 두 번째 요소 : 노랑
		System.out.println("요소의 갯수  : " + v.size());
		// 요소의 갯수  : 6




		// 첫 번째 요소에 "주황" 추가 : insertElementAt()
		v.insertElementAt("주황", 0);
		



		System.out.print("전체 출력 : ");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();
		// 전체 출력 : 하양 노랑 초록 파랑 빨강 연두
		// 전체 출력 : 주황 하양 노랑 초록 파랑 빨강 연두







		// 오름차순 절령
		Collections.sort(v);

		// ○ 오름차순 정렬 후 전체 출력(가나다 : 사전식 배열 순 정렬)
		System.out.print("오름차순 정렬 후 전체 출력 : ");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();
		// 오름차순 정렬 후 전체 출력 : 노랑 빨강 연두 초록 파랑 하양
		// 오름차순 정렬 후 전체 출력 : 노랑 빨강 연두 주황 초록 파랑 하양





		// ○ 검색
		// Collections.binarySearch();
		// 검색 기능 수행
		// 단, 오름차순 정렬이 수행되어 있는 자료에 대해서만 사용이 가능하다.
		// 검색 결과가 존재하지 않을경우 음수를 반환한다.

		int idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d 번째 인덱스에 위치한다 이놈아! \n", idxBlue);
		System.out.println();
		// 파랑 : 4 번째 인덱스에 위치한다 이놈아!
		// 파랑 : 5 번째 인덱스에 위치한다 이놈아!
		
		int idxNavi = Collections.binarySearch(v, "남색");

		System.out.printf("남색 : %d 번째 인덱스에 위치한다 이년아! \n", idxNavi);
		// 남색 : -1 번째 인덱스에 위치한다 이년아!
		//        └> 검색결과 없음


		System.out.println(); // 개행






		// ○ 내림차순 정렬 → 오름차순정렬 메소드 매개변수에, reverseOrder()
		//    Order : Sequence 자료구조에 쓰임
		Collections.sort(v, Collections.reverseOrder());
		System.out.print("내림차순 정렬 후 전체 출력 : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		// 내림차순 정렬 후 전체 출력 : 하양 파랑 초록 주황 연두 빨강 노랑

		// ※ 내림차순 정렬 후 검색 테스트

		idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d번째 인덱스에 위치하는데?", idxBlue);
		System.out.println();
		// 파랑 : -8번째 인덱스에 위치하는데?
		//        └> 검색 결과 없음

		idxBlue = Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.printf("파랑 : %d번째 인덱스에 위치하고 있다. \n", idxBlue);
		System.out.println();
		// 파랑 : 1번째 인덱스에 위치하고 있다.
	}
}

/*
첫 번째 요소 : 검정
두 번째 요소 : 노랑
마지막 요소  : 연두
요소의 갯수  : 6
첫 번째 요소 : 하양
두 번째 요소 : 노랑
요소의 갯수  : 6
전체 출력 : 주황 하양 노랑 초록 파랑 빨강 연두
오름차순 정렬 후 전체 출력 : 노랑 빨강 연두 주황 초록 파랑 하양
파랑 : 5 번째 인덱스에 위치한다 이놈아!

남색 : -1 번째 인덱스에 위치한다 이년아!

내림차순 정렬 후 전체 출력 : 하양 파랑 초록 주황 연두 빨강 노랑
파랑 : -8번째 인덱스에 위치하는데?
파랑 : 1번째 인덱스에 위치하고 있다.

계속하려면 아무 키나 누르십시오 . . .
*/