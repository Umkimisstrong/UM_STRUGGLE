/* ==================================
    ���� Ŭ������ �ν��Ͻ� ����
================================= */

// ������(Constructor) ����


public class Test079
{
	int val1;				// int �����ϳ�
	double val2;			// double �Ǽ��ϳ�

	char k;
	Test079()				// Ŭ���� ���ο��� ������ ����� 1
	{
		val1=0;
		val2=0;

		System.out.println("�Ű����� ���� ������...");

	}
	Test079(int x)		// Ŭ���� ���ο��� ������ ����� 2(��Ʈ��)
	{
		val1=x;
		val2=0;
		System.out.println("int �� �����͸� �Ű������� �޴� ������...");
	}

	Test079(double y) 	// Ŭ���� ���ο��� ������ �����3(������)
	{
		val1=0;
		val2=y;
		System.out.println("double �� �����͸�  �Ű������� �޴� ������...");
	}

	Test079(int x, double y) 	// Ŭ���� ���ο��� ������ �����4(��Ʈ, ���� ��)
	{
		val1 = x;
		val2 = y;
		System.out.println("int�� ������ double �� ������ �Ű������� �޴� ������...");
	}



	public static void main(String[] args)
	{

		Test079 ob1 = new Test079();
		// �Ű����� ���� ������...
		
		Test079 ob2 = new Test079(4);
		// int �� �����͸� �Ű������� �޴� ������...

		Test079 ob3 = new Test079(4.0);
		// double �� �����͸�  �Ű������� �޴� ������...

		Test079 ob4 = new Test079(4, 4.0);
		// int�� ������ double �� ������ �Ű������� �޴� ������...

		System.out.println(ob1.val1 + ", " + ob1. val2);
		// 0, 0.0
		System.out.println(ob2.val1 + ", " + ob2. val2);
		// 4, 0.0
		System.out.println(ob3.val1 + ", " + ob3. val2);
		// 0, 4.0
		System.out.println(ob4.val1 + ", " + ob4. val2);
		// 4, 4.0






	}
}

//

/*
�Ű����� ���� ������...
int �� �����͸� �Ű������� �޴� ������...
double �� �����͸�  �Ű������� �޴� ������...
int�� ������ double �� ������ �Ű������� �޴� ������...
0, 0.0
4, 0.0
0, 4.0
4, 4.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/