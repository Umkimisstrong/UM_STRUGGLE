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


// ����ڷκ��� �̸�, ��������, ���������� �Է¹޾�
// ����� ��� ������ �������� ó���Ѵ�.
// 90���̻� : A
// 80���̻� : B
// 70���̻� : C
// 60���̻� : D
// 60���̸�	: F

// ��. BufferedReader �� readLine()�޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
// printf()�޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ȫ����
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ȫ�����Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		
		// 1. ����ڷκ��� �̸��� �Է¹޴´�.		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();


		System.out.print("���� ���� : ");
		String strMat = br.readLine();
		
		// 3. ���ڿ� ���·� �Է¹��� ������ �������·� ��ȯ
		
		int nKor = Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		// 2. ����ڷκ��� ����, ����, ���� ������ �Է¹޴´�.
		System.out.print("���� ���� : ");
		String strKor = br.readLine();


		System.out.print("���� ���� : ");
		String strEng= br.readLine();
		

		int nMat = Integer.parseInt(strMat);

		// 4. ��� ������ ���� ������ ��� ����
		int nTot = nKor + nEng + nMat;
		double fAvg = nTot / 3.0;

		// 5. ��޿� ���� ���� �˻�

		char grade = 'F';				// -- ����� ��� ���� ����
										//	  ���� �� �ʱ�ȭ

		if(fAvg >= 90)
			grade = 'A';
		else if (fAvg >= 80)	// ����� 90 �̸��� ������ ���ԵǾ�����(fAvg < 90 && fAvg>=80)
			grade = 'B';	
		else if (fAvg >= 70)	// ����� 80 �̸��� ������ ���ԵǾ�����
			grade = 'C';
		else if (fAvg >= 60)	// ����� 70 �̸��� ������ ���ԵǾ�����
			grade = 'D';
		

		// 6. ���� ��� ���
		System.out.printf(">> ����� �̸��� %s�Դϴ�.%n", name);
		System.out.printf(">> ���� ������ %s,%n", strKor);
		System.out.printf(">> ���� ������ %s.%n", strEng);
		System.out.printf(">> ���� ������ %s,%n", strMat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.%n", nTot, fAvg);
		System.out.printf(">> ����� %c�Դϴ�.%n", grade);
	}
}

// ���� ���

/*
�̸� �Է� : ����
���� ���� : 90
���� ���� : 89
���� ���� : 67
>> ����� �̸��� �����Դϴ�.
>> ���� ������ 90,
>> ���� ������ 89.
>> ���� ������ 67,
>> ������ 246�̰�, ����� 82.00�Դϴ�.
>> ����� B�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/