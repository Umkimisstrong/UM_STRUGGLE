/* ===========================================
     ���� �ڹ��� �⺻ �����(I/O) ����
=========================================== */

// Reader �ǽ�

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ�� �� ���� ��� ��Ʈ������
		//                   : ��ȯ���ִ� ���� ����
		// Reader            : ���� ��� ��Ʈ�� ��ü

		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(���� : Ctrl+z)");

		while ((data = rd.read())!= -1)
		{
			ch = (char)data;
			//System.out.print(ch);
			System.out.write(ch);
		}
		// ���ڱ������ �о��µ� ���ڱ������ ����� ���
		/*
		���ڿ� �Է�(���� : Ctrl+z)
		abcd
		abcd
		1234
		1234
		��������
		��������
		*/
	
		// ���ڱ������ �о��µ� ����Ʈ������� ����� ���
		/*
		���ڿ� �Է�(���� : Ctrl+z)
		rkskfk
		rkskfk
		�������
		 ��D
		*/
	
	}
}