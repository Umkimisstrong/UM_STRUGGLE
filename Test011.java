/* ======================================
   �� �� �� �ڹ��� ���� �� Ư¡ �� �� ��
======================================= */

// ������ �ڷ���
// ������ �ڷ��� �ǽ� �� �׽�Ʈ : double
// ������ ���� �ǽ�

public class Test011
{
	public static void main(String[] args)
	{
		// ������ ������ ������
		double a = 1 / 2 ;      // ������ ������ �������� ������ ���� ��ȯ
		//double a = 0;
	
		// ��� ���
		System.out.println("double a : " + a);
		//--==>> double a : 0.0     (���� �� ��ȯ �� ���� �� ���� ���Կ��� : ����ȯ)

		double b = 1/2 + 1/2;
		//double b = 0 + 1/2;  (���� ������ ����)
		//double b = 0 + 0;     (���� ������ ����)
		//double b = 0;    (int�� ���� 0)

		System.out.println("double b : " + b);
		//--==>> double b : 0.0

		// �� �����ڷ� �Ǽ��� ���ԵǾ� �ִ� ������
		double c = 1 / 2.0;
		System.out.println("double C : " + c);
		//--==>> double c : 0.5

		//-- ������ ����� �����Ͽ�
		//   �ǿ����� �� �Ǽ��� ���ԵǾ� �ִٸ�
		//   ������ �Ǽ� ����� ������ ����Ǹ�
		//   ����� ���� �Ǽ� ���·� ��ȯ�ȴ�.

		double d = 3/2 + 1/2;
		// double d = 1 + 1/2;
		// double d = 1 + 0;
		// double d = 1;
		System.out.println("double d : " + d);
		//--==>> double d : 1.0

		double e = 3/2 + 1/2.0;
		// double e = 1 + 1/2.0;
		// double e = 1 + 0.5;
		// double e = 1.5;
		System.out.println("double e : " + e);
		//--==>> double e : 1.5

	}
}

// ���� ���
/*
double a : 0.0
double b : 0.0
double C : 0.5
double d : 1.0
double e : 1.5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
