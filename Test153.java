/* ====================================
    ���� ����(Exception) ó�� ����
=====================================*/

// Test152.java ���ϰ� ��

// �� throw	(���ܸ� �߻���ų�� ���°�)	cf ) throws (���ܸ� ���ٶ� ���°�)


class Demo
{
	private int value;

	public void setValue(int value)	throws Exception
	{
		if (value <= 0)
		{
			//return;		// �޼ҵ� ������ return
			throw new Exception("ġŲ�� ���ִ�.");

		}
		this.value = value;
	}


	public int getValue()
	{
		return value;
	}

}

public class Test153
{
	public static void main(String[] args)	// throws Exception
	{
		Demo ob = new Demo();
		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);		
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}