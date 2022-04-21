/* ========================================================================
	    ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=========================================================================*/

// Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(Key)�� ��(Value)�� ����(mapping)�ϸ�
//   ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
//   �� Ű�� �� ���� �� ���� �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
�� Hashtable<K, V> Ŭ����

   - �ؽ����̺� ������ ��ü �𵨸��� Ŭ������
     �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

   - �ؽ����̺��̶� Ű(Key)�� �׿� �����ϴ� ������(value)��
     ���е� ������ �����̴�.

   - �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
     �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

   - ����, Hashtable Ŭ������ key �Ǵ� value�� ������ null �� ������� �ʴ´�.
*/
import java.util.Hashtable;

public class Test172
{
	private static final String[] names
		= {"�̿���", "��ȣ��", "������", "��μ�", "�ֹ���", "�̽ÿ�"};

	private static final String[] tells
		= {"010-4423-0463", "010-9600-1715", "010-9768-3110", "010-5154-6322", "010-2877-0992", "010-4428-9420"};

	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht ��� �ؽ����̺� �ڷᱸ���� �迭(names, tels)�� ����ִ�
		// �����͸� ��ҷ� ��Ƴ���
		// �� put(k, v);
		for (int i =0;i<names.length ;i++ )
		{
			ht.put(names[i], tells[i]);
		}

		// ht ��� �ؽ����̺��� ���� key�� �̿��Ͽ� �˻�
		// �� get(k)
		String findName1 = "������";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		}
		System.out.println();

		// ������ ��ȭ��ȣ : 010-9768-3110
		// ht��� �ؽ����̺� �ڷᱸ���� key�� �����ϴ� ���� ���� Ȯ��
		// containsKey()
		String findName2 = "�̾Ƹ�";
		if (ht.containsKey(findName2))
			System.out.println(findName2 + " ������ ������.");
		else
			System.out.println(findName2 + " ������ ������.");
		System.out.println();
		// �̾Ƹ� ������ ������.

		String findName3 = "�ֹ���";
		if (ht.containsKey(findName3))
			System.out.println(findName3 + " ������ ������");
		else
			System.out.println(findName3 + " ������");
		System.out.println();

		// ht��� �ؽ����̺� �ڷᱸ���� value�� �����ϴ����� ���� Ȯ��
		// contains()
		String findTel1 = "010-9600-1715";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " ����");
		else
			System.out.println(findTel1 + "��");
		System.out.println();

		// ht ��� Hashtable �ڷᱸ������ ����μ��� ������ ����
		// �� remove()
		ht.remove("��μ�");
		// ��remove()�� �޼ҵ�� ���ڰ����� key �� �Ѱܹ�����
		//  �̶� key �� �����Ǵ°� �ƴ϶� ����� value �� ���� ������
		//                               (���ε�)

		// ����(remove()) ���� key�� �����ϴ��� Ȯ��
		if (ht.containsKey("��μ�"))
			System.out.println("�μ��� ����");
		else
			System.out.println("�μ��� ��𰬾�?!");
		System.out.println();
		// �μ��� ��𰬾�?!

		if (ht.contains("010-5154-6322"))
		{
			System.out.println("����");
		}
		else
			System.out.println("����");
		System.out.println();
		// ����

		// �� null ���� ó��
		// ht.put(null, null); �� ��Ÿ�� �����߻�, key, value ��� null
		//     NullPointerException

		// ht.put("ȫ����", null); �� ��Ÿ�� �����߻�, value�� null
		// ht.put(null, "010-1234-5678"); �� ��Ÿ�� �����߻�, key�� null
		//   NullPointerException

		// �ߺ��� key �Է�
		ht.put("�̿���", "010-1111-1111");

		System.out.println(ht.get("�̿���"));
		System.out.println();
		// 010-1111-1111
		// ���� �����Ϳ� �������

		
		// �ߺ��� value �Է�
		ht.put("������", "010-2877-0992");
		System.out.println(ht.get("�ֹ���"));
		System.out.println(ht.get("������"));
		/*
		010-2877-0992
		010-2877-0992
		*/

		// �� value �� �ߺ��� ���� �ԷµǾ ���� �����Ϳ� �ƹ��� ������ ��ġ�� ����.



	}


}