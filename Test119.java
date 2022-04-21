/*=========================
  ����Ŭ���� ��ޡ���
=========================*/

// �������̽�(Interface)

/*

�� �������̽�(Interface)��

   ������ �̿ϼ���  ä�� ������
   �������̽� �ȿ� �����ϴ� �� � �޼ҵ嵵
   ��ü(���Ǻ�)�� ���� ������ ��ǻ� ���� �κ��� �������� �ʴ´�.
   Ŭ������ ���� ���ø����ν��� ����� �����ϴ� �߻� Ŭ������ �� �����̴�.

�� �������̽��� Ŭ������ �޸� ���� ����� �����ϸ�
   �������̽� ��ü�� ��ӵȴ�.
   ������ C++ ��� ��� �����Ǵ� ���� �����
   ��� �������� ���� �������� ������ױ� ������
   �ڹٿ����� ���� ����� ������ �������̽� ��� �������� �����Ͽ�
   �������̽��� ���� ���� ����� �����ϴ� ����� �����Ѵ�.

�� �������̽��� ����� �߻� �޼ҵ常 ���� �� ������
   �������̽� ���� �޼ҵ���� �������������ڸ� ������� �ʾƵ�
   ��public������ �����Ǿ� Ŭ�������� ����(implements)�����ν�
   �ٷ� ������ �̷���� �� �ִ�.  (�Ϲ������� Ŭ������ default �̳�, �������̽��� public ���� �����ȴ�.)

�� Ư¡
    - �߻� Ŭ������ �������� ���� �ְ� ���ǰ� ����. (��ü ���� �Ұ�)

	- final ������ ���� �� �ִ�.(����� ����)

	- �������̽��� ��public static final������� ���� �� �ִ�.

	- �������̽��� �����ϱ� ���ؼ��� ��extends����ſ�
	  ��implements���� �̿��Ѵ�.

    - �ϳ� �̻��� �������̽��� implements �� �� �ִ�.   extends A / implements A, B, C ...

	- �������̽��� implements �� Ŭ������
	  �������̽��� ��� �޼ҵ带 Overriding �ؾ� �Ѵ�.

	- �������̽��� �ٸ��������̽��� ��ӹ��� �� ������
	  �� ��, ��extends��Ű���带 ����Ѵ�.
	  ���� Ŭ������ �޸� �������̽��� ���� ����� �����ϴ�.     interface �������̽� extends A, B, C ...

*/

// �������̽�
interface Demo
{
	public static final double PI = 3.141592;

	// �������̽��� ���������
	// ��static final���� ������ ������� �ʾƵ�
	// �ڵ����� ��static final���� ����!
	public int a = 10;

	// �������̽��� �޼ҵ�� ����.......����    
	// �ڵ����� ��abstract���� ����
	// public abstract void print(); �� �������� ���̴�.
	public void print();
	/*
	{
		System.out.println("PI : " + PI);			// ���Ǳ��� �������
	}
	*/
}

// Ŭ����
// class DemoImpl	extends Demo (��)
// class DemoImpl	implements Demo(������ �߻�Ŭ����) 
//         :
//         :
// �߻� Ŭ���� - �������̽��� �����ϴ� �߻� Ŭ����
// abstract class DemoImpl	implements Demo
//         :
// Ŭ���� - �������̽��� �����ϴ� Ŭ����
class DemoImpl	implements Demo
{
	@Override
	public void print()
	{
		System.out.println("�������̽� �޼ҵ� ������");
	}


	public void write()
	{
		System.out.println("Ŭ������ ���ǵ� �޼ҵ�");
	}
}




// main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo();	 �Ұ�
		//DemoImpl ob = new DemoImpl();
		// -- print() �޼ҵ� ������ �� ����!
		
		//DemoImpl obTemp = new DemoImpl();
		//Demo ob = (Demo)obTemp;
		//Demo ob = obTemp;

		Demo ob = new DemoImpl();
		ob.print();
		// �������̽� �޼ҵ� ������
		//ob.write(); ������ ���� error: cannot find symbol

		// �� �ٿ�ĳ����
		((DemoImpl)ob).write();
		// Ŭ������ ���ǵ� �޼ҵ�
		System.out.println(Demo.PI);
		// 3.141592 (static --- Ŭ���������̱⶧���� ����)
		System.out.println(Demo.a);
		// 10 (static �Ⱥ������� �ڵ����� static �ݿ�, ---- Ŭ���������̱⶧���� ����)
		
		// Demo.a = 30;
		// ������ ���� -- cannot assign a value to final variable a(final �Ǽ� ���ٲ��~~)





	}
}