/* ================================
  ���� ������ (Operator) ����
================================= */

// ���� ������ == ���� ������

// ����ڷκ��� ������ ���ڸ� �ϳ� �Է¹޾�
// �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ �����̸� �� ���� �״�� ����ϴ�
// ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A �� a
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// �� ���� �Է� : b
// b �� B
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// �� ���� �Է� : 7
// 7 �� 7
// ����Ϸ��� �ƹ� Ű�� ��������...


/*
ch

���ĺ� �빮�ڴ� ? (�������)�ҹ��ڷ� ��ȯ : (�ƴҰ��)(���ĺ� �ҹ��ڴ� ? �빮�ڷκ�ȯ : �״��);
											           ---------------   ------------   ------
													          1                2           3
---------------   -----------------------    --------------------------------------------------
        1                     2                                              3

result = �������;
		          

*/


// �� ���ڸ� �Է¹޴� ���̱� ������ System.in.read ������� �Ẹ�� ----������� ����

import java.io.IOException;

public class Test031
{
	public static void main(String[] args)   throws IOException
	{
		/*
		//int temp;
		char temp;
		
		System.out.print("�� ���� �Է� : ");

		temp = (char)System.in.read();

		//System.out.println("�Է¹����� Ȯ�� : "+ temp);
		
								   // ���ǿ����� 65<= temp <= 90�����ѵ�, JAVA ������ �Ұ�
								   // JAVA ������ temp >= �� temp<= �� �����Ѵ�
								   // **���� 2���̻��� ������ ������ ������ �������� ���**
		
		//String result =	temp >= 65 && temp <= 90 ? "�빮��" : "�빮�� �ƴ�";
		//System.out.println("��� : " + result);
		

		String result =	temp >= 'A' && temp <= 'Z' ? "�빮��" : "�빮�� �ƴ�";
		System.out.println("��� : " + result);
		*/


		// �ֿ� ���� ����
		char ch, result;
		
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

        result = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         //--------------------      -------------  

         // result = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);

		 // if Q�� ������
		 // result = (true && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
		 // result = (true && true) ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)(ch + 32)
         // result = (char)(Q + 32)
		 // result = (char)(81 + 32)
		 // result = (char)(113)
		 // result = q

		 // if m�� ������
		 // result = (true && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
		 // result = (true && false) ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)((true && true) ? (char)(ch-32) : ch);
         // result = (char)(ch-32)
		 // result = (char)(109 + 32)
		 // result = (char)(77)
		 // result = M

		 // if 8�� ������
		 // result = (false && ch <= 'Z') ? (char)(ch + 32) : (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
		 // result = (char)((ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)((false && ch <= 'z') ? (char)(ch-32) : ch);
         // result = (char)(ch)
		 // result = (char)(8)
		 // result = 8



	
		          
		

		// ��� ���
		 System.out.println(ch + " �� " + result);

	}
}

/*
�� ���� �Է� : A
A �� a
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


�� ���� �Է� : k
k �� K
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : 7
7 �� 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/