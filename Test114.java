/*==============================
    ���� Ŭ���� ���� ����
==============================*/

// ���(Inheritance)

// �� ��super��

//     static ���� ������� ���� �޼ҵ忡�� ���Ǹ�
//     ���� Ŭ������ ��ӹ��� ���� Ŭ������ ��ü�� ����Ų��.
//     super �� ���� Ŭ������ �����ڸ� ȣ���ϰų�
//     ���� Ŭ������ ��� ���� �Ǵ� �޼ҵ带 ȣ���� �� ����� �� �ִ�.

//     ���� Ŭ������ �����ڿ��� ���� Ŭ������ �����ڸ� ȣ���� ������
//     ���� Ŭ������ ������ ���� �������� �� ó������ ��ġ�� �� �ִ�.



// ��  �����ڿ� Ŭ���� ��� ���� ����

//     ���� Ŭ������ ���� Ŭ������ ����� ��ӹ�����,
//     �����ڴ� ��� ��󿡼� ���ܵȴ�.
//     �׸��� ���� Ŭ������ �����ڰ� ȣ��� ��
//     �ڵ����� ���� Ŭ������ �����ڸ� ȣ���ϰ� �ȴ�.
//     �� ��, ���� Ŭ������ �����ڴ�
//     �μ��� ���� ������(default ������ ����)�� ȣ��ȴ�.

//     ���� Ŭ���� �� ���� Ŭ����(��, ��� ���迡 �ִ� Ŭ����)�� �����ϴ� ��������
//     ���� Ŭ������ �����ڸ� ��������(�ۼ�����) �ʰų�
//     �μ��� ���� �����ڸ��� ������(�ۼ���) ���
//     ���������� ���� Ŭ�������� ���� Ŭ������ �����ڸ� ȣ������ �ʾƵ�
//     �ƹ��� ������ �߻����� ������
//     ���� Ŭ������ ���ڰ� �ִ� �����ڸ� �����ϴ� ��쿡��
//     �����ؾ� �Ѵ�.

//     ���� ���... ��������...

/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super();
		}
	}
*/
// ����Ŭ������ B_Ŭ������ �����ڿ���
// ���������� A_class �� �����ڸ� ȣ������ ������
// �ڵ����� ���ڰ� ���� �����ڸ� ȣ���Ѵ�.
// ������, A_class ���� ���ڰ� �ִ� �����ڸ� �����ϰ�
// ���ڰ� ���� �����ڴ� �������� �ʱ� ������ ������ �߻��Ѵ�.
// ����, B_class �������� ���ο�
// ����ó�� ���������� ���� Ŭ������ ������ ȣ�� ������ �ۼ��ؾ� �Ѵ�.
/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super(10);
			..
			..
		}
	}
*/

/*
�� ��� �� ������ ����
  
   ���� Ŭ�������� ����� ��� ������ �̸���
   ���� Ŭ�������� ����� ��� ������ �̸��� ������
   ���� Ŭ������ ��� ������ ���õȴ�.
   �� ��, ���� Ŭ������ ��������� ����ϱ� ���ؼ���
   ��super�� Ű���带 �̿��Ѵ�.

   ������ �̸��� ��� ������ ������ �̸��� �޼ҵ尡
   �� Ŭ���� �ȿ� ����ǰų� ���ǵǴ� ��� �⺻������ ������ �߻��Ѵ�.
   ��, �޼ҵ��� ��쿡�� �Ű������� ������ Ÿ���� �ٸ� ���
   ������ �߻����� �ʰ� �̵��� ���� �ٸ� �޼ҵ�� ����ϰ� �ȴ�.
*/











class SuperTest114  // (Re 114 / Cir 114�� �θ�)
{
	protected double area;
	private String title;
	
	public SuperTest114()
	{
		System.out.println("SuperTest114... ���ھ��� ������");
	}
	public SuperTest114(String title)
	{
		this.title = title;
		System.out.println("SuperTest114... ���ڿ��� ���ڷ� �޴� ������");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}

}

