/* =======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================== */

// Calendar Ŭ����

/*
�� Calendar Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
   (�߻� Ŭ���� : �̿ϼ� �� Ŭ����)

   Calendar ob = new Calendar();
   �� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�.
	
	
�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���.

   1. Calendar ob1 = Calendar.getInstance();

   2. Calendar ob2 = new GregorianCalendar();		// ��ĳ����
   
   3. GregorianCalendar ob3 = GregorianCalendar();
	  (�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)

*/

// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ���


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{
		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		// Calendar ob = new Calendar();

		Calendar rightNow = Calendar.getInstance();
		
		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� ��get()��
		
		int y = rightNow.get(Calendar.YEAR);
		System.out.println(y);
		// 2022

		int m = rightNow.get(Calendar.MONTH)+1;		// MONTH�� �迭�ε�������.. +1 ���ִ°� üũ
		System.out.println(m);
		// 2

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		// 3

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		// 5	-- �����

		// �׽�Ʈ
		System.out.println(Calendar.SUNDAY);	// 1 �� �Ͽ���
		System.out.println(Calendar.MONDAY);	// 2 �� ������
		System.out.println(Calendar.TUESDAY);	// 3 �� ȭ����
		System.out.println(Calendar.WEDNESDAY); // 4 �� ������
		System.out.println(Calendar.THURSDAY);  // 5 �� �����
		System.out.println(Calendar.FRIDAY);	// 6 �� �ݿ���
		System.out.println(Calendar.SATURDAY);	// 7 �� �����
			
		System.out.println(y + "-" + m + "-" + d + "-" + w);
		// 2022-2-3-5

		String week = "";
		switch (w)
		{
			case Calendar.SUNDAY: week = "�Ͽ���"; break;
			case Calendar.MONDAY: week = "������"; break;		
			case Calendar.TUESDAY: week = "ȭ����"; break;		
			case Calendar.WEDNESDAY: week = "������"; break;		
			case Calendar.THURSDAY: week = "�����"; break;		
			case Calendar.FRIDAY: week = "�ݿ���"; break;		
			case Calendar.SATURDAY: week = "�����"; break;		
		}

		System.out.println(y + "."+ m +"." + d + "."+ week);
		// 2022.2.3.�����

		System.out.println("/////////////////////////////////////////");

		// Calendar Ŭ���� ����ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// �޷��� ��¥ ���� �� �� set() �޼ҵ� Ȱ�� ��
		rightNow2.set(2022, 5, 20); // 6�� -- üũ;; ��(-1)�� �迭�ε���
		
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		// 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		// ������

	}
}
// ������
/*
2022
2
3
5
1
2
3
4
5
6
7
2022-2-3-5
2022.2.3.�����
/////////////////////////////////////////
2
������
*/