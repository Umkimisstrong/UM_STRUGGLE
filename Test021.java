/* ======================================
  �� �� �� �ڹ� �⺻ ���α׷��� �� �� ��
======================================= */

// �ڹ��� �⺻ ����� : java.util.Scanner

// �� java.util.Scanner
//	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test021
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		String bok;

		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : " );
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				��--------  �� ù��° ó�� ��-----------  �� �ι�° ó��	
		//			  ����,90,80,90
		

		// sc = new Scanner("����,90,80,90").useDelimiter("\\s*,\\s*");					--> useDelimiter �޼ҵ� ( �������� : ������ )
		//													  \s(tring)*,\s(tring)*			--> ��\\�� �� ���ڿ��� �ν��Ϸ��� 2���ʿ�, 
		//														-----  -    ----- -              ��s�� �� String, ��*�� �� ���
		//													  ���ڿ� ���, ���ڿ� ���



		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;


		System.out.println();

		
	


		// ��� ���
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + tot);
		System.out.printf("%n ������ Scanner �� ������ ���� : %s\n", bok);
	}

}

// ���� ���

/*
�̸�,����,����,���� �Է�(��,������) : ����,50,40,30

>> �̸� : ����
>> ���� : 120
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/