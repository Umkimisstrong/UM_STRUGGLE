/* ==================================
    ���� Ŭ������ �ν��Ͻ� ����
================================= */

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : a b
// ������ ������ �Է�(+ - * /)    : +
// >> 10 +  5 = 15
// ����Ϸ��� �ƹ�Ű����������...

import java.util.Scanner;		// Scanner �� ���� ������ ����Ʈ��
import java.io.IOException;


// ��� ��ü
class Calculate
{
	// ����� ���� ���� ����
	int a, b;     // -- ����ڰ� �Է��� �� ����
	char k;	      // -- ����ڰ� �Է��� ������
	Scanner sc;   // -- �Է¸޼ҵ尡 �� �� ���� sc ���� ��������



	// ����ڰ� �Է��ϴ� ���� �޼ҵ�
	void input()			//�� Scanner Int Ÿ���� �޼ҵ�, IOException ó�� ���ص���
	{
		sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : "); 
		a = sc.nextInt();
		b = sc.nextInt();

	}
	// ����ڰ� �Է��ϴ� ������ �޼ҵ�
	int calP()	throws IOException	 // �� System.in.read() Ÿ�� �޼ҵ�, IOExceptionó��
	{
		int i = k;				// ���ڸ� ���ڷ� ġȯ�Ͽ� k�� �����ϴ� ����
		sc = new Scanner(System.in);
		System.out.print("������ ������ �Է�(+ - * /) : ");
		k = (char)System.in.read();
		return i;


	}
	/*====================== ������ ���
	  ����� ���꿡 ��� �ѹ��� ����ع����� ��� 
	int cal()
	{
		int result = 0;
			switch(k)
			{
				case '+': result = su1 + su2; break;
				case '-': result = su1 - su2; break;
				case '*': result = su1 * su2; break;
				case '/': result = su1 / su2; break;
			
			}
		return result;

	}


	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d%n", a, k, b, s)
	}
	main(String[] args)
	//	Calculate �ν��Ͻ� ����
	Calculat~ = new Calcul
	//cal �޼ҵ� ����

	//int �� ����� ��ȯ

	int = cal.cal();
	
	// ��� ���
	cal.print(x);
	*/


	void output()	// ��� ��¿� �޼ҵ� ����
	{
		if (k == '+')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a+b));
		}
		else if (k == '-')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a-b));
		}
		else if (k == '*')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a*b));
		}
		else if (k == '/')
		{
			System.out.printf("%n >> %d %c %d = %d%n", a, k, b, (a/b));
		}
		else
			System.out.println("�����Դϴ�.");
	}


		


}


public class Test075
{
	public static void main(String[] args)	throws IOException
	{
		Calculate cl = new Calculate();

		// ������� ���� �Է¸޼ҵ� ȣ��
		cl.input();

		// ������� ������ �Է¸޼ҵ� ȣ��
		cl.calP();

		// ������� �Է°���� ���� ���� �� ��� ó�� ȣ��
		cl.output();

	}
}

// ���� ���

/*
������ �� ���� �Է�(���� ����) : 10 20
������ ������ �Է�(+ - * /) : +

 >> 10 + 20 = 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 20
10
������ ������ �Է�(+ - * /) : -

 >> 20 - 10 = 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 30
40
������ ������ �Է�(+ - * /) : *

 >> 30 * 40 = 1200
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 1000

10
������ ������ �Է�(+ - * /) : /

 >> 1000 / 10 = 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 100
2
������ ������ �Է�(+ - * /) : as
�����Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/