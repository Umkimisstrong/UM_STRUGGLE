/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/

// �˻� �� ����

import java.util.Vector;

public class Test163
{
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();

		for (String color : colors )
			v.add(color);

		// ���� �ڷᱸ�� v �� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();
		// ��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����
		

		String s1 = "��ȫ";

		int i = v.indexOf(s1);
		System.out.println(s1 + " �� index ��ġ : " + i);
		// ��ȫ �� index ��ġ : -1


		String s2 = "���";

		// contains()
		// ��v.contains(s)��
		//  -- ���� �ڷᱸ�� v �� ã���� �ϴ� s�� ���ԵǾ� �ִٸ�..(true ��ȯ)
		//     �� index ��ġ Ȯ��

		if (v.contains(s2))
		{
			i = v.indexOf(s2);
			System.out.println(s2 + " �� index ��ġ : " + i);

			// �켱 ���� �ڵ带 ���� ã��...
			// ã���� �����ض�(�����ض�)
			v.remove(i);
		}
		// ����� index ��ġ : 1
		
		// ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("���� �� ��ü ��� ��� : ");
		for (String str : v)
			System.out.print(str  + " ");
		System.out.println();
		// ���� �� ��ü ��� ��� : ���� �ʷ� �Ķ� ���� ����


		// �߰� ���ǻ��� 

		System.out.println(colors);
		// [Ljava.lang.String;@15db9742

		System.out.println(v);
		// [����, �ʷ�, �Ķ�, ����, ����]
		
		// Ȯ�ο� ���� �����ʹ� ���� ���(������)���ƴϱ� ������
		// �̸� Ȱ���Ͽ� ������ �����ϰ� ó���ؼ��� �ȵȴ�.

	}
}
/*
��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����
��ȫ �� index ��ġ : -1
����� index ��ġ : 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/