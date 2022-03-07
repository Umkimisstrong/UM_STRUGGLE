/*==============================================
   �� �� �� ���� �帧�� ��Ʈ��(���) ����
==============================================*/

// ���� �����Ӱ� ��Ʈ�� �ϵ� ���� �帧�� ��Ʈ�� �ؾ��Ѵ�.
// if ��
// if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if(if�� ��ø),
//	  switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���,
//	  Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�.
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 3
// ������ �Է�[+ - * /] : +

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		// ��� ��
		int a, b;	// ù��°, �ι�° ����
		
		char op;		// ������

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt()
		// "1234" �� Integer.parseInt() �� 1234
		// "abcd" �� Integer.parseInt() �� ( X )
		System.out.print("������ �Է�[+ - * /] : ");    // + - * /
		// op = Integer.parseInt(br.readLine());   �� ���ڸ� ���ڷ� ��ȯ�ϴ°� �Ұ�
		// op = br.readLine(); �� ���ڿ��� ��ȯ�� ���� ����
		op = (char)System.in.read();			// �� System.in.read ����

		// Ȯ��(�׽�Ʈ)
		//System.out.println("�Է��� ������ : " + op);

		if (op=='+')
		{
			System.out.printf("%n>>%d + %d = %d%n", a, b, (a+b));
		}
		else if(op=='-')
		{
			System.out.printf("%n>>%d - %d = %d%n", a, b, (a-b));
		}
		else if(op=='*')
		{
			System.out.printf("%n>>%d * %d = %d%n", a, b, (a*b));
		}
		else if(op=='/')
		{
			System.out.printf("%n>>%d / %d = %d%n", a, b, (a/b));
		}
		else
		{
			System.out.println(">> �Է°����� ������ �����մϴ�.");
		}

		*/

		// ��� ��
		/*
		int a, b, op;		//-- ù ��°, �� ��° ����, ������

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();
		
		if(op == 43)
		{
			System.out.printf("%n>> %d + %d = %d%n", a, b, (a+b));
		}
		else if(op==45)
		{
			System.out.printf("%n>> %d - %d = %d%n", a, b, (a-b));

		}
		else if(op==42)
		{
			System.out.printf("%n>> %d * %d = %d%n", a, b, (a*b));

		}
		else if(op==47)
		{
			System.out.printf("%n>> %d / %d = %d%n", a, b, (a/b));

		}
		else
		{
			System.out.println("\n >> �Է� ������ ������ �����մϴ�.");
		}
		*/


		// ��� ��


		int a, b, result=0;
		char op;

		System.out.print("ù ��° ���� ���� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		if (op=='+')
		{
			result = a+b;
		}
		else if(op=='-')
		{
			result = a-b;
		}
		else if (op=='*')
		{
			result = a * b;
		}
		else if (op=='/')
		{
			result = a / b;
		}
		System.out.printf("\n>> %d %c %d = %d%n", a, op, b, result);

	}



}

// ���� ���
/*
ù ��° ���� ���� : 110
�� ��° ���� �Է� : 40
������ �Է�[+ - * /] : *

>> 110 * 40 = 4400
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/