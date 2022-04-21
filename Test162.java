/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/

// Vector

import java.util.Vector;
import java.util.Collections;

public class Test162
{

	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();

		for (String color : colors)
		{
			v.add(color);
		}
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������ ���  : " + v.lastElement());
		System.out.println("����� ����  : " + v.size());
		/*
		ù ��° ��� : ����
		�� ��° ��� : ���
		������ ���  : ����
		����� ����  : 6
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/



		// ù��° ��Ҹ� �Ͼ����� ���� : set() �� �����, ����� ���� ��ȭ X
		v.set(0, "�Ͼ�");
		System.out.println("ù ��° ��� : " + v.firstElement());
		// ù ��° ��� : �Ͼ�
		System.out.println("�� ��° ��� : " + v.get(1));
		// �� ��° ��� : ���
		System.out.println("����� ����  : " + v.size());
		// ����� ����  : 6




		// ù ��° ��ҿ� "��Ȳ" �߰� : insertElementAt()
		v.insertElementAt("��Ȳ", 0);
		



		System.out.print("��ü ��� : ");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();
		// ��ü ��� : �Ͼ� ��� �ʷ� �Ķ� ���� ����
		// ��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����







		// �������� ����
		Collections.sort(v);

		// �� �������� ���� �� ��ü ���(������ : ������ �迭 �� ����)
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();
		// �������� ���� �� ��ü ��� : ��� ���� ���� �ʷ� �Ķ� �Ͼ�
		// �������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�





		// �� �˻�
		// Collections.binarySearch();
		// �˻� ��� ����
		// ��, �������� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� ����� �����ϴ�.
		// �˻� ����� �������� ������� ������ ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�Ѵ� �̳��! \n", idxBlue);
		System.out.println();
		// �Ķ� : 4 ��° �ε����� ��ġ�Ѵ� �̳��!
		// �Ķ� : 5 ��° �ε����� ��ġ�Ѵ� �̳��!
		
		int idxNavi = Collections.binarySearch(v, "����");

		System.out.printf("���� : %d ��° �ε����� ��ġ�Ѵ� �̳��! \n", idxNavi);
		// ���� : -1 ��° �ε����� ��ġ�Ѵ� �̳��!
		//        ��> �˻���� ����


		System.out.println(); // ����






		// �� �������� ���� �� ������������ �޼ҵ� �Ű�������, reverseOrder()
		//    Order : Sequence �ڷᱸ���� ����
		Collections.sort(v, Collections.reverseOrder());
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		// �������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

		// �� �������� ���� �� �˻� �׽�Ʈ

		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϴµ�?", idxBlue);
		System.out.println();
		// �Ķ� : -8��° �ε����� ��ġ�ϴµ�?
		//        ��> �˻� ��� ����

		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϰ� �ִ�. \n", idxBlue);
		System.out.println();
		// �Ķ� : 1��° �ε����� ��ġ�ϰ� �ִ�.
	}
}

/*
ù ��° ��� : ����
�� ��° ��� : ���
������ ���  : ����
����� ����  : 6
ù ��° ��� : �Ͼ�
�� ��° ��� : ���
����� ����  : 6
��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����
�������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�
�Ķ� : 5 ��° �ε����� ��ġ�Ѵ� �̳��!

���� : -1 ��° �ε����� ��ġ�Ѵ� �̳��!

�������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���
�Ķ� : -8��° �ε����� ��ġ�ϴµ�?
�Ķ� : 1��° �ε����� ��ġ�ϰ� �ִ�.

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/