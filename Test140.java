/* ===================================================
      �� �� ��  �ڹ��� �ֿ�(�߿�) Ŭ���� �� �� ��
====================================================*/

// StringBuffer Ŭ����  


/*
�� StringBuffer Ŭ������
   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ��� ������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

   ����, JDK 1.5 ���ĺ��ʹ�


   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.


   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������


   ���� ū �������� multi-thread unsafe ��� ���̴�.


   ��, Syncronization �� ���� ������


   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�


   StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�.



	���� �� ��� �ݺ��
*/

// ���� : StringBuffer Ŭ�������� 
// equals()�� �������̵� �Ǿ����� �ʾƼ�..  equals()�޼ҵ带 ����ϸ� Object Ŭ������ 
// �޼ҵ� equals()�� ����� �Ǹ�... �װ��� �� �ּڰ��� ���Ѵٴ� �ǹ�
public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2); // �ּڰ� �� : �ٸ���
		System.out.println(sb1.equals(sb2)); // �ּڰ� �� : �ٸ���
		/*
		false
		false
		*/

		System.out.println(sb1);
		// korea

		System.out.println(sb2.toString());
		// korea

		System.out.println(sb1.toString().equals(sb2.toString()));
		// true

		System.out.println();


		StringBuffer sb3 = new StringBuffer();
		// -- StringBuffer �⺻ ������ ȣ�� (�ν��Ͻ� ���� ����)
		//    �⺻������ �����Ǵ� ������ ũ��� ��16��

		System.out.println("���� ũ�� : " + sb3.capacity());
		// ���� ũ�� : 16

		System.out.println(sb3);
		// �ϰ͵� ���� ��
		
		/*
		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);
		ȫ�浿�̼��Ű�����
		*/

		sb3.append("seoul");		//sb3 += "seoul";
		sb3.append("korea");		//sb3 += "korea";
		sb3.append("�츮����");		//sb3 += "�츮����";
		sb3.append("���ѹα�");		//sb3 += "���ѹα�";

		System.out.println(sb3);
		// seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());
		// seoulkorea�츮������ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		// ���� ũ�� : 34
		
		/////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		// JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		// java and oracle

		// System.out.println(sb3.toUpperCase());
		// System.out.println(sb3.toLowerCase());

		// StringBuffer �� toUpperCase / toLowerCase ��� ����..
		//    Ŭ����    �ȿ�         �޼ҵ�   ����...

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		System.out.println(sb3.toString().toUpperCase());
		/*
		java and oracle
		SEOULKOREA�츮������ѹα�
		SEOULKOREA�츮������ѹα�
		*/
		
		// seoulkorea�츮������ѹα�

		// �� ��� ���ڿ� (sb3) �� seoul �տ�
		//    "�ѱ�" �̶�� ���ڿ� �߰�
		//    �� �ѱ�seoulkorea�츮������ѹα�

		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� ���ѱ� �߰��� : " + sb3.toString());
		//  seoul �տ� ���ѱ� �߰��� : �ѱ�seoulkorea�츮������ѹα�

		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//    "���" �̶�� ���ڿ� �߰�
		//    ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�..

		// �׽�Ʈ ��
		System.out.println(sb3.toString());
		//�ѱ�seoulkorea�츮������ѹα�
		

		// �׽�Ʈ ��
		//sb3.insert(12, "���");
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());

		// �׽�Ʈ ��
		System.out.println(sb3.indexOf("korea"));
		// 7

		// �׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));
		// �ѱ�seoul���korea�츮������ѹα�
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "���"));
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "���"));
		// �ѱ�seoulkorea����츮������ѹα�


		// �� ��� ���ڿ�(sb3) ����
		//    ���츮���󡻹��ڿ� ����
		// sb3.delete(14, 18);
		// System.out.println(sb3);
		// �ѱ�seoulkorea������ѹα�

		System.out.println(sb3.indexOf("�츮����"));
		sb3.delete((sb3.indexOf("�츮����")), sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		// �ѱ�seoulkorea������ѹα�

		// �� ��� ���ڿ�(sb3) ����
		//    ��korea������ ���ڿ� ����
		// sb3.delete(7, 18);
		//System.out.println(sb3);
		// �ѱ�seoul
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		// �ѱ�seoul

		//////////
		// ���� ũ�� Ȯ��

		System.out.println("���� ũ�� : " + sb3.capacity());
		// ���� ũ�� : 34
		// ����ũ��� ���ʿ� ����.
		// ���ڿ� sb3 �� ���� Ȯ��
		System.out.println("���ڿ� ���� : " + sb3.length());
		// 7

		// ���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���....
		sb3.trimToSize();

		// ���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity()); 
		// ���� ũ�� : 7

		
		



	}
}

