/* ========================================================================
	    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=========================================================================*/

// 스택 Stack

import java.util.Stack;
public class Test157
{
	private static final String[] colors
		 = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public Test157()
	{
		Stack<String> st = new Stack<String>();
		// st = colors; x
		for(String color : colors)
		{
			st.push(color);
		}

		st.push("보라");
		//st.push(10);
		//st.push(10.0);
		// 컴파일 에러(제네릭표현식에 포함안됌)
		// String이 아닌 다른것들을 자꾸 넣으려했자나(st는 그게아닌데)
		popStack(st);
	}

	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");

		while (!st.empty())
		{
			System.out.print(st.pop() + " ");
		}

		System.out.println();
	}


	public static void main(String[] args)
	{
		
		new Test157();

	}
}

// 실행 결과

/*
pop : 연두 빨강 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . .
*/