/* ======================================
  �� �� �� �ڹ� �⺻ ���α׷��� �� �� ��
======================================= */

// ��� ������
// BufferedReader
// printf()

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϰ�
// ����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : N (if)
// �� ��° ���� �Է� : N2 (if)

// ====[���]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 + 20
// 10 / 2 = 5
// 10 % 2 = 0
// --------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test023
{
	public static void main(String[] args)  throws IOException
	{
		/* -----------------------------------------------------------------------------------------
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, y;
		int a, b, c, d, e;

		System.out.print("ù ��° ���� �Է� : ");
		x = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		y = Integer.parseInt(br.readLine());

		a = x + y;
		b = x - y;
		c = x * y;
		d = x / y;
		e = x % y;

		System.out.printf("\n====[���]====");
		System.out.printf("\n%d + %d = : %d", x, y, a);
		System.out.printf("\n%d - %d = : %d", x, y, b);
		System.out.printf("\n%d * %d = : %d", x, y, c);
		System.out.printf("\n%d / %d = : %d", x, y, d);
		System.out.printf("\n%d %% %d = : %d", x, y, e);
		System.out.printf("\n=============");

		-----------------------------------------����質�� Ǯ��------------------------------------  */
		

		// �ֿ� ���� ����
		int num1, num2;							//-- ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5;		//-- ���� ����� ���� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		
		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 & num2;



		
		// ���� ��� ���
		System.out.printf("\n ====[���]====\n");
		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5);
		System.out.printf("=================\n");
		//--==>> System.out.printf("%d & %d = %d\n", num1, num2, res5); ��Ÿ�ӿ���     // -->> %�� ���Ϸ� ���� �ν��� �ȉ�


	}
}

// ���� ���
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 5

====[���]====
10 + 5 = : 15
10 - 5 = : 5
10 * 5 = : 50
10 / 5 = : 2
10 % 5 = : 0
=============)����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/