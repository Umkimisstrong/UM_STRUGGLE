/* ======================================
   �� �� �� �ڹ��� ���� �� Ư¡ �� �� ��
======================================= */

// ������ �ڷ���
// ������ �ڷ��� �ǽ� �� �׽�Ʈ : char

public class Test010
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		char ch1, ch2, ch3;
		int a;					//-- check~!!!

		


		// ���� �� ó��(���� ����)
		ch1 = 'A';
		ch2 = '\n';  // ������ ���
		ch3 = '��';
		//a = ch1;				//-- check~!!!
		a = (int)ch1;

		// ��� ���
		System.out.println("ch1 : " + ch1);
		//--==>> ch1 : A
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		//--==>> ch3 : ��
		System.out.println("a : " + a);
		//--==>> a : 65


	}

}

// ���� ���
/*
ch1 : A
ch2 :

ch3 : ��
a : 65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/