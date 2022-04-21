/*=========================
  ����Ŭ���� ��ޡ���
=========================*/

// �������̽�(Interface)

// �� �ǽ� ����
// ���� ó�� ���α׷��� ����
// ��, �������̽��� Ȱ��

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ȫ����
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85

// 2��° �л��� �й� �̸� �Է�(���� ����) : 2290847 �ֹ���
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2280946 ȫ����    90  100  85   ����      ���
//                   ��   ��  ��
// 2290857 �ֹ���    85   70  65   ����      ���
//                   ��   ��  ��

// ����Ϸ��� �ƹ� Ű�� ��������..
// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

import java.util.Scanner;

class Record
{
	String hak, name;	// �й� �̸�
	int kor, eng, mat;  // ����, ����, ����
	int tot, avg;       // ����, ���

}


// �������̽�
interface Sungjuk
{
	public void set();	 // -- �ο� ����
	public void input(); // -- ������ �Է�
	public void print(); // -- ��� ���
}


// �����ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class  SungjukImpl	implements Sungjuk
{
	private int inwon;
	Scanner sc;
	private Record[] rec;  // ���ڵ� Ÿ���� �迭 ����



	private String panjung(int score)	// �� �� �� �� ��
	{
		String k;
		if (score >= 90)
		{
			k = "��";
		}
		else if (score >= 80)
		{
			k = "��";
		}
		else if (score >= 70 )
		{
			k = "��";
		}
		else if (score >=60 )
		{
			k = "��";
		}
		else if (score < 60)
		{
			k = "��";
		}
		else
			k = "��";

		return k ;

	}

	public void set()
	{ 
		sc = new Scanner(System.in);
		System.out.print("�ο� �� �Է�(1~10) : ");
		inwon = sc.nextInt();
		rec = new Record[inwon];   // ���ڵ� �Ӽ��� ���� �迭 ���� (�ο�����ŭ)
	}

	public void input()
	{

		sc = new Scanner(System.in);
		for (int i = 0; i<inwon ;i++ )
		{
			rec[i] = new Record();
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("����, ����, ���� ���� �Է�(���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();
			
			rec[i].tot += rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = (rec[i].tot)/3;
		}
	}
	public void print()
	{
		int n = 0;
		System.out.println();

		for (int i = 0;i < inwon ;i++ )
		{
			System.out.printf("%7s %5s %3d %3d %3d    %3d %3d\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i]. avg);
			System.out.print("                  ");
			System.out.printf("%s %2s %2s\n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}
}


public class Test123
{
	public static void main(String[] args)
	{
		Sungjuk ob;
		// �����ذ� �������� �ۼ��ؾ� �� ob ����
		ob = new SungjukImpl(); 

		ob.set();
		ob.input();
		ob.print();
	}
}