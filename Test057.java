/*==============================================
  �� �� �� ���� �帧�� ��Ʈ��(���) �� �� ��
==============================================*/

// �ݺ���(do~ while��) �ǽ�

/*
�� ����

	��do~while�� ���� ��while������ ����������
	Ư���� ������ �ݺ� �����ϴ� �ݺ����̴�.
	�ٸ� ��while������ �ٸ� ����
	���ǽĿ� ���� �˻縦 �ݺ����� ������ ���Ŀ� �Ѵٴ� ���̴�.
	�̿� ���� �������� ���� �ݵ�� �ѹ��� �����ϰ� �Ǵ� Ư¡�� ���µ�...

�� ���� �� ����

	do
	{
			���๮;
	}
	while(���ǽ�);

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test057
{
	public static void main(String[] args)		throws IOException
	{
		// �� while �ݺ����� ���� �����ߴ� �������
		//	  do~while ����  ���ؼ��� ������ �� �ִ�.
		
		/*
		int n = 1;
		
		do
		{
			System.out.println("n " + n);
			n++;
		}
		while (n<=10);
		*/


		/*
		int n = 1;
		
		do
		{
			n++;
			System.out.println("n " + n);
		}
		while (n<=10);
		*/


		/*
		int n = 0;
		
		do
		{
			n++;
			System.out.println("n " + n);
		}
		while (n<10);	
		*/

		/*
		int n = 0;
		
		do
		{
			System.out.println("n " + ++n);

		}
		while (n<=10);
		*/

		// do~while ���� Ȱ�� ��
		// ���� ���... ����ڷκ��� Ư�� ������ ������ �Էµ� �� ����
		// �Է¹޴� ���� ��ü�� �ݺ��ؼ� �����ؾ� �ϴ� ��Ȳ�̶� �����Ѵ�.
		
		/* EX


		100 �̻��� ������ �Է��ϼ��� : 30
		��
		100 �̻��� ������ �Է��ϼ��� : 40
		��
		100 �̻��� ������ �Է��ϼ��� : 101
		100 �̻��� ���� �Է� �Ϸ�

		System.out.print("~~"); ������ do '~'while  '~'�� ���� ���ٿ� �־��ָ�
		����� ��� �� �� �ִ�.

		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k;

		do
		{
			System.out.print("���������� 3�ʸ� ����, ��ǻ�Ͱ� ���ϴ� ����(����)�� �Է��ϼ���.. (1~9)");
			k = Integer.parseInt(br.readLine());
		}
		while (k!=4);

		System.out.println();
		System.out.println("�����Դϴ�. ���ϼ̾��.");

	}
}