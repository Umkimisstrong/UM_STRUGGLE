/* ======================================
  �� �� �� �ڹ� �⺻ ���α׷��� �� �� ��
======================================= */

// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ������(if)
// ���� ���� �Է� : 90(if)
// ���� ���� �Է� : 80(if)
// ���� ���� �Է� : 70(if)

//====[���]====
// �̸� : ������
// �̸� : 240
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args)  throws IOException
	{
		//BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		
		// �ֿ� ���� ����		// ���ڿ� Ÿ������ ���� �� String(str)

		String strName;		//-- �̸� ����
		int nKor, nEng, nMat;	//-- ����, ����, ���� ���� ����
		int nTot;				//-- ���� ����

		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// -����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();
		
		// - ����ڿ��� �ȳ� �޼��� ���(���� ����)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nKor = Integer.parseInt(br.readLine());

		// - ����ڿ��� �ȳ� �޼��� ���(���� ����)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nEng = Integer.parseInt(br.readLine());

		// - ����ڿ��� �ȳ� �޼��� ���(���� ����)
		System.out.print("���� ���� �Է� : ");

		// - ����ڿ��� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nMat = Integer.parseInt(br.readLine());

		// - �� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)����
		//   �����Ͽ� ������ �����ϰ� ����� ������ ��Ƴ���

		nTot = nKor + nEng + nMat;

		System.out.print("�����ϰ������ 1�� �������� : ");
		int k = Integer.parseInt(br.readLine());


		// ��� ���
		System.out.println("\n====[���]====");
		System.out.printf("�̸� : %s\n", strName);
		System.out.printf("���� : %d\n", nTot);

		
	}
}

// ���� ���

/*
�̸��� �Է��ϼ��� : ����
���� ���� �Է� : 50
���� ���� �Է� : 60
���� ���� �Է� : 70

====[���]====
�̸� : ����
���� : 180
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/