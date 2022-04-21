/* ===================================================
      �� �� ��  �ڹ��� �ֿ�(�߿�) Ŭ���� �� �� ��
====================================================*/

// String Ŭ����  

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		System.out.println(s.substring(6, 9));
		// seoul korea
		// kor	

		// ��String.substring(s, e)��
		//  String ���ڿ��� �������
		//  s��°���� e-1��° ���� ����
		//  �� �ε����� 0���� ����

		System.out.println(s.substring(7));
		// orea
		// �� ��String.substring(s)��
		//     String ���ڿ��� �������
		//     s ��°����... ������ ����
		//     (��, ���ڿ��� ���� ���̸�ŭ....)

		// �� ���ڿ��� ������(��)��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		/*
		true
		false ��ҹ��� ����
		*/

		System.out.println(s.equalsIgnoreCase("Seoul Korea"));
		// true ��ҹ��� ���о���
		
		// �� ã���� �ϴ� ��� ���ڿ� s ��
		//    ��kor�����ڿ��� �����ұ�?
		//    �����Ѵٸ� ... �� ��ġ�� ��� �ɱ�?
		// seoul korea
		// 0123456
		System.out.println(s.indexOf("kor"));
		// 6   (��°�̴�)

		System.out.println(s.indexOf("ea"));
		// 9 (��°�̴�)
		System.out.println(s.indexOf("e"));
		// 1 (��°�̴�)

		System.out.println(s.indexOf("tt"));
		// -1    (���� : ã���� �ϴ� ���ڿ��� ��� ���ڿ��� �������� ����.)

		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//    (true / false);
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		// true
		// false

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��e�� ���ڿ��� �����ұ�?
		//    �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		//    (��, �ڿ��� ���� �˻�)

		// seoul korea
		System.out.println(s.indexOf("e"));
		// 1
		System.out.println(s.indexOf("o"));
		// 2
		System.out.println(s.lastIndexOf("e"));    // last ���ľ� �ٿ��ֱ�
		// 9
		System.out.println(s.lastIndexOf("o"));
		// 7
		
		// �� ��� ���ڿ�(s) ��
		//    ��6����° �ε��� ��ġ�� ���ڴ�?
		
		// charAt(x) seoul korea

		System.out.println(s.charAt(6));
		// k

		//System.out.println(s.charAt(22));
		// (��Ÿ�� ����)Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 22

		// �� ��� ���ڿ�(s) �� �� ���ڿ� �� seoul corea �� �O 
		//    � ���ڿ��� �� ū��? �� ���ڿ��� ���� ũ�� ��
		//    ==> �� ���ڿ��� ���ٸ� �� 0
		//    ==> �� ���ڿ��� �ٸ��ٸ� �� ���̸� Ȯ��(������ �迭)

		System.out.println(s.compareTo("seoul korea"));
		// 0

		System.out.println(s.compareTo("seoul corea"));
		// 8 
		// =-=> c ~ k  �� ����  a b c ( d e f g j i j )k �� 8
		
		// �� ��� ���ڿ�(s) ��
		//    �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����

		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����", "����");
		System.out.println("ó�� ��� : " +s);
		// ó�� ��� : �츮���� ���ֹα� ���ֵ��� ����

		// �� ���� ����
	    s = "                 ��                   ��                    "; 
		System.out.println("|||" + s + "|||");
		// |||                 ��                   ��                 |||

		System.out.println("|||" + s.trim() + "|||");	// Oracle ������ Ltrim�� Rtrim�� �ִ�.
		// |||��                   ��|||
		//  JAVA ������ ���ڿ� �� �� ������ ����

		System.out.println("|||" + s.replaceAll(" ", "") + "|||");
		//                                      --------
		// ������ �ִ� ���ڿ��� ���� ���ڿ��� ��ü�ض�.....

		// "30"
		int temp = Integer.parseInt("30");
		System.out.printf("%d\n", temp);

		s = Integer.toString(30);
		System.out.printf("%s\n", s);

		// 30
		
		int n = 2345678;
		System.out.printf("%d", n);	// : ��½�Ʈ���� �¿���
		System.out.format("%d", n); // : �ش� ������ ����ض� 
		//23456782345678����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		s = String.format("%d", n);	// String.format() �̳� System.out.print()�����̳� ���������.
		System.out.println();
		System.out.println(s);
		// 2345678

		s=String.format("%,d", n);
		System.out.println(s);
		// 2,345,678
		
		//String str = "�⺻,����,���";
		//String[] strArr = str.split(",");

		String [] strArr = "�⺻,����,���".split(",");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		// �⺻ ���� ���


	}
}