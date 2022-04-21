/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/

// ���� Stack

import java.util.Stack;
public class Test157
{
	private static final String[] colors
		 = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public Test157()
	{
		Stack<String> st = new Stack<String>();
		// st = colors; x
		for(String color : colors)
		{
			st.push(color);
		}

		st.push("����");
		//st.push(10);
		//st.push(10.0);
		// ������ ����(���׸�ǥ���Ŀ� ���Ծȉ�)
		// String�� �ƴ� �ٸ��͵��� �ڲ� ���������ڳ�(st�� �װԾƴѵ�)
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

// ���� ���

/*
pop : ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . .
*/