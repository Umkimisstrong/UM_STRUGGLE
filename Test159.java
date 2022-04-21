/* ========================================================================
	    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=========================================================================*/


import java.util.Queue;
import java.util.LinkedList;

public class Test159
{
	private static final String[] colors
		= {"검정", "노랑", "초록", "파란", "빨강", "연두"};

	public static void main(String[] args)
	{
		Queue<String> qu = new LinkedList<String>();
		// qu 라는 Queue 자료구조에
		// colors 배열의 대이터 입력 → offer()
		
		for (String color : colors )
		{
			qu.offer(color);
		}

		while (qu.peek()!=null)
		{
			System.out.print("Colors are .... : ");
			System.out.println(qu.poll()+ " ");
		}
		System.out.println();



		// qu 라는 Queue 자료구조의 모든 데이터 전체 출력
		// peek()
		// : head 반환 후 삭제 안함

		// poll()
		// : head 반환 후 삭제

	}
}

/*
Colors are .... : 검정
Colors are .... : 노랑
Colors are .... : 초록
Colors are .... : 파란
Colors are .... : 빨강
Colors are .... : 연두
계속하려면 아무 키나 누르십시오 . . .
*/