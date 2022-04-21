/* ===================================================
      �� �� ��  �ڹ��� �ֿ�(�߿�) Ŭ���� �� �� ��
====================================================*/

// Wrapper Ŭ����  

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		/*
		3
		256
		*/

		print(b2);
		print(i2);

		// Byte Ŭ������ byteValue()�޼ҵ� ȣ��
		
		byte b3 = b2.byteValue(); // ��ڽ�

		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue();	// ��ڽ�

		int i4 = b2.byteValue(); // byte����̱⶧���� int���� ���
		//byte i4 = i2.intValue(); // int����̱⶧���� �ڵ�����ȯ ��Ģ����
		byte b4 = i2.byteValue();

		System.out.println(b3);
		System.out.println(i3);

		System.out.println(b4); // 0 �� byte�� ��������� 256�� ����ϴ�
		                        //      0���� ��µǾ���.
		System.out.println(i4);

	}
	/*
	static void print()
	{
		
	}

	static void print(Integer i)
	{
		
	}
	*/

	/*
	static void print(Object obj)	�� Object �� ���� �����ϱ⶧����
	{								   ������ �ϳ�, �ٶ������� �ʴ�.
	}								   ��..? �� �������� ������ ������
	*/								// �ڹٽ�ũ��Ʈ ���� ������ ���̴�.


	// java.lang.Number Ŭ����(�߻�Ŭ����)��
	// ��� ������ Wrapper Ŭ�������� �θ�Ŭ����
	// (����Ŭ����, ����Ŭ����)�̴�.
	// b2, i2�ڷ����� Number�� �Ѿ���鼭
	// �� ĳ������ �Ͼ�� �ȴ�.
	// Auto - Boxing

	static void print(Number n)		// �� 3
	{
		System.out.println(n);
		System.out.println(n.intValue());


	}
}