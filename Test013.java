/* ======================================
   �� �� �� �ڹ��� ���� �� Ư¡ �� �� ��
======================================= */

// �� ����
// ���簢���� ���̿� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ѵ�
// �� ���� : 10. ���� : 20

// ���� ��)
// ���� : xxxx
// �ѷ� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...


public class Test013
{
	public static void main(String[] args)
	{

		/* ------- ���� Ǯ�� ---------------------
		double hor = 10;
		double ver = 20;

		double s;
		double d;

		s = hor * ver;
		d = (hor + ver) * 2;
	
		System.out.println("���� : " + s);
		System.out.println("�ѷ� : " + d);

		System.out.printf("���� : %.2f\n", s);
		System.out.printf("�ѷ� : %.3f\n", d); 
		------------- ���� Ǯ��  -------------- */ 

		// ���� ���� �� �ʱ�ȭ
		int a =10, b=20;			//-- ����, ����
		int x, y;					//-- ����, �ѷ�

		// ���� �� ó��
		x = a * b;
		y = (a + b) * 2;

		// ��� ���
		System.out.println("���� : " + x);
		System.out.println("�ѷ� : " + y);
		
		System.out.println("���� : " + (a*b));
		System.out.println("�ѷ� : " + (a+b)*2);

		int k = b;
		int n = b-30;
		k = n;
	
		
		System.out.println(k);


	}
}