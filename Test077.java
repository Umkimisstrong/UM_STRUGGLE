/* ==================================
    ���� Ŭ������ �ν��Ͻ� ����
================================= */

// ������(Constructor)

class NumberTest2
{
	int num;
	

	// ����� ���� �����ڰ� ���ǵǾ� �����Ƿ� default �����ڰ� �ڵ����� �����ȵ�
	/*
	NumberTest2()
	{
	}
	*/ 
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);

	}

	int getNum()
	{
		return num;
	}
}
public class Test077
{
	public static void main(String[] args)
	{
		// NumberTest2 �ν��Ͻ� ����
		// NumberTest2 ob1 = new NumberTest2();
		//--==>> �����߻�(�����Ͽ���)
		//-- NumberTest2 Ŭ��������
		//	 ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		//	 ��default �����ڡ� �� �ڵ����� ���Ե��� ������
		//	 ����ڰ� ������ �����ڴ� �Ű������� ���� �����̱⶧���� int n
		//	 ���� ���� �Ű����� ���� ������ ȣ�� �� ������ ����� ���̴�.


		NumberTest2 ob1 = new NumberTest2(10);
		// --==>> ������ ȣ�� �� �Ű����� ���� : 10

		System.out.println("�޼ҵ��ȯ �� : " + ob1.getNum());
		// --==>> �޼ҵ��ȯ �� : 10


		NumberTest2 ob2 = new NumberTest2(3454);
		System.out.println("�޼ҵ��ȯ �� : " + ob2.getNum());
		// --==>>
		/*
		������ ȣ�� �� �Ű����� ���� : 3454
		�޼ҵ��ȯ �� : 3454
		*/
		}
}