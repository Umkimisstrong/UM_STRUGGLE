/* ======================================
   �� �� �� �ڹ��� ���� �� Ư¡ �� �� ��
======================================= */

// ������ �ڷ���
// ������ �ڷ��� �ǽ� �� �׽�Ʈ : boolean

public class Test009
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		boolean a = true;
		boolean b;

		int c = 10, d= 5;

		

		// ���� �� ó��(���� ���� �� ���� ����)
		// ** ���迬���� ��ȯ�� �׻� true / false �� ����
		b = c < d;
		// b = 10 < d;
		// b = 10 < 5;
		// b = false;

		// ��� ���
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		boolean k = true;
		if (30/3 == 10)
		{
			k = false;
			System.out.println("����� ���� : " + k);
		}


	}	

}

// ���� ���

/*
a : true
b : false
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/