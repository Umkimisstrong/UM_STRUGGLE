/*=========================
  ����Ŭ���� ��ޡ���
=========================*/

// �������̽�(Interface)

interface ADemo
{
	public void write();
}

interface BDemo
{
	public void print();
}




//class DemoImpl	extends ADemo, BDemo
//class DemoImpl	implements ADemo, BDemo
//   �߻� Ŭ����(�޼ҵ� �������̵� ��)
//abstract class DemoImpl	implements ADemo, BDemo
//		��
//   ���� Ŭ����(�޼ҵ� �������̵� ��)
class DemoImpl	implements ADemo, BDemo
{
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带
	// �������̵� �� ��
	// @Override ������̼��� ����� �� ����.
	// JDK 1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵� �� ����
	// JDK 1.5������ @Override ������̼� ����̰����ϴ�.
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}







// main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();  // -- �������̽��� �ȉ�
		//BDemo ob = new BDemo();  // -- �������̽��� �ȉ�

		// ADemo BDemo�� ������ Ŭ���� DemoImpl ����� �ν��Ͻ� ����
		
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		/*
		ADemo �������̽� �޼ҵ� write()...
		BDemo �������̽� �޼ҵ� print()...
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
	

		ADemo ob2 = new DemoImpl();		// ��ĳ����
		BDemo ob3 = new DemoImpl();		// ��ĳ����

		//ob2.print();			] �Ѵ�
		//ob3.write();			] ����

		ob3.print();
		ob2.write();
		/*
		BDemo �������̽� �޼ҵ� print()...
		ADemo �������̽� �޼ҵ� write()...
		*/

		((BDemo)ob2).print();
		((ADemo)ob3).write();
		/*
		BDemo �������̽� �޼ҵ� print()...
		ADemo �������̽� �޼ҵ� write()...
		*/
		// DemoImpl Ŭ������ �� �������̽��� ��� �����߱� ������ ����.
		// ����, DemoImpl Ŭ������ �̵� �� �� �������̽��� �����ߴٸ�
		// �� ������ ��Ÿ�� ���� �߻��ϴ� ������ �ȴ�.

		//�ٿ�ĳ����
		((DemoImpl)ob3).write();
		//ADemo �������̽� �޼ҵ� write()...





	}
}

// ���� ���

/*
ADemo �������̽� �޼ҵ� write()...
BDemo �������̽� �޼ҵ� print()...
BDemo �������̽� �޼ҵ� print()...
ADemo �������̽� �޼ҵ� write()...
BDemo �������̽� �޼ҵ� print()...
ADemo �������̽� �޼ҵ� write()...
ADemo �������̽� �޼ҵ� write()...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/