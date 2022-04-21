/* =======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================== */

// Calendar Ŭ����

// �� �ǽ� ����
//    ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//    Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ���� ��)
//    ���� ��¥ : 2022-2-3 �����
//    �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200
//    �� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ� Ȱ��


// ============[Ȯ�� ���]============
//     200�� �� : xxxx-xx-xx x����
// ===================================
// ����Ϸ��� �ƹ� Ű�� ��������. . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

// ȥ���ߴ� ���!!

public class Test146
{
	public static void main(String[] args)	throws IOException
	{	
		// BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar Dal = new GregorianCalendar();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		String [] wdays = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����", };
		int y = Dal.get(Calendar.YEAR);
		int m = Dal.get(Calendar.MONTH)+1;
		int d = Dal.get(Calendar.DATE);
		int w = Dal.get(Calendar.DAY_OF_WEEK);

		// ������ �� �� �� ���� ��������
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y, m, d, wdays[w-1]);


		// ����ڷκ��� �߰��� �� �� ������ ����
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		int day = Integer.parseInt(br.readLine());


		//
		Calendar Dal2 = new GregorianCalendar();
		Dal2.add(w, day);		// �̰��� �ٽ�... ���ϵ��� ���߉´�..
		// ���� Dal. �� �ԷµǾ��ִ� �������� day ��ŭ ������ ���� ���� �޷��� �����ϱ�



		// ���ο� �޷¿� ���� ������ ���
		int y2 = Dal2.get(Calendar.YEAR);
		int m2 = Dal2.get(Calendar.MONTH)+1;
		int d2 = Dal2.get(Calendar.DATE);
		int w2 = Dal2.get(Calendar.DAY_OF_WEEK);


		System.out.println();
		System.out.println("============[Ȯ�� ���]==============");
		System.out.printf("%4s %d�� �� : %d-%d-%d-%s", " ", day, y2, m2, d2, wdays[w2-1]);
		System.out.println();
		System.out.println("=====================================");
	
		

	}
}

/*
���� ��¥ : 2022-2-3 �����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 300

============[Ȯ�� ���]==============
     300�� �� : 2022-11-30-������
=====================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/