/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/


import java.util.Queue;
import java.util.LinkedList;

public class Test159
{
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		Queue<String> qu = new LinkedList<String>();
		// qu ��� Queue �ڷᱸ����
		// colors �迭�� ������ �Է� �� offer()
		
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



		// qu ��� Queue �ڷᱸ���� ��� ������ ��ü ���
		// peek()
		// : head ��ȯ �� ���� ����

		// poll()
		// : head ��ȯ �� ����

	}
}

/*
Colors are .... : ����
Colors are .... : ���
Colors are .... : �ʷ�
Colors are .... : �Ķ�
Colors are .... : ����
Colors are .... : ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/