// SuperTest114 Ŭ������ ��ӹ޴� �ڽ�Ŭ����
class Rect114 extends SuperTest114
{

	/* 1. ��ü �����ޱ� 2. ������ ���� 3. ��������������(private) ��� ���� �Ұ�

	protected double area;

	public void write()
	{
		System.out.println(title + " - " + area);
	}
	*/


	private int w, h;

	// �ڽ� ������ ����� ���� ������
	public Rect114()
	{
		// �ڵ����� �θ�����ڸ� ȣ���ϴ� ������ ���� �ȴ�.
		// =���ڰ� ���� �θ������
		// super();	�� ��SuperTest();����� �ǹ�
	}

	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w + this.h;
		write();
	}

	@Override	// -- ������̼�(Annotation) - metadata - JDK 1.5 -- �����Ϸ����� �˷�����
	public void write()
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("�簢�� : " +  area);
	}
	// �� ���޼ҵ� �������̵�(Method Overriding)��
	//
	//    ����Ŭ������ ��ӹ��� ����Ŭ��������
	//    ���� Ŭ������ ���ǵ� �޼ҵ带 �ٽ� �����ϴ� ������(������)
	//    ��ü ���� ���α׷����� Ư¡�� �������� ��Ÿ����.
	//    ������(Overriding)�� �ݵ�� ��� ���迡 �־�� �ϸ�,
	//    �޼ҵ� �̸�, ���� Ÿ��, �Ű������� ������ Ÿ����
	//    ������ ��ġ�ؾ� �Ѵ�.
}


// SuperTest114 Ŭ������ ��ӹ޴� �ڽ�Ŭ����
class Circle114 extends SuperTest114
{

	/* 1. ��ü �����ޱ� 2. ������ ���� 3. ��������������(private) ��� ���� �Ұ�

	protected double area;

	public void write()
	{
		System.out.println(title + " - " + area);
	}
	*/

	// �ڽ� Ŭ������ ����� ���� ������
	public Circle114(String title)
	{
		//super();
		super(title);
	}

	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();
		//  == this.write();
		//  == super.write();
	}
}



// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����

public class Test114
{
	public static void main(String[] args)
	{
		Rect114 ob1 = new Rect114();
		//--==>> SuperTest114... ���ھ��� ������

		//Circle114 ob2 = new Circle114();
		// --==>> ���� �߻�(������ ����)
		// -- ���� Circle114 Ŭ��������
		//    �Ű������� �ʿ�� �ϴ� ����� ���� �����ڰ� ������� ������
		//    �̷� ���� default �����ڰ� �ڵ����� ���Ե��� �ʴ� ��Ȳ.

		ob1.calc(10, 5);
		// w : 10, h : 5
		// �簢�� : 15.0

	}
}

/*
=================================================================================================================================================================================
 ���� Ŭ����        |    ���� Ŭ����        |      ���
 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 �����ڸ�           | ������ ���� ����      |�� �����ϴ�.
 ��������           | �μ��� ���� ������    |�� �����ϴ�.
 ����               | �μ��� �ִ� ������    |�� �����ϴ�.
 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 �μ���             | ������ ���� ����      |�� �����ϴ�.
 ����               | �μ��� ���� ������    |�� �����ϴ�.
 �����ڸ� ����      | �μ��� �ִ� ������    |�� �����ϴ�.
 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 �μ���             | ������ ���� ����      |�� ���� �߻�
 �ִ�               | �μ��� ���� ������    |�� ���� Ŭ������ �ش� �����ڸ� ȣ������ ������ ���� �߻�.
 �����ڸ� ����      | �μ��� �ִ� ������    |�� ���� Ŭ������ �ش� �����ڸ� ȣ������ ������ ���� �߻�.
=================================================================================================================================================================================
*/