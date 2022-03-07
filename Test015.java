/* ======================================
  �� �� �� �ڹ� �⺻ ���α׷��� �� �� ��
======================================= */

// �� ����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� :
// - �ﰢ���� ���� �Է� : 
// >> �غ��� ��, ���̰� �� �� �ﰢ���� ���� : xxx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// �ع��� �ν� �� �м�
//	 �ﰢ���� ���� = �غ� * ���� / 2

//   ����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ŭ���� ���

import java.io.BufferedReader;           // �� �ʿ��Ѱ͸� ���� (���۸���, ��ǲ��Ʈ������
import java.io.InputStreamReader;        //    IO�ͼ���
import java.io.IOException;

// import java.io.*;    (io�� ����ִ� ��� �͵��� �����Ѵ�, �޸� ����)

public class Test015
{
	public static void main(String[] args)  throws IOException
	{
		/*  --------------------------- ���� Ǯ�� ------------------------------------
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		


		int x, y;                // �غ� : x, ���� : y

		double k;

		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");

		x = Integer.parseInt(br.readLine());

		System.out.print("- �ﰢ���� ���� �Է� : ");
		
		y = Integer.parseInt(br.readLine());

		k = (x * y) /2;


		System.out.println(">> �غ��� " + x + " ���̰� " + y +" �� �ﰢ���� ���� : " + k);

		--------------------------------------------------------------------------------*/

		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int underLength, height;            //-- �غ��� ����
		double area;						//-- ����            check~!!!
		int k = 30;
		String x = "NBA ���� ��罺����Ʈ ����� �Ҽ� ������ Ŀ���� ���ȣ�� : ";
		int a;

		System.out.print(x);
		a = Integer.parseInt(br.readLine());
		
		if (a > 0)
		{
			System.out.println("���ȣ�� " + k + "�Դϴ�.");
			 
		}
		
		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");
		
		// �� ����ڰ� �Է��� �����͸� �������·� ��ȯ�� ��
		//	  ���� underLength �� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());  //-- readLine�� ���� ���� IOException
										             	//   �� �ʿ���


		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է� : ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� height �� ��Ƴ���
		height = Integer.parseInt(br.readLine());
		
		// �� �ﰢ���� ���� ���ϴ� ���� ó��
		area = underLength * height / 2.0;
		//      ������     ������    / ������   �� ������ݿ���
		//      ��, ���� ���ϰ� ������ ����!!
		//

		//area = (double)(underLength * height / 2);    -- X
		//area = (double)underLength * height / 2;      -- O
		//area = underLength * (double)height / 2;      -- O
		//area = underLength * height / 2.0;            -- GREAT
		// �ؽǼ� �ڷ����� ��������� ������ ��������
		//   �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//   ������ ��2���� �ƴ�, �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//   �� ������ �Ǽ� ������� ó���ȴ�.

        // ��� ���
		System.out.println();   // ����

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n)"
		                              ,underLength, height, area);
	}

}

// ���� ���
/*
�� �ﰢ���� ���� ���ϱ� ��
- �ﰢ���� �غ� �Է� : 23
- �ﰢ���� ���� �Է� : 15

>> �غ��� 23, ���̰� 15�� �ﰢ���� ���� : 172.50
)����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/