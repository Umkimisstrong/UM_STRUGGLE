/* ======================================
  �� �� �� �ڹ� �⺻ ���α׷��� �� �� ��
======================================= */

// �ڹ��� �⺻ ����� : System.in.read()

/*
��System.in.read()�� �޼ҵ�� �� ���ڸ� �����´�.
��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
ASCII Code ������ ��ȯ�Ѵ�.
*/
import java.io.IOException;

public class Test017
{
	public static void main(String[] args)  throws IOException
	{
		// �ֿ� ���� ����
		char ch;
		
		char k;
		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �ϳ� �Է��ϼ��� : ");     // A
		ch = (char)System.in.read();	     			 // 65		
		
		System.out.print("������ �ϰ�ʹٸ�, �빮�� K�� �Է��ϼ��� : ");
		k = (char)System.in.read();

		// ��� ���
		System.out.println(ch);
		//--==>> A
		




		System.out.println(k);
	}
}