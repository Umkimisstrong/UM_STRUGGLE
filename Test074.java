/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
=======================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�. ��
// ����, �Է�ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1050
// ������ ���� �Է�(1~1000) : -45
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// ���� 
	/*
	int sum=0;
	// �޼���
	void input()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		
		do
		{
			System.out.print("������ ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
		}
		while (a>=1 ^ a<=1000); 

		for (int i=1;i<=a ;i++ )
		{
			sum += i;
		}
		
		System.out.printf("%n >> 1 ~ %d ������ �� : %d%n", a, sum);
	}
	*/

	// �ֿ� ���� ����(������� �Է°��� ��Ƴ� ����)
	int sum;

	int a, i;
	
	// �Է��Ҽ� �ִ� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			a = Integer.parseInt(br.readLine());
		}
		while (a>=1 ^ a<=1000);
	}
	
	// ���� ó�� �޼ҵ� ����
	int addResult()
	{
		sum=0;
		for(i=1;i<=a;i++)
		{
			sum += i;
		}

		return sum;
	}

	
	void output(int s)
	{
		System.out.printf("%n >> 1 ~ %d ������ �� : %d%n", a, s);
	}


}








public class Test074
{
	public static void main(String[] args)	throws IOException
	{
		// Hap �ν��Ͻ� ����
		Hap ch = new Hap();


		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		// ---------------
		//  �������� Ȱ��
		ch.input();

		// ������ �ν��Ͻ��� ���� ���� ó�� �޼��� ȣ�� ��calculate()
		int k = ch.addResult();
		// ch.output(ch.addResult);
		ch.output(k);
	}
}

// ���� ���

/*
������ ���� �Է�(1~1000) : 1000001
������ ���� �Է�(1~1000) : -10
������ ���� �Է�(1~1000) : 100

 >> 1 ~ 100 ������ �� : 5050

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/