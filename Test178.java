/* ===========================================
     ���� �ڹ��� �⺻ �����(I/O) ����
=========================================== */

// Reader Writer �ǽ�

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;


public class Test178
{
	public void process(InputStream is)
	{
		int data;
		System.out.println("���ڿ� �Է�(���� : Ctrl+z)");

		try
		{
			// �ٽ� ��
			Reader rd = new InputStreamReader(is);		// is = System.in(�Ű�����)
														// InputStreamReader�� �¿���
														// Reader(���ڱ��) �� ��ü�� �����.  (�Է�)�¿� �غ�
			Writer wt = new OutputStreamWriter(System.out);	// OutputStreamWriter�� �¿�
			// �ٽ�	��										// Writer(���ڱ��)�� ��ü�� �����. (���)�¿� �غ�
			while ((data = rd.read()) != -1)	// ���ڱ���� ���ڰ� null ���� �ƴϸ�
			{
				wt.write(data);					// Writer�� ��ü�� �¿��
				wt.flush();						// �¿�� ������ �о��ش�.(���)
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		
	}

	public static void main(String[] args)
	{	
		Test178 ob = new Test178();
		ob.process(System.in);
	}
}

/*
���ڿ� �Է�(���� : Ctrl+z)
123123
123123
����
����
�ٺ���
�ٺ���
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/