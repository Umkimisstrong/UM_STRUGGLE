/* ========================================================================
	    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=========================================================================*/

/*
○ 큐(Queue)
   
   큐(Queue)는 FIFO(First Input First Output)구조로
   먼저 입력된 자료를 먼저 출력하며
   Queue 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.

※ Queue 인터페이스 인스턴스를 생성하기 위해서는
   new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
   클래스의 생성자를 호출한다.

   ex) Queue ob = new LinkedList();

○ 주요 메소드

   - E element()
     큐의 head 요소를 반환하며 삭제하지 않는다.

   - boolean offer(E o)
     지정된 요소를 큐에 삽입한다.
   
   - E peek()
     큐의 head 요소를 반환하고 삭제하지 않으며
	 큐 자료구조가 empty 인 경우 null을 반환한다.

   - E poll()
     큐의 head 요소를 반환하고 삭제하며
	 큐 자료구조가 empty 인 경우 null을 반환한다.

   - E remove()
     큐의 head 요소를 반환하고 삭제한다.

*/


import java.util.Queue;
import java.util.LinkedList;

public class Test158
{

	public static void main(String[] args)
	{
		// Queue 자료구조 생성, 인터페이스라 인스턴스생성 못함..... 
		Queue<Object> myQue = new LinkedList<Object>();

		String str1 = "우수정";
		String str2 = "이지연";
		String str3 = "박현수";
		String str4 = "이윤태";

		// myQue 라는 Queue 자료구조에 데이터 추가해보자
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);
		
		// 테스트(확인)
		// System.out.println(myQue);
		// 더미 데이터 → [우수정, 이지연, 박현수, 이윤태]

		// Queue 자료구조에서 요소를 제고하지 않고 head 요소 반환
		System.out.println("값1 : " + (String)myQue.element());
		System.out.println("값2 : " + (String)myQue.element());
		/*
		값1 : 우수정
		값2 : 우수정
		*/ 
		System.out.println();

		String val;

		// ①
		/*
		while (myQue.peek() != null)
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/

		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/
		
		// ②
		
		/*
		while (true)
		{
			val = (String)myQue.poll();

			if(val==null)
				break;
			else
				System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/

		// ③
		/*
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/

		/*
		요소 : 우수정
		요소 : 이지연
		요소 : 박현수
		요소 : 이윤태
		*/
	
		/* 테스트
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		/*
		요소 : 이지연
		요소 : 이윤태
		*/
		






		
	}



}