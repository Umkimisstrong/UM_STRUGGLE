/* ====================================
    ���� ����(Exception) ó�� ����
=====================================*/

// �ٸ� ���� �ٽ� ������

public class Test155
{
	public int getValue(int value)	throws Exception			// �� ���� ������
	{															//    �Ķ� ��ź
		int a = 0;
		
		try
		{
			a = getData(-2);									// �� ���� �߻�
		}														//    ������ź
		catch (Exception e)										// �� ���� ��Ƴ���
		{
			// �� ���� ��� (������ź)							//    ���� ��ź
			System.out.println("printStackTrace..........");
			e.printStackTrace();

			// �� ���� �߻�(�Ķ� ��ź)
			throw new Exception("value�� �����Դϴ�.");
		}


		return a;
	}

	public int getData(int data)	throws Exception			// �� ���� ������
	{															//    ������ź
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");	// �� ���� �߻�
		}														//    ������ź
		return data + 10;
	}

	public static void main(String[] args)		
	{
		Test155 ob = new Test155();

		try
		{
			int a = ob.getValue(-2);							// �� ���� �߻�
			System.out.println("a : " + a);						//    �Ķ� ��ź
		}
		catch (Exception e)										// �� ���� ��Ƴ���
		{														//    �Ķ� ��ź
			// �� ���� ó��(�Ķ� ��ź)
			System.out.println("printStackTrace......");
			e.printStackTrace();
		}

	}
}

// ���

/*
printStackTrace..........
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
        at Test155.getData(Test155.java:35)
        at Test155.getValue(Test155.java:15)
        at Test155.main(Test155.java:46)
printStackTrace......
java.lang.Exception: value�� �����Դϴ�.
        at Test155.getValue(Test155.java:24)
        at Test155.main(Test155.java:46)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/