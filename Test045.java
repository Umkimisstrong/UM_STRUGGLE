/*==============================================
  �� �� �� ���� �帧�� ��Ʈ��(���) �� �� ��
==============================================*/

// switch �� �ǽ�

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 3
// �� ��° ���� �Է� : 17
// ������ �Է�[+ - * /] : -

// >> 3 - 17 = -14
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test045
{
	public static void main(String[] args)  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		// ��
		int a, b, result;
		int op;


		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /]");
		op = System.in.read();

		// + �� op:43, �� op :45, * �� op :42, / �� op:47

		switch (op)
		{
			case 43 : result = a+b; break;
			case 45 : result = a-b; break;
			case 42 : result = a*b; break;
			case 47 : result = a/b; break;
			default: return;	// 1. ���� ��ȯ
								// 2. �޼ҵ� ���� : main()�޼ҵ� ���Ḧ �ǹ��� : ���α׷�����
								//  
		}

		System.out.printf("%n>>%d %c %d = %d",a, op, b, result);
											//   --    int �� ��������������,
											//    	   �ڵ�����ȯ char���·�
		*/

		// �� �����ڸ� ����Ÿ������ �����ϰ� ����
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch(op)													// jdk1.6���ʹ� 
																	// ���ڿ� ���ڿ��� ����
		{
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/b; break;
			default : return;
		}

		System.out.printf("%n>> %d %c %d = %d%n", a, op, b, result);


		



		

		
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 4
������ �Է�[+ - * /]+

3 + 4 = 7����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/