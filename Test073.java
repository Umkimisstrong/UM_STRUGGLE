/*=============================
���� Ŭ������ �ν��Ͻ� ���� 
=============================*/

// CircleTest.java �� ��Ʈ
// public class �� �ΰ� ����

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java
// BufferedReader �� readLine()

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xx

// >> �������� xx �� ����
// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������..

import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{	
		// CircleTest �ν��Ͻ� ����
		// Ȥ�� CircleTest ��ü ����
		CircleTest ct = new CircleTest();
		
		// �Է¸޼ҵ� ȣ��
		ct.input();

		// ���̿� �ѷ� ���
		double a = ct.calArea();
		double l = ct.calLength();
		

		// ���� ��� ��¸޼ҵ� ȣ��

		ct.print(a, l);

	}
}