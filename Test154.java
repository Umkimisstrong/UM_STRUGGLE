/* ====================================
    ���� ����(Exception) ó�� ����
=====================================*/

// ���� ���� �ٽ� ������

// ���� ���ܸ� �ٽ� ������ ���� :::::
// 
public class Test154
{
	public static void main(String[] args)	
	{
		Test154 ob = new Test154();
		try
		{
			int a = ob.getValue(-2);	// �� ���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)				// �� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���� ó��
			System.out.println("�� printStackTrace...................");
			e.printStackTrace();
		}
	}

	public int getData(int data)	throws Exception
	{
		if (data < 0)
		{
			throw new Exception("data �� 0���� �۽��ϴ�.");
			// �� ���� �߻�
		}
		return data + 10;
	}
									// �� ��Ƴ� ���ܸ� �ٽ� �߻���Ų ���� ������ �����ϵ��� ó��
	public int getValue(int value)	throws Exception
	{
		int a = 0;
		try
		{
			a = getData(-2);	// �� ���� �߻�
		}
		catch (Exception e)		// �� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("�� printStackTrace.....");
			e.printStackTrace();
			// check ~!!
			// �� ��Ƴ� ���ܸ� �ٽ� �߻���Ű��
			throw e;
			//-- 
		}
		return a;
	}
}

