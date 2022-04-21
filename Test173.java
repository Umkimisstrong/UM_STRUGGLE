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
�� HashMap<K, V> Ŭ����
  
   - Hashtable Ŭ������ ���������� Map �������̽����� ��ӹ���
     HashMap Ŭ������ ����� Hashtable�� ����������
	 Synchronozation �� ���� ������ ���ü� ������ ���ٸ�
	 (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
	 HashMap�� ����ϴ� ���� ������ ����ų �� �ִ�.

   - ����, HashMap �� Hashtable Ŭ�����ʹ� �޸� null �� ����Ѵ�.
*/
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test173
{
	public static void main(String[] args)	throws IOException
	{
		// HashMap �ڷᱸ�� �ν��Ͻ� ����
		// hashMap<String, String> map = new HashMap<Strinig, String>();
		Map<String, String> map = new HashMap<String, String>();  // ��ĳ����

		// map �̶�� �ؽ��� �ڷᱸ���� ��� �߰�
		// �� put();
		map.put("���", "���¿�Ŭ��");
		map.put("��ȭ", "�����̴���");
		map.put("��ȭ", "������ũ");

		// System.out.println(map);
		// {���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}

		// null �Է� �õ�
		map.put(null, null);
		map.put("�Ҽ�", null);
		map.put(null, "�����ϴ»��");
		// ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		// ������ null �� key �� ���ε� �����ϴ»�� ��
		// ���� null �� key �� �����ϴ� null �� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		// �� HashMap �� null �� �ϳ��� ������ key�� �����Ѵ�.
		
		System.out.println(map);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ī���ڸ�,Ÿ��Ʋ �Է�(�ĸ� ����) : ");

		String [] temp;

		for (String str ; (str=br.readLine()) != null;)		// Ctrl + z : null
		{
			temp = str.split(",");
			if (temp.length<2)
			{
				System.out.print("ī���ڸ�,Ÿ��Ʋ �Է�(�ĸ� ����) : ");
				continue;
			}
			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}


	}
}