/*==============================================
  �� �� �� ���� �帧�� ��Ʈ��(���) �� �� ��
==============================================*/

// �ݺ���(while��) �ǽ�


// �� ����
//	  ����ڷκ����� ������ ������ �Է¹޾�
//	  1���� �Է¹��� �� ����������
//	  ��ü �հ�, ¦���� �հ�, Ȧ���� ����
//	  ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

//	  ���� ��)
//	  ������ ���� �Է� : 280
//	  >> 1 ~ 280 ���� ������ �� : xxxx
//	  >> 1 ~ 280 ���� ¦���� �� : xxxx
//	  >> 1 ~ 280 ���� Ȧ���� �� : xxxx
//	  ����Ϸ��� �ƹ� Ű�� ��������....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test055
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		int n = 1;
		int sum =0, sum2=0, sum3=0; // ��ü ��, ¦�� ��, Ȧ�� ��

		// ���� �� ó��

		while(n<=a)
		{
			if(n%2==0)
				sum2 += n; // ¦���� ��
			else
				sum3 += n; //  Ȧ���� ��

			n++;
		}

		sum = sum2 + sum3; //  ���� = ¦�� + Ȧ�� 

		
		// ��� ���
		
		System.out.printf("1���� %d ���� ������ �� : %d%n", a, sum);
		System.out.printf("1���� %d ���� Ȧ���� �� : %d%n", a, sum3);
		System.out.printf("1���� %d ���� ¦���� �� : %d%n", a, sum2);

	}
}

/*
������ ���� �Է� : 30
1���� 30 ���� ������ �� : 465
1���� 30 ���� Ȧ���� �� : 225
1���� 30 ���� ¦���� �� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/







