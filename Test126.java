class InnerOuterTest
{
	static int a = 10;
	int b = 20;

	class InnerNested
	{
		int c = 30;

		void write()	// inner �� write()
		{
			System.out.println("inner �� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);

		}
	}

	void write()		// outer �� write()
	{
		System.out.println("outer �� write()...");

		InnerNested ob1 = new InnerNested();
		ob1.write();		// inner �� write() �޼ҵ� ȣ��
	}
}


// main Ŭ����
public class Test126
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	// outer�� write()�޼ҵ� ȣ��
		/*
		outer �� write()...
		inner �� write()...
		a : 10
		b : 20
		c : 30
		*/

		//InnerNested ob3 = new InnerNested();
		// ���� �߻�

		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		// ���� �߻�

		// ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		// �ܺ� Ŭ������ �ν��Ͻ� (��ü)�� ������� �ʰ�
		// �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� �����Ұ����ϴ�.
		// �� �ܺ� Ŭ������ ��ü�� ����ϸ� ���� Ŭ������ ��ü�� �����ϴ� ���� ����.

		// Test124.java ���ϰ� ���Ұ�!!
		
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		/*
		inner �� write()...
		a : 10							�� ����
		b : 20							�� ����
		c : 30
		*/

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		                               // ------------------
									   //          ��> ob2�� �̹� �����
		ob6.write();
		/*
		inner �� write()...
		a : 10
		b : 20
		c : 30
		*/

		/*
		outer Ŭ������.innerŬ������ ���������� = new outer������().new inner ������();
		*/

		/*
		cf static �� ��ø ���� Ŭ����
		outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();
		*/

		

		
	}
}