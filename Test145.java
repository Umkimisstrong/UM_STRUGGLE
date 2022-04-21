/* =======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================== */

// Calendar Ŭ����


/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� �����ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ� �����ֱ� ������
   GregorianCalendar ��ü�� ���� �����Ͽ� �ð������� ���� ���� �ִ�.

*/

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)

// ���� �Է� : 0
// ���� �Է� : 2022
// �� �Է�   : -2
// �� �Է�   : 16
// �� �Է�   : 7
/*
	[ 2022�� 7�� ]
	
   ��   ��   ȭ   ��   ��   ��   ��
====================================
							 1    2
    3    4    5    6    7    8    9
   10   11   12   13   14   15   16
   17   18   19   20   21   22   23
   24   25   26   27   28   29   30
   31
====================================
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test145
{
	public static void main(String[] args)	throws IOException
	{
		Calendar Dal = new GregorianCalendar();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] weekdays = {"��", "��", "ȭ", "��", "��", "��", "��"};
		int [] arr;
		int year;
		int month;
		// ����� --------- �Է�
		 
		do
		{
			System.out.print("���� �Է�(1�̻�) : ");
			year = Integer.parseInt(br.readLine());
	
			
		}
		while (year<=0);

		do
		{
			System.out.print("�� �Է�(1~12) : ");
			month = Integer.parseInt(br.readLine());
		}
		while (month > 12 || month < 1);

		// ����ڷκ��� �Է¹��� ��, ���� �̿��Ͽ� �޷��� ��¥ ����
		Dal.set(year, month-1, 1);
		// -- �� ������ �Է°�(month)�� �״�� ����ϴ� ���� �ƴ϶�
		//    �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		// -- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.
		
		// ���õ� �޷��� ��¥�κ��� ���� ��������
		int weekday = Dal.get(Calendar.DAY_OF_WEEK);	// �ش���� 1���� ����

		int lastday = Dal.getActualMaximum(Calendar.DATE);
		// Dal.���õ� ���� �ִ��� ��ȯ�Ѵ�. getActualMaximum()
		//�޷¼��ó�
		
		

		
		// ��� ���
		System.out.println();
		// ����
		System.out.printf("\t[ %d�� %d��]\n", year, month);
		System.out.println("===========================");
		// ����
		for (int i = 0;i < weekdays.length ;i++ )
			System.out.printf("%3s", weekdays[i]);
		System.out.println();



		// ��¥(����޷°� �����ϰ�, �޷��� �׸��� �� ù ���ϸ�ŭ�� ���� �߻�)
		// �Ͽ����̸� ���� 0���� ����
		// �������̸� ���� 1�ν���
		// ȭ�����̸� ���� 2�ν���
		// �������̸� ���� 3�ν���
		// ������̸� ���� 4�ν���
		//  :
		//  :
		for (int i = 1;i < weekday ;i++ )
		{
			System.out.printf("%4s", " ");		// ù ���ϸ�ŭ ���� �߻�
		}


		
		for (int i = 1; i <= lastday ; i++ )
		{
			System.out.printf("%4d", i);
			weekday++;					// �ݺ��������ϸ鼭
										// ��¥�� �����Ҷ����� ���ϵ� �����ϰԲ� ó��
										// ������ �Ͽ����� �ɶ����� �����ϰԲ� ó��
			if (weekday%7==1 && i != lastday)
			{
				System.out.println();
			}

		}
		System.out.println();
		// ������
		System.out.println("===========================");





	}
}

// ���� ���

/*
   [ 2022�� 5��]
===========================
  ��  ��  ȭ  ��  ��  ��  ��
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